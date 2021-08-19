DROP TABLE IF EXISTS trabajador;

CREATE TABLE trabajador (
    id int auto_increment primary key,
    nombre varchar(250),
    trabajo varchar(250),
    salario int
);

INSERT INTO trabajador (nombre, trabajo, salario) VALUES('Joel', 'JUNIOR', 1200);
INSERT INTO trabajador (nombre, trabajo, salario) VALUES('Hugo', 'MID', 1500);
INSERT INTO trabajador (nombre, trabajo, salario) VALUES('Álvaro', 'SENIOR', 1800);
INSERT INTO trabajador (nombre, trabajo, salario) VALUES('Pedro', 'JUNIOR', 1200);
INSERT INTO trabajador (nombre, trabajo, salario) VALUES('Carlos','SENIOR', 1800);