CREATE DATABASE Phone_Book;

USE Phone_Book;

CREATE TABLE Contact (
	id int auto_increment primary key,
	lastName varchar(255),
	firstName varchar(255),
	phone varchar(255),
    isRemove boolean
);

SELECT * FROM Contact;

CREATE TABLE calls (
	id int auto_increment primary key,
    call_date DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	contactId INT,
    FOREIGN KEY (contactId) REFERENCES Contact(id)
);

drop table contact;

drop database Phone_Book;