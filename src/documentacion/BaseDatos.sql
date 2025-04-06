--Historial de comandos para la base de datos
CREATE DATABASE zeroatmosfera;

use zeroatmosfera;

--Tabla de los objetos
CREATE TABLE Martillo (
	ID INT AUTO_INCREMENT PRIMARY KEY,
	codigo varchar(10),
	proteccion DOUBLE,
	consumo INT,
	sujecion varchar(20),
	Hora_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Ciberexcavadora (
	ID INT AUTO_INCREMENT PRIMARY KEY,
	codigo varchar(10),
	proteccion DOUBLE,
	consumo INT,
	traccion varchar(20),
	Hora_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Cibercompresor (
	ID INT AUTO_INCREMENT PRIMARY KEY,
	codigo varchar(10),
	proteccion DOUBLE,
	consumo INT,
	traccion varchar(20),
	Hora_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Pala (
	ID INT AUTO_INCREMENT PRIMARY KEY,
	codigo varchar(10),
	proteccion DOUBLE,
	long_mango INT,
	metal varchar(20),
	Hora_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

--Insertar datos
INSERT INTO Martillo (codigo, proteccion, consumo, sujecion)
VALUES ('a',2.1,1,'a');

INSERT INTO Ciberexcavadora (codigo, proteccion, consumo, traccion)
VALUES ('a',2.1,1,'a');

INSERT INTO Cibercompresor (codigo, proteccion, consumo, traccion)
VALUES ('a',2.1,1,'a');

INSERT INTO Pala (codigo, proteccion, long_mango, metal)
VALUES ('a',2.1,1,'a');

--Borrar registros de BBDD
TRUNCATE TABLE cibercompresor;
TRUNCATE TABLE ciberexcavadora;
TRUNCATE TABLE pala;
TRUNCATE TABLE martillo;

--Modificar datos
UPDATE nombre_tabla 
SET Objeto_bin = LOAD_FILE('directorio'), 
    Hora_creacion = CURRENT_TIMESTAMP 
WHERE Codigo = 'codigo_del_objeto';

--Usuario
CREATE USER 'lopez'@'%' IDENTIFIED BY 'zero';
GRANT DROP, SESSION, CREATE, SELECT, INSERT, UPDATE, DELETE ON zeroatmosfera.* TO 'lopez'@'%';
FLUSH PRIVILEGES;