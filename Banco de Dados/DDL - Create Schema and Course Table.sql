create schema aetherna;

create table curso (
       id integer not null auto_increment,
        descricao varchar(255),
        nome varchar(255),
        modelo varchar(255),
        primary key (id)
    )