drop database if exists ejercicio8;
create database if not exists ejercicio8;
use ejercicio8;
create table salesman (
	id int unsigned primary key auto_increment,
    Name_salesman varchar(30),
    city varchar(100),
    commission decimal(5.2)
);

create table customer(
id int unsigned primary key auto_increment,
cust_name varchar(30),
city varchar(100),
grade varchar(100)
);

create table orders(
ord_no int,
purch_amt decimal(8.2),
ord_date date,
customer_id int unsigned,
salesman_id int unsigned,
foreign key (customer_id)
references customer(id),
foreign key (salesman_id)
references salesman(id)
);

INSERT INTO salesman (name_salesman, city, commission) VALUES 
('Juan Pérez', 'Ciudad de México', 2000),
('María García', 'Madrid', 5000),
('Carlos López', 'Buenos Aires', 9000),
('Ana Martínez', 'São Paulo', 3000),
('Pedro Rodríguez', 'Lima', 1000),
('Luisa Fernández', 'Bogotá', 200),
('Diego González', 'Santiago', 10000),
('Laura Sánchez', 'Lisboa', 9000),
('Roberto Ramírez', 'Quito', 2000),
('Elena Gómez', 'Caracas', 5000);


INSERT INTO customer (cust_name, city, grade) VALUES 
('Empresa A', 'Ciudad de México', 'A'),
('Empresa B', 'Madrid', 'B'),
('Empresa C', 'Buenos Aires', 'C'),
('Empresa D', 'São Paulo', 'B'),
('Empresa E', 'Lima', 'A'),
('Empresa F', 'Bogotá', 'C'),
('Empresa G', 'Santiago', 'B'),
('Empresa H', 'Lisboa', 'A'),
('Empresa I', 'Quito', 'B'),
('Empresa J', 'Caracas', 'C');

INSERT INTO orders (ord_no, purch_amt, ord_date, customer_id, salesman_id) VALUES 
(1, 1000.00, '2024-05-01', 1, 1),
(2, 1500.00, '2024-05-02', 2, 2),
(3, 800.00, '2024-05-03', 3, 3),
(4, 1200.00, '2024-05-04', 4, 4),
(5, 2000.00, '2024-05-05', 5, 5),
(6, 700.00, '2024-05-06', 6, 6),
(7, 900.00, '2024-05-07', 7, 7),
(8, 1800.00, '2024-05-08', 8, 8),
(9, 1300.00, '2024-05-09', 9, 9),
(10, 1600.00, '2024-05-10', 10, 10);

select  min(purch_amt) "menor" , max(purch_amt) "mayor" from orders;



