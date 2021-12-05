//UC1:create database.
create database pyroll_service;

show databases;

use pyroll_service;

select database();

//UC2:create table with fields.
create table employee_payroll
( id int not null auto_increment,
name varchar(50) not null,
salary Double not null,
startDate date not null,
primary key(id)
);

desc  employee_payroll;


//UC3:insert data.
insert into employee_payroll (name,salary,startDate) values('Shilpa',10000,'2021-10-11');

insert into employee_payroll (name,salary,startDate) values('shama',70000,'2021-9-11');

insert into employee_payroll (name,salary,startDate) values('Shushma',50000,'2021-1-17');

insert into employee_payroll(name,salary,startdate)values('shradha',20000,'2022-05-10');

insert into employee_payroll(name,salary,startdate)values('shweta',30000,'2021-11-15');


UC4:Retrive data.
select * from employee_payroll;

//UC5:To retrive perticular data usding where condition
select * from employee_payroll where name="Shilpa";

select * from employee_payroll where salary=30000;

select * from employee_payroll where startDate between '2021-1-17' And date(now());

select CAST("2017-1-21" as date);

//UC6:alter the table to add column.
alter table employee_payroll add gender char(1);

select * from employee_payroll;

update employee_payroll set gender='f' where name="shilpa";

update employee_payroll set gender='f' where name="shradha";

update employee_payroll set gender='m' where name="sharan";

//UC7: find min.max,avg,count
select gender,min(salary) from employee_payroll;

select gender,max(salary) from employee_payroll;

select gender,avg(salary) from employee_payroll;

select count(salary) from employee_payroll;

select count(gender)from employee_payroll where gender='f';
