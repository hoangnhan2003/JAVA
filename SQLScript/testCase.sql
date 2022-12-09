create database testCaseStudy;
use testCaseStudy;
create table Category(
categoryID int primary key,
categoryName varchar(100)
);
drop table product;
create table product(
name_product nvarchar(100) primary key,
price float ,
quantity int,
color varchar(40),
categoryId int ,
constraint foreign key(categoryId) references category(categoryId));
