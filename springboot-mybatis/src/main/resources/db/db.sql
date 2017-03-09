drop table if exists customer;
create table customer (
id int not null auto_increment PRIMARY KEY,
name varchar (40),
age int not null,
callid int not null,
description varchar(1000)
);

drop table if exists user;
create table user (
id int not null auto_increment PRIMARY KEY,
name varchar (40),
password varchar(10),
rolelevel varchar(20) not null
);

insert into user (name,password,rolelevel) values ('user','user','ROLE_USER');
insert into user (name,password,rolelevel) values ('root','test123456','ROLE_ADMIN');
