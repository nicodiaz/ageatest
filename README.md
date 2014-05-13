ageatest
========

Grupo AGEA test

Tools / Environment 
-------------------

- Struts 2.3
- Spring 3.2
- Maven 3.0.4 
- Hibernate 4.2
- JDK 1.7
- MySQL Server 5.5 

Instalacion
-----------

- BUILD

```shell
$ cd /path/al/workspace
$ git clone https://github.com/nicodiaz/ageatest.git
$ de ageatest
$ mvn clean install
```

- DB / MySQL

Crear la base de datos (por ejemplo, 'agea_test') en MySql y luego ejecutar el script que se encuentra en la carpeta /doc/sql/agea_test.sql

Los parametros de conexion de la base de datos con el sistema se encuentran en: /src/main/resources/database.properties








