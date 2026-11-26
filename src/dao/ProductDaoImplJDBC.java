package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Product;

public class ProductDaoImplJDBC implements ProductDao {
	private static final String DEFAULT_DB_URL = "jdbc:h2:./data/computercenter_v1_starter;AUTO_SERVER=FALSE";
	private static final String DEFAULT_USER = "sa";
	private static final String DEFAULT_PASSWORD = "";

	private Connection conn;

	@Override
	public void connect() throws SQLException {
		String url = System.getProperty("computercenter.db.url", DEFAULT_DB_URL);
		String user = System.getProperty("computercenter.db.user", DEFAULT_USER);
		String password = System.getProperty("computercenter.db.password", DEFAULT_PASSWORD);

		// TODO RA2-ISSUE-02: obrir la connexio amb DriverManager i guardar-la a conn.
		// Pista: usa url, user i password, i comprova com es declara el connector al pom.xml.
		conn = DriverManager.getConnection(url, user, password);	
		}

	@Override
	public void disconnect() throws SQLException {
		if (conn != null && !conn.isClosed()) {
			conn.close();
		}
	}

	@Override
	public void initSchema() throws SQLException {
		// RA2-ISSUE-03: DDL de l'esquema relacional + alias + seed inicial.
		try (Statement statement = requireConnection().createStatement()) {
			statement.execute("CREATE TABLE IF NOT EXISTS products ("
					+ "id IDENTITY PRIMARY KEY, "
					+ "name VARCHAR(80) NOT NULL UNIQUE, "
					+ "wholesaler_price DECIMAL(10,2) NOT NULL, "
					+ "available BOOLEAN NOT NULL, "
					+ "stock INT NOT NULL)");

			statement.execute("CREATE TABLE IF NOT EXISTS inventory_history ("
					+ "id IDENTITY PRIMARY KEY, "
					+ "product_id BIGINT NOT NULL, "
					+ "action VARCHAR(40) NOT NULL, "
					+ "quantity INT NOT NULL, "
					+ "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, "
					+ "FOREIGN KEY (product_id) REFERENCES products(id))");

			statement.execute("CREATE ALIAS IF NOT EXISTS STOCK_ALERT_LIMIT FOR \""
					+ ProductDaoImplJDBC.class.getName() + ".stockAlertLimit\"");

			int totalProducts = 0;
			try (ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM products")) {
				if (resultSet.next()) {
					totalProducts = resultSet.getInt(1);
				}
			}

			if (totalProducts == 0) {
				statement.executeUpdate("INSERT INTO products(name, wholesaler_price, available, stock) VALUES "
						+ "('SSD 1TB', 60.00, TRUE, 8), "
						+ "('RAM 32GB', 90.50, TRUE, 3), "
						+ "('Teclat mecanic', 45.00, TRUE, 6)");
				System.out.println("[initSchema] Esquema creat i seed inicial inserit (3 productes).");
			} else {
				System.out.println("[initSchema] Esquema ja existent (" + totalProducts + " productes), no es duplica el seed.");
			}
		}
	}

	@Override
	public ArrayList<Product> getInventory() throws SQLException {
		// TODO RA2-ISSUE-07: executar SELECT ordenat i convertir cada fila en Product amb mapProduct().
		throw pending("RA2-ISSUE-07 pendent: implementa consulta d'inventari i recorregut de ResultSet.");
	}

	@Override
	public Product findProductByName(String name) throws SQLException {
		// TODO RA2-ISSUE-07: buscar per nom amb PreparedStatement i retornar null si no hi ha resultat.
		throw pending("RA2-ISSUE-07 pendent: implementa consulta parametritzada per nom.");
	}

	@Override
	public int insertProduct(Product product) throws SQLException {
		// RA2-ISSUE-04: insercio parametritzada amb PreparedStatement.
		String sql = "INSERT INTO products(name, wholesaler_price, available, stock) VALUES (?, ?, ?, ?)";
		try (PreparedStatement preparedStatement = requireConnection().prepareStatement(sql)) {
			preparedStatement.setString(1, product.getName());
			preparedStatement.setDouble(2, product.getWholesalerPrice().getValue());
			preparedStatement.setBoolean(3, product.isAvailable());
			preparedStatement.setInt(4, product.getStock());
			return preparedStatement.executeUpdate();
		}
	}

	@Override
	public int updateStock(String name, int newStock) throws SQLException {
		// RA2-ISSUE-05: actualitzar stock i available (true si l'estoc es major que zero).
		String sql = "UPDATE products SET stock = ?, available = ? WHERE name = ?";
		try (PreparedStatement preparedStatement = requireConnection().prepareStatement(sql)) {
			preparedStatement.setInt(1, newStock);
			preparedStatement.setBoolean(2, newStock > 0);
			preparedStatement.setString(3, name);
			return preparedStatement.executeUpdate();
		}
	}

	@Override
	public int deleteProduct(String name) throws SQLException {
		// RA2-ISSUE-06: eliminar per nom amb PreparedStatement i retornar files afectades.
		String sql = "DELETE FROM products WHERE name = ?";
		try (PreparedStatement preparedStatement = requireConnection().prepareStatement(sql)) {
			preparedStatement.setString(1, name);
			return preparedStatement.executeUpdate();
		} catch (SQLIntegrityConstraintViolationException e) {
			// La FK de inventory_history impedeix esborrar un producte amb historial associat.
			throw new SQLException("No es pot eliminar '" + name + "': te moviments a inventory_history "
					+ "(clau forana product_id). Cal conservar el producte o esborrar abans el seu historial.",
					e.getSQLState(), e.getErrorCode(), e);
		}
	}

	@Override
	public void registerStockChange(String name, int unitsToAdd) throws SQLException {
		// TODO RA2-ISSUE-09: desactivar autoCommit, actualitzar estoc, inserir historial, commit o rollback.
		throw pending("RA2-ISSUE-09 pendent: implementa transaccio commit/rollback.");
	}

	@Override
	public boolean evaluateStockAlertWithProcedure(int stock) throws SQLException {
		// TODO RA2-ISSUE-10: cridar STOCK_ALERT_LIMIT amb CallableStatement i parametre d'entrada.
		throw pending("RA2-ISSUE-10 pendent: implementa procediment o alias amb CallableStatement.");
	}

	public static int stockAlertLimit(int stock) {
		return stock < 5 ? 1 : 0;
	}

	private Product mapProduct(ResultSet resultSet) throws SQLException {
		// TODO RA2-ISSUE-07: crear Product amb name, wholesaler_price, available, stock i assignar id.
		throw pending("RA2-ISSUE-07 pendent: implementa mapatge de ResultSet a Product.");
	}

	private SQLFeatureNotSupportedException pending(String message) {
		return new SQLFeatureNotSupportedException(message);
	}

	private Connection requireConnection() throws SQLException {
		if (conn == null || conn.isClosed()) {
			throw new SQLException("Connexio no disponible. Revisa RA2-ISSUE-02.");
		}
		return conn;
	}
}