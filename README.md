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

- [ ] [RA2-ISSUE-01 · Preparar el projecte JDBC](issues/RA2-ISSUE-01-preparar-projecte-jdbc.md)
- [ ] [RA2-ISSUE-02 · Connector, URL i connexió](issues/RA2-ISSUE-02-revisar-connector-url-connexio.md)
- [ ] [RA2-ISSUE-03 · Estructura relacional](issues/RA2-ISSUE-03-crear-estructura-relacional.md)

### M2 · Operacions relacionals principals

- [ ] [RA2-ISSUE-04 · Inserció de dades](issues/RA2-ISSUE-04-inserir-producte-preparedstatement.md)
- [ ] [RA2-ISSUE-05 · Actualització d'estoc](issues/RA2-ISSUE-05-actualitzar-estoc.md)
- [ ] [RA2-ISSUE-06 · Eliminació controlada](issues/RA2-ISSUE-06-eliminar-producte-controlat.md)
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

### RA2-ISSUE-XX · [títol de l'*issue*]

- Estat: **pendent | en curs | comprovat**
- Persona que l'ha iniciat: **[nom]**
- Problema inicial: **[què no funcionava o què faltava]**
- Decisió aplicada: **[què heu decidit fer i per què]**
- Canvis fets: **[fitxers o parts del projecte modificades]**
- Prova realitzada: **[cas que heu provat i resultat observat]**
- Evidència: **[enllaç a captura, registre, vídeo breu o apartat del repositori]**
- *Commit* o *pull request*: **[enllaç o identificador]**
- Explicació individual: **[què pot explicar cada integrant sobre aquesta tasca]**
- Ús d'IA, si n'hi ha hagut: **[consulta feta, ajuda rebuda i comprovació pròpia]**

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
