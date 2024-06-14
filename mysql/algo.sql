CREATE SCHEMA IF NOT EXISTS db_test;
USE db_test;

CREATE TABLE IF NOT EXISTS db_test.usuarios(
    id_usuarios integer unsigned auto_increment primary key,
    nombre varchar(50),
    edad integer,
    nacionalidad varchar(50)
);

INSERT INTO db_test.usuarios(nombre, edad, nacionalidad) VALUES
    ('David', 28, 'España'),
    ('Matias', 33, 'Colombia'),
    ('Juan', 65, 'Francia');

SELECT * FROM db_test.usuarios;