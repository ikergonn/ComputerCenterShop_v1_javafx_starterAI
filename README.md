# ComputerCenterShop — pràctica integradora RA2

> **Plantilla de l'equip.** Copieu aquest fitxer al vostre repositori de treball i completeu-lo a mesura que avanceu. No inclou solucions de codi: les decisions, proves i explicacions han de ser vostres.

## Fitxa de l'equip

- Integrants: **[Iker Gonzalez]** i **[Andy Villacis]**
- Repositori compartit: **[URL del repositori]**
- Branca de treball habitual: **[nom de la branca]**
- Data d'inici: **[AAAA-MM-DD]**
- Última actualització: **[AAAA-MM-DD]**

## Propòsit del projecte

En aquesta pràctica desenvolupem una aplicació Java que accedeix a una base de dades relacional amb JDBC. Treballem sobre el projecte *starter* indicat pel professorat i fem servir el backlog RA2 per organitzar les tasques, els commits, les proves i les decisions tècniques.

El repositori ha de mostrar el procés de treball real de l'equip. No es tracta només d'arribar a una aplicació que s'executi: també cal poder explicar què s'ha canviat, com s'ha comprovat i per què la decisió correspon a cada *issue*.

## Punt de partida

- Repositori *starter* utilitzat: **[URL o nom del repositori]**
- Gestor de base de dades relacional utilitzat: **[indiqueu-lo]**
- Connector utilitzat: **[indiqueu-lo]**
- Entorn de desenvolupament: **[indiqueu-lo]**
- Comandament o acció que fem servir per comprovar l'execució: **[completeu-lo]**

> No incorporeu ORM, Hibernate, ObjectDB, MongoDB, serveis externs ni persistència principal en fitxers. Aquests elements no formen part de RA2.

## Com treballem cada *issue*

1. Llegim l'objectiu i els criteris d'acceptació de l'*issue*.
2. Acordem què ha de canviar i qui inicia la feina.
3. Fem canvis petits i comprensibles, amb *commits* que expliquin la decisió.
4. Provem el comportament esperat i en guardem una evidència.
5. Actualitzem aquest README amb el resultat, la prova i l'enllaç al *commit* o a la *pull request*.
6. Tanquem l'*issue* només quan l'equip pot explicar individualment la solució aplicada.

## Progrés del backlog

Marqueu una tasca quan la prova i el rastre al repositori estiguin recollits. Els enllaços apunten a l'enunciat, no a una solució.

### M1 · Base JDBC operativa

- [x] [RA2-ISSUE-01 · Preparar el projecte JDBC](issues/RA2-ISSUE-01-preparar-projecte-jdbc.md)
- [x] [RA2-ISSUE-02 · Connector, URL i connexió](issues/RA2-ISSUE-02-revisar-connector-url-connexio.md)
- [x] [RA2-ISSUE-03 · Estructura relacional](issues/RA2-ISSUE-03-crear-estructura-relacional.md)

### M2 · Operacions relacionals principals

- [x] [RA2-ISSUE-04 · Inserció de dades](issues/RA2-ISSUE-04-inserir-producte-preparedstatement.md)
- [x] [RA2-ISSUE-05 · Actualització d'estoc](issues/RA2-ISSUE-05-actualitzar-estoc.md)
- [x] [RA2-ISSUE-06 · Eliminació controlada](issues/RA2-ISSUE-06-eliminar-producte-controlat.md)
- [ ] [RA2-ISSUE-07 · Consultes i resultats](issues/RA2-ISSUE-07-consultar-inventari-resultset.md)

### M3 · Robustesa JDBC

- [ ] [RA2-ISSUE-08 · Tancament de recursos](issues/RA2-ISSUE-08-tancar-recursos.md)
- [ ] [RA2-ISSUE-09 · Transaccions](issues/RA2-ISSUE-09-transaccio-commit-rollback.md)
- [ ] [RA2-ISSUE-10 · Procediment amb paràmetres](issues/RA2-ISSUE-10-procediment-parametres.md)
- [ ] [RA2-ISSUE-11 · Errors de connexió i operacions](issues/RA2-ISSUE-11-errors-connexio-recursos.md)

### M4 · Documentació i tancament

- [ ] [RA2-ISSUE-12 · Documentar l'execució i la configuració](issues/RA2-ISSUE-12-documentar-execucio-configuracio.md)
- [ ] [RA2-ISSUE-13 · Preparar el lliurament de la pràctica](issues/RA2-ISSUE-13-lliurament-practica-integradora.md)

## Registre de treball

Dupliqueu aquest bloc per a cada *issue* que completeu. Escriviu amb les vostres paraules i enllaceu només proves i *commits* del vostre repositori.

### RA2-ISSUE-01 · [títol de l'*issue*]

- Estat: comprovat**
- Persona que l'ha iniciat: **[Iker]**
- Problema inicial: **[Calia comprovar que el projecte estigués preparat per treballar amb JDBC i H2.]**
- Decisió aplicada: **[He decidit revisar la configuració del projecte abans de començar a implementar la connexió.]**
- Canvis fets: **[He revisat el fitxer pom.xml i la classe ProductDaoImplJDBC y ha sigut necessari modificar el codi.]**
- Prova realitzada: **[Hem executat el projecte i hem comprovat que s'obre correctament la pantalla inicial.]**
- Evidència: **[https://github.com/ikergonn/ComputerCenterShop_v1_javafx_starterAI/issues/1#issuecomment-7014236235]**
- *Commit* o *pull request*: **[enllaç o identificador]**
- Explicació individual: **[He revisat el pom.xml per comprovar que hi havia la dependència H2 i els TODOs de les següents issues.]**
- Ús d'IA, si n'hi ha hagut: **[Hem utilitzat ChatGPT per resoldre dubtes que no entendiem i tambe en algun problema que ens ha surtit al executar eclipse que no te res a veure amb els exercicis.]**### RA2-ISSUE-XX · [títol de l'*issue*]



### RA2-ISSUE-02 · [ Implementar connector, URL i connexio*]

- Estat: comprovat**
- Persona que l'ha iniciat: **[Andy]**
- Problema inicial: **[El mètode connect() estava incomplet i no permetia connectar amb la base de dades H2.]**
- Decisió aplicada: **[He decidit utilitzar DriverManager.getConnection per poder fer la connexió amb la base de dades.]**
- Canvis fets: **[He modificat el mètode connect() de la classe ProductDaoImplJDBC, he mantingut les propietats de sistema i he guardat la connexió a la variable conn.	]**
- Prova realitzada: **[Hem executat el projecte i hem comprovat que ja no surt l'error de la Issue 02 i que ara surt el de la Issue 03.]**
- Evidència: **[https://github.com/ikergonn/ComputerCenterShop_v1_javafx_starterAI/issues/2#issuecomment-7106587529]**
- *Commit* o *pull request*: **[enllaç o identificador]**
- Explicació individual: **[He utilitzat DriverManager.getConnection amb la URL, l'usuari i la contrasenya per poder connectar amb H2.]**
- Ús d'IA, si n'hi ha hagut: **[He utilizat la IA per algun dubte que no acababa de entendre.]**


### RA2-ISSUE-03 · [Implementar estructura relacional]

- Estat: comprovat**
- Persona que l'ha iniciat: **[Andy	]**
- Problema inicial: **[El mètode initSchema() estava incomplet i no es creaven les taules de la base de dades.]**
- Decisió aplicada: **[He decidit utilitzar Statement amb try-with-resources per crear les taules i tancar els recursos automàticament.]**
- Canvis fets: **[He modificat el mètode initSchema() de la classe ProductDaoImplJDBC, he creat les taules products i inventory_history amb la clau forana, he creat l'alias STOCK_ALERT_LIMIT i he afegit tres productes inicials.]**
- Prova realitzada: **[Hem executat el projecte i hem comprovat que les dues taules es creen correctament, que l'alerta d'estoc funciona i que els productes no es dupliquen. Ara podem accedir a l'inventari però encara surt l'error de la Issue 07.]**
- Evidència: **[https://github.com/ikergonn/ComputerCenterShop_v1_javafx_starterAI/issues/3#issuecomment-7140245243]**
- *Commit* o *pull request*: **[enllaç o identificador]**
- Explicació individual: **[He utilitzat Statement per executar les consultes SQL, crear les taules i afegir els tres productes inicials només si la taula està buida.]**
- Ús d'IA, si n'hi ha hagut: **[Hem utilitzat ChatGPT per resoldre dubtes que no enteníem sobre les consultes SQL]**

### RA2-ISSUE-04 · [Implementar insercio amb PreparedStatement]

- Estat: comprovat**
- Persona que l'ha iniciat: **[Iker]**
- Problema inicial: **[El mètode insertProduct() estava incomplet i no permetia afegir productes a la base de dades.]**
- Decisió aplicada: **[He decidit utilitzar PreparedStatement per inserir productes amb una consulta SQL parametritzada.]**
- Canvis fets: **[He modificat el mètode insertProduct() de la classe ProductDaoImplJDBC, he importat PreparedStatement i he assignat els paràmetres del nom, preu, disponibilitat i estoc.]**
- Prova realitzada: **[Hem revisat el codi per comprovar que la consulta està parametritzada i que executeUpdate() retorna les files afectades. Falta documentar la prova d'inserció.]**
- Evidència: **[https://github.com/ikergonn/ComputerCenterShop_v1_javafx_starterAI/issues/4#issuecomment-7140917564]**
- *Commit* o *pull request*: **[enllaç o identificador]**
- Explicació individual: **[He utilitzat PreparedStatement per afegir productes a la base de dades i executeUpdate() per retornar les files afectades.]**
- Ús d'IA, si n'hi ha hagut: **[Hem utilitzat ChatGPT per resoldre dubtes que no enteníem sobre PreparedStatement]**

### RA2-ISSUE-05 · [Implementar actualitzacio d'estoc]

- Estat: comprovat**
- Persona que l'ha iniciat: **[Andy]**
- Problema inicial: **[El mètode updateStock() estava incomplet i no permetia modificar l'estoc ni la disponibilitat dels productes.]**
- Decisió aplicada: **[He decidit utilitzar una sentència UPDATE amb PreparedStatement per modificar l'estoc del producte segons el seu nom.]**
- Canvis fets: **[He modificat el mètode updateStock() de la classe ProductDaoImplJDBC perquè actualitzi l'estoc i la disponibilitat del producte i retorni les files afectades.]**
- Prova realitzada: **[Hem executat el projecte i hem canviat l'estoc del Monitor samsung de 10 a 20 unitats. Després hem posat l'estoc a 0 i hem comprovat des de la base de dades que el camp available passa a FALSE.]**
- Evidència: **[https://github.com/ikergonn/ComputerCenterShop_v1_javafx_starterAI/issues/5#issuecomment-7196371615]**
- *Commit* o *pull request*: **[enllaç o identificador]**
- Explicació individual: **[He utilitzat PreparedStatement per actualitzar l'estoc i he fet que el producte estigui disponible quan l'estoc és superior a zero i que deixi d'estar disponible quan és zero.]**
- Ús d'IA, si n'hi ha hagut: **[Hem utilitzat ChatGPT per resoldre dubtes que no enteníem]**

### RA2-ISSUE-06· [Implementar eliminacio de productes]

- Estat: comprovat**
- Persona que l'ha iniciat: **[Iker]**
- Problema inicial: **[El mètode deleteProduct() estava incomplet i no permetia eliminar productes de la base de dades.]**
- Decisió aplicada: **[He decidit utilitzar una sentència DELETE amb PreparedStatement per eliminar els productes segons el seu nom.]**
- Canvis fets: **[He modificat el mètode deleteProduct() de la classe ProductDaoImplJDBC perquè elimini productes, retorni les files afectades i mostri un missatge d'error quan el producte té historial associat.]**
- Prova realitzada: **[Hem executat el projecte i hem eliminat el producte Teclat mecanic. També hem intentat eliminar el SSD 1TB i hem comprovat que no es pot eliminar perquè té historial associat. Finalment hem comprovat que si el producte no existeix retorna 0 files eliminades.]**
- Evidència: **[https://github.com/ikergonn/ComputerCenterShop_v1_javafx_starterAI/issues/6#issuecomment-7196718225]**
- *Commit* o *pull request*: **[enllaç o identificador]**
- Explicació individual: **[He utilitzat PreparedStatement per eliminar un producte pel seu nom i executeUpdate() per retornar les files eliminades. També he gestionat l'error dels productes que tenen historial associat.]**
- Ús d'IA, si n'hi ha hagut: **[Hem utilitzat ChatGPT per resoldre dubtes que no enteníem sobre l'eliminació de productes i la gestió dels errors.]**

## Proves que hem de poder repetir


| Cas que comprovem | Dades o condicions inicials | Resultat observat | Evidència |
| --- | --- | --- | --- |
| Arrencada del projecte | **[completeu]** | **[completeu]** | **[enllaç]** |
| Operació de modificació | **[completeu]** | **[completeu]** | **[enllaç]** |
| Consulta de dades | **[completeu]** | **[completeu]** | **[enllaç]** |
| Cas d'error controlat | **[completeu]** | **[completeu]** | **[enllaç]** |
| Operació agrupada o transacció | **[completeu]** | **[completeu]** | **[enllaç]** |

## Decisions i dubtes de l'equip

| Data | *Issue* | Decisió o dubte | Com s'ha resolt | Referència |
| --- | --- | --- | --- | --- |
| **[AAAA-MM-DD]** | **[RA2-ISSUE-XX]** | **[completeu]** | **[completeu]** | **[enllaç]** |

## Ús responsable d'IA

El nivell previst és **IA-1**: podeu usar eines d'IA com a suport per entendre conceptes, formular hipòtesis o revisar una explicació. No substitueixen les proves del projecte ni l'explicació individual.

Si n'heu fet ús, anoteu a l'*issue* corresponent què heu preguntat, què heu contrastat amb el projecte i quina decisió final heu pres. No enganxeu una resposta d'IA com si fos una prova de funcionament.

## Abans de donar la pràctica per preparada

- [ ] Els *issues* P0 tenen un resultat comprovat o una incidència explicada.
- [ ] El repositori conté *commits* que permeten seguir el treball de l'equip.
- [ ] Les proves de funcionament tenen evidències enllaçades.
- [ ] Les decisions sobre connector, consultes, recursos, transaccions i procediments estan explicades amb paraules pròpies.
- [ ] Tots dos integrants poden defensar individualment les decisions tècniques del repositori.
- [ ] El README no inclou solucions copiades ni contingut fora de l'abast de RA2.

---

*Aquesta plantilla és un suport per documentar el treball. El que acredita el procés és el repositori de l'equip, amb els seus canvis, proves, decisions i explicacions.*
