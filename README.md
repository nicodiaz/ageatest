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
- Apache Tomcat/7.0
 

Instalacion
-----------

- DB / MySQL

Crear la base de datos 'agea_test' en MySql y luego ejecutar el script que se encuentra en la carpeta /doc/sql/agea_test.sql
Los datos de conexion se encuentran en el archivo hibernate.properties (user: 'agea', pass: 'agea') 

- BUILD

```shell
$ cd /path/al/workspace
$ git clone https://github.com/nicodiaz/ageatest.git
$ cd ageatest
$ mvn clean install
```

Una vez finalizado de forma exitosa (BUILD SUCCESS), el war se encuentra en la carpeta /target listo para hacer el deploy en Tomcat. 

- Testing

Se encuentran en la carpeta test/ y se pueden ejecutar mediante
$ mvn test






