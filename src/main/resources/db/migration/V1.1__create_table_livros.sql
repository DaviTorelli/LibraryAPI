create table if not exists livros (

    id SERIAL not null,
    isbn varchar(13) not null,
    nome varchar(50) not null,
    data_lancamento varchar(10) not null,
    tema varchar(50) not null,
    pais varchar(50) not null,
    autor_id integer not null,

    constraint pk_livro primary key(id),
    constraint fk_livro_autor foreign key(autor_id) references autores(id)

);