Create database amicao;

use amicao;	

create table funcionario(
	idfunc int(4) auto_increment primary key,
    nome varchar(40) not null,
    senha varchar(40) not null    
);

create table cliente(
	idcliente int(4) auto_increment primary key,
	nome varchar(20) not null,
    telefone varchar(13) not null,
    email varchar(50) not null,
    endereco varchar(40) not null,
    cpf varchar(14) not null unique    
);

create table animal(
	idanimal int(4) auto_increment primary key,
	nome varchar(40) not null,
    especie varchar(50) not null,
	raca varchar(50) not null,
    sexo enum('M', 'F') not null,
    porte varchar(50) not null,
	id_cliente int,
    foreign key (id_cliente) references cliente(idcliente)
);

create table servicos (
	idservicos int(4) auto_increment primary key,
    horario datetime not null,
    tipo_banho varchar(50) not null,
    observacoes text,
    id_animal int,
    foreign key (id_animal) references animal(idanimal),
    id_func int,
    foreign key (id_func) references funcionario(idfunc)
);