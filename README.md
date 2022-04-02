# apikonecta
# 1 prueba tecnica 1 para konecta

## requisitos previos

## 1. tener instalada una version de jdk java 8 o superior
## 2. motor de base de datos mysql y algun gestor de base de datos 

## 3. para instalar el software se deben seguir los siguientes pasos.




1.  clone el repositorio de github en su maquina local, puede realizarse desde una terminal con el comando git clone https://github.com/villeraluis/apikonecta.git.
2.  crear una base de datos limpia con el nombre preferido(en este caso se usa el nombre konecta2 ), se puede realizar con su gestor preferido(phpmyadmin,workbench,ems..) 
3.  luego ingresar a la carpeta del proyecto con cd apikonecta
4.  habra en un editor de texto como block de notas o editor de codigo el archivo de configuracion de base de datos que se encuetra en: apikonecta\src\main\resources\application.properties
5.  edite la cofiguracion de base de datos conforme a sus datos locales. nombre de base de datos, usuario, clave de usuario de mysql. 
6.  Ejecutar el comando mvnw.cmd spring-boot:run para windows.
7.  esperar que se descargen las dependencias e inicie el servidor de tomcat.
8.  puede consultar la api desde el navegador con la url http://localhost:8080/productos o http://localhost:8080/ventas
9.  En este Punto deberia obtener una respuesta json vacia en caso de no tener datos en la base de datos.

# consulta 1 requrida por la prueba.

1. Realizar una consulta que permita conocer cuál es el producto que más stock tiene.

SELECT * FROM   productos WHERE stock=(SELECT MAX(stock) FROM productos LIMIT 1);

# consulta 1 requrida por la prueba.

2.Realizar una consulta que permita conocer cuál es el producto más vendido.

## se puede revisar una pequeña implementacion inicial que se realizo del frontend desde elsiguiente repositorio y segir los pasos de un proyecto react

https://github.com/villeraluis/frontInicialapikonecta.git
SELECT * FROM productos INNER JOIN (SELECT fk_producto, sum(cantidad_venta) as can_vendidos FROM ventas group by fk_producto ORDER BY can_vendidos DESC LIMIT 1) AS ve ON id=ve.fk_producto;




