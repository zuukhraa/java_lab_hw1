create table password_black_list
(
    id serial primary key,
    password char(20) not null
);

insert into password_black_list(password) values ('12345678');
insert into password_black_list(password) values ('00000000');
insert into password_black_list(password) values ('Zukhra3108');
insert into password_black_list(password) values ('Kazan1234');
insert into password_black_list(password) values ('password');
insert into password_black_list(password) values ('superman');
insert into password_black_list(password) values ('javalab2021');
insert into password_black_list(password) values ('itisKFU');
insert into password_black_list(password) values ('instagram1111');
insert into password_black_list(password) values ('skuratovcoffee');
insert into password_black_list(password) values ('time_to_cook');
insert into password_black_list(password) values ('Tatarstan4321');
insert into password_black_list(password) values ('helloworld!');
insert into password_black_list(password) values ('inception2010');
insert into password_black_list(password) values ('LeonardoDiCaprio');
