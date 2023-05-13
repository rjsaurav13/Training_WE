show databases;
create database wiley_sql;
create database temp;
drop database temp;
use wiley_sql;
show tables;
create table student (
    rolno int,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255)
);

CREATE TABLE student2 (
    roll int,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255)
);
drop table student2;
INSERT INTO student VALUES (44, 'Kumar', 'saurav', 'Indira Nagar', 'Dehradun');
select * from student;
