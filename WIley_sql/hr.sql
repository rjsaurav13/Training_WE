CREATE DATABASE IF NOT EXISTS hr;
CREATE TABLE departments (
    department_id INT AUTO_INCREMENT PRIMARY KEY,
    dept_name VARCHAR(100)
);
use hr;
select * from departments;
CREATE TABLE employees (
    id int AUTO_INCREMENT primary key,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    department_id int not null,
    FOREIGN KEY (department_id)
        REFERENCES departments (department_id)
);

INSERT INTO departments(dept_name)
VALUES('Sales'),('Markting'),('Finance'),('Accounting'),('Warehouses'),('Production');

INSERT INTO employees(first_name,last_name,department_id) 
VALUES('John','Doe',1),
		('Bush','Lily',2),
		('David','Dave',3),
		('Mary','Jane',4),
		('Jonatha','Josh',5),
		('Mateo','More',1);
create view v_employee_info as
select 
id,first_name, last_name, dept_name
from employees
INNER JOIN
departments using(department_id);

SELECT * FROM tasks;
DROP TABLE tasks;
CREATE TABLE tasks(
    id INT AUTO_INCREMENT,
    task_name VARCHAR(100) NOT NULL UNIQUE,
    lastName VARCHAR(100) NOT NULL,
    starting_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(id), FOREIGN KEY(id) REFERENCES employees(employeeNumber)
    --FOREIGN KEY(lastName) REFERENCES employees(lastName)
);
ALTER TABLE tasks AUTO_INCREMENT=1000;

SET foreign_key_checks = 0;
ALTER TABLE tasks DISABLE KEYS;

INSERT INTO tasks (task_name,lastName) VALUES ("Cooking", "Peterson");

DESCRIBE employees;
SELECT * FROM employees;
SELECT * FROM tasks;