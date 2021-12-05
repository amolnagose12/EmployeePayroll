//UC1
create database AddressBookService;

show databases;

use AddressBookService;

select database();

//UC2
create table Address_book(id int unsigned not null auto_increment,
	
first_name varchar(15) not null,
last_name varchar(10) not null,
    
city varchar(50) not null,
state varchar(50) not null,
    
zip int not null,
phone long not null,
email varchar(100) not null,
 
primary key (id)
);

select * from address_book;

//UC3
insert into Address_Book(first_name, last_name, city, state, zip, phone, email)
values('sharan','lmn','hydrabad','telangana',21345,9662363425,'sharan@gmail.com');
insert into Address_Book(first_name, last_name, city, state, zip, phone, email)
values('Arnab', 'Nath', 'chennai', 'TamilNaru', 7125487, 81494545879, 'arnabnath@gmail.com' );

//UC4
update  Address_book set last_name='dhumal',city='chenai',state='tamilnadu',zip=23345,phone=12356,email='dhumal@gmail.com' 
where first_name='sharan';

//UC5
delete from Address_Book where first_name='shradha';
select * from address_book;

//UC6
SELECT * FROM Address_book
where city = 'hydrabad' or state = 'telanganaa';


//UC7
select COUNT(city or state)
FROM Address_book;

//UC8
select first_name
  from Address_book
  where city = 'telangana'
  order by first_name asc;

//UC9
 Alter table Address_book add type varchar(15) after last_name;

update  Address_book set type='Family' where first_name ='amar';

update  Address_book set type='Friends' where first_name  ='shilpa';

update  Address_book set type='Friends' where first_name  ='sham';

update  Address_book set type='Profession' where first_name  ='sharan';

//UC10
SELECT COUNT(type) AS NumberOfContactPerson 
FROM Address_book;
