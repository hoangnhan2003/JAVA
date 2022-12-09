create database demo;
use demo;
create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);
insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');
update users set name = 'ngonhan11' , email = 'ngonhan@gmail.com' where id =5; 
select * from users where country like "%v%";
select * from users order by name;
DELIMITER $$

CREATE PROCEDURE get_user_by_id(IN user_id INT)

BEGIN

    SELECT users.name, users.email, users.country

    FROM users

    where users.id = user_id;

    END$$

DELIMITER ;

  

DELIMITER $$

CREATE PROCEDURE insert_user(

IN user_name varchar(50),

IN user_email varchar(50),

IN user_country varchar(50)

)

BEGIN

    INSERT INTO users(name, email, country) VALUES(user_name, user_email, user_country);

    END$$

DELIMITER ;
create table Permision(

id int(11) primary key,

name varchar(50)

);

 

create table User_Permision(

permision_id int(11),

user_id int(11)

);
insert into Permision(id, name) values(1, 'add');

insert into Permision(id, name) values(2, 'edit');

insert into Permision(id, name) values(3, 'delete');

insert into Permision(id, name) values(4, 'view');
set sql_safe_updates =0;
delete from user_permision where permision_id < 6;
UPDATE  EMPLOYEE SET SALARY = 99 WHERE NAME = 'Quynh';

delimiter //
create procedure display_list_user()
begin
	select * from users ;
end //
delimiter ;

delimiter //
create procedure update_user(id1 int,name1 varchar(30),email1 varchar(40),country1 varchar(40))
begin 
	update users set name = name1, email = email1,country = country1 
    where users.id = id1;
end //
delimiter ;

update users set users.name = 'dung12', email = 'thuydung@gmail.com',country = 'VN' where users.id = 4;

delimiter //
create procedure delete_user_by_id(id int)
begin
	delete from users where users.id =id;
end //
delimiter ;
call display_list_user();