CREATE DATABASE Phone_Book;

USE Phone_Book;

CREATE TABLE Contact (
	id int auto_increment primary key,
	lastName varchar(255) not null,
	firstName varchar(255) not null,
	phone varchar(255) not null,
    isRemove boolean not null
);

SELECT * FROM Contact;

CREATE TABLE calls (
	id int auto_increment primary key,
    call_date DATETIME not null,
	contactId INT not null,
    FOREIGN KEY (contactId) REFERENCES Contact(id)
);

SELECT * FROM calls;

drop table contact;

drop database Phone_Book;