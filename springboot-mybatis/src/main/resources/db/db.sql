drop table if exists customer;
create table customer (
id int not null auto_increment PRIMARY KEY,
name varchar (40),
age int not null,
callid int not null,
description varchar(1000)
);

