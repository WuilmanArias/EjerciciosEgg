DROP DATABASE IF EXISTS tienda;
CREATE DATABASE tienda CHARACTER SET utf8mb4;
USE tienda;

CREATE TABLE fabricante (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL,
  codigo_fabricante INT UNSIGNED NOT NULL,
  FOREIGN KEY (codigo_fabricante) REFERENCES fabricante(codigo)
);

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);

SELECT * FROM FABRICANTE;
SELECT * FROM PRODUCTO;

-- 1. Lista el nombre de todos los productos que hay en la tabla producto.
SELECT NOMBRE FROM PRODUCTO;

-- 2. Lista los nombres y los precios de todos los productos de la tabla producto
SELECT NOMBRE, PRECIO
FROM PRODUCTO;

-- 3. Lista todas las columnas de la tabla producto.
SELECT * FROM PRODUCTO;

-- 4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio.
SELECT NOMBRE, ROUND(PRECIO), PRECIO
FROM PRODUCTO;

-- 5. Lista el código de los fabricantes que tienen productos en la tabla producto.
SELECT CODIGO_FABRICANTE 
FROM PRODUCTO;

-- 10. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar los repetidos.
SELECT CODIGO_FABRICANTE 
FROM PRODUCTO
GROUP BY CODIGO_FABRICANTE;

-- 11. Lista los nombres de los fabricantes ordenados de forma ascendente.
SELECT NOMBRE
FROM FABRICANTE
ORDER BY NOMBRE;

-- 12. Lista los nombres de los productos ordenados en primer lugar por el nombre de
-- forma ascendente y en segundo lugar por el precio de forma descendente.
SELECT NOMBRE, PRECIO
FROM PRODUCTO
ORDER BY NOMBRE, PRECIO DESC;

-- 13. Devuelve una lista con las 5 primeras filas de la tabla fabricante.
SELECT * FROM FABRICANTE LIMIT 5;

-- 14. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas
-- ORDER BY y LIMIT)
SELECT NOMBRE, PRECIO 
FROM PRODUCTO 
ORDER BY PRECIO
LIMIT 1;

-- 15. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas
-- ORDER BY y LIMIT)
SELECT NOMBRE, PRECIO 
FROM PRODUCTO 
ORDER BY PRECIO DESC
LIMIT 1;

-- 16. Lista el nombre de los productos que tienen un precio menor o igual a $120.
SELECT NOMBRE, PRECIO FROM PRODUCTO
WHERE PRECIO <= 120;

-- 17. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el
-- operador BETWEEN.
SELECT * FROM PRODUCTO
WHERE PRECIO BETWEEN 60 AND 200;

-- 18. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el
-- operador IN.
SELECT * FROM PRODUCTO
WHERE CODIGO_FABRICANTE IN (1,3,5);

-- 23. Devuelve una lista con el nombre de todos los productos que contienen la cadena
-- Portátil en el nombre.
SELECT * FROM PRODUCTO
WHERE NOMBRE LIKE '%PORTATIL%';

/*Consultas Multitabla
1. Devuelve una lista con el código del producto, nombre del producto, código del
fabricante y nombre del fabricante, de todos los productos de la base de datos.*/
SELECT * FROM PRODUCTO P
INNER JOIN FABRICANTE F
ON F.CODIGO = P.CODIGO_FABRICANTE;

/* 2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de
todos los productos de la base de datos. Ordene el resultado por el nombre del
fabricante, por orden alfabético.*/
SELECT * FROM PRODUCTO P
INNER JOIN FABRICANTE F
ON F.CODIGO = P.CODIGO_FABRICANTE
ORDER BY F.NOMBRE;

-- 3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del
-- producto más barato.
SELECT P.NOMBRE,P.PRECIO,F.NOMBRE
FROM PRODUCTO P
INNER JOIN FABRICANTE F
ON F.CODIGO = P.CODIGO_FABRICANTE
ORDER BY P.PRECIO 
LIMIT 1;

-- 4. Devuelve una lista de todos los productos del fabricante Lenovo.
SELECT *
FROM PRODUCTO P
INNER JOIN FABRICANTE F
ON F.CODIGO = P.CODIGO_FABRICANTE
WHERE F.NOMBRE IN ('Lenovo');

-- 5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un
-- precio mayor que $200.
SELECT *
FROM PRODUCTO P
INNER JOIN FABRICANTE F
ON F.CODIGO = P.CODIGO_FABRICANTE
WHERE F.NOMBRE IN ('Crucial') AND P.PRECIO>200;

-- 6. Devuelve un listado con todos los productos de los fabricantes Asus, HewlettPackard. Utilizando el operador IN.
SELECT *
FROM PRODUCTO P
INNER JOIN FABRICANTE F
ON F.CODIGO = P.CODIGO_FABRICANTE
WHERE F.NOMBRE IN ('Asus', 'Hewlett-Packard');

/*7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de
todos los productos que tengan un precio mayor o igual a $180. Ordene el resultado
en primer lugar por el precio (en orden descendente) y en segundo lugar por el
nombre (en orden ascendente)*/
SELECT P.NOMBRE, P.PRECIO, F.NOMBRE
FROM PRODUCTO P
INNER JOIN FABRICANTE F
ON F.CODIGO = P.CODIGO_FABRICANTE
WHERE P.PRECIO >=180
ORDER BY P.PRECIO DESC;

/*Consultas Multitabla
Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.
1. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto
con los productos que tiene cada uno de ellos. El listado deberá mostrar también
aquellos fabricantes que no tienen productos asociados.*/

SELECT *
FROM PRODUCTO P
RIGHT JOIN FABRICANTE F
ON F.CODIGO = P.CODIGO_FABRICANTE;

/*. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen
ningún producto asociado.*/
SELECT F.NOMBRE
FROM FABRICANTE F
LEFT JOIN PRODUCTO P
ON F.CODIGO = P.CODIGO_FABRICANTE
WHERE P.NOMBRE IS NULL
GROUP BY F.NOMBRE;

/*Subconsultas (En la cláusula WHERE)
Con operadores básicos de comparación
1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
*/


-- 2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).

-- 3. Lista el nombre del producto más caro del fabricante Lenovo.
-- 4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de todos sus productos.


SELECT * FROM FABRICANTE;
SELECT * FROM PRODUCTO;
