--Historial de comandos para la base de datos
CREATE DATABASE zeroatmosfera;

use zeroatmosfera;

--Tabla de los objetos
CREATE TABLE Martillo (
	Codigo varchar(7) CONSTRAINTS codigo_key PRIMARY KEY,
	Objeto_bin longblob,
	Hora_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Ciberexcavadora (
	Codigo varchar(7) CONSTRAINTS codigo_key PRIMARY KEY,
	Objeto_bin longblob,
	Hora_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Cibercompresor (
	Codigo varchar(7) CONSTRAINTS codigo_key PRIMARY KEY,
	Objeto_bin longblob,
	Hora_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

--Insertar datos
INSERT INTO nombre_tabla (Codigo, Objeto_bin)
VALUES ('codigo_del_objeto', LOAD_FILE('directorio');

--Modificar datos
UPDATE nombre_tabla 
SET Objeto_bin = LOAD_FILE('directorio'), 
    Hora_creacion = CURRENT_TIMESTAMP 
WHERE Codigo = 'codigo_del_objeto';

