drop database if exists ejercicio9;
create database if not exists ejercicio9;
use ejercicio9;
create table estudiantes(
id int unsigned primary key not null auto_increment,
nombre char(90),
apellido char(30)
);
create table profesores(
id int unsigned primary key not null auto_increment,
nombre char(50),
apellido char(50)
);

create table curso(
id int unsigned not null auto_increment,
nombre char(40),
id_profesor int unsigned,
primary key (id),
foreign key (id_profesor)
references profesores(id)
);

CREATE TABLE cursos_estudiantes (
    id_curso INT unsigned not null auto_increment,
    id_estudiante INT unsigned,
    FOREIGN KEY (id_curso) REFERENCES curso(id),
    FOREIGN KEY (id_estudiante) REFERENCES estudiantes(id)
);

INSERT INTO estudiantes (nombre, apellido) VALUES 
('María', 'González'),
('Juan', 'Martínez'),
('Ana', 'Rodríguez'),
('Pedro', 'Hernández'),
('Laura', 'López'),
('Diego', 'Pérez'),
('Lucía', 'Gómez'),
('Carlos', 'Díaz'),
('Sofía', 'Torres'),
('Daniel', 'Vásquez');

INSERT INTO profesores (nombre, apellido) VALUES 
('Alejandro', 'García'),
('Fernanda', 'Martínez'),
('Roberto', 'Sánchez'),
('Carolina', 'Hernández'),
('Javier', 'López'),
('Marina', 'Pérez'),
('Andrés', 'Gómez'),
('Camila', 'Díaz'),
('Ricardo', 'Torres'),
('Gabriela', 'Vásquez');

INSERT INTO curso (nombre, id_profesor) VALUES 
('Matemáticas Avanzadas', 1),
('Literatura Española', 2),
('Historia del Arte', 3),
('Programación en C', 4),
('Química Orgánica', 5);

INSERT INTO cursos_estudiantes (id_curso, id_estudiante) VALUES 
(1, 1), -- Juan en Matemáticas Avanzadas
(1, 2), -- María en Matemáticas Avanzadas
(2, 3), -- Ana en Literatura Española
(3, 4), -- Pedro en Historia del Arte
(4, 5), -- Laura en Programación en C
(5, 1); -- Juan en Química Orgánica

SELECT e.nombre, e.apellido, COUNT(ce.id_curso) AS total_cursos
FROM estudiantes e
LEFT JOIN cursos_estudiantes ce ON e.id = ce.id_estudiante
GROUP BY e.id, e.nombre, e.apellido;

