create table team (
    id INT,
    name VARCHAR(50)
);
insert into team (id, name) values (1, 'Pittaway');
insert into team (id, name) values (2, 'Le feuvre');
insert into team (id, name) values (3, 'Boult');
insert into team (id, name) values (4, 'Gransden');
insert into team (id, name) values (5, 'Cannings');
insert into team (id, name) values (6, 'Marlen');
insert into team (id, name) values (7, 'Gristock');
insert into team (id, name) values (8, 'Keher');
insert into team (id, name) values (9, 'Plows');
insert into team (id, name) values (10, 'Sidnall');

create table sponsor (
    id INT,
    name VARCHAR(50)
);
insert into sponsor (id, name) values (1, 'Silverson');
insert into sponsor (id, name) values (2, 'Norree');
insert into sponsor (id, name) values (3, 'Batten');
insert into sponsor (id, name) values (4, 'Martyntsev');
insert into sponsor (id, name) values (5, 'Gilhooley');
insert into sponsor (id, name) values (6, 'Towriss');
insert into sponsor (id, name) values (7, 'Gouth');
insert into sponsor (id, name) values (8, 'Druitt');
insert into sponsor (id, name) values (9, 'Stryde');
insert into sponsor (id, name) values (10, 'Mullaly');

create table player (
    id INT,
    name VARCHAR(50),
    number INT
);
insert into player (id, name, number) values (1, 'Train', 81);
insert into player (id, name, number) values (2, 'Deards', 44);
insert into player (id, name, number) values (3, 'Marini', 85);
insert into player (id, name, number) values (4, 'Gounin', 19);
insert into player (id, name, number) values (5, 'O''Scandall', 19);
insert into player (id, name, number) values (6, 'Rubinovitch', 36);
insert into player (id, name, number) values (7, 'Tavner', 32);
insert into player (id, name, number) values (8, 'Muzzi', 66);
insert into player (id, name, number) values (9, 'Lenglet', 79);
insert into player (id, name, number) values (10, 'Shearsby', 69);