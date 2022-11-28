create table if not exists autores (

    id SERIAL not null,
    nome varchar(50) not null,
    nacionalidade varchar(50) not null,
    nascimento varchar(10) not null,

    constraint pk_autor primary key(id)

);