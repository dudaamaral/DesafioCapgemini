create database divulgatudo;

use divulgatudo;

create table anuncios(
	id int not null auto_increment,
    nome varchar(100) not null,
    dataInicio date not null,
    dataFinal date,
    primary key(id),
    fk_pessoa int(4) NOT NULL,
    foreign key(fk_pessoa) references pessoa(id),
    fk_investimento int(4) NOT NULL,
    foreign key(fk_investimento) references investimento(id)
);

create table pessoas(
	id int not null auto_increment,
    nome varchar(100) not null,
    ip varchar(15),
    primary key(id)
);

create table investimentos(
	id int not null auto_increment, 
    valor numeric(9,2) not null,
    primary key(id)
);

ALTER USER 'root'@'localhost' IDENTIFIED BY 'root';
FLUSH PRIVILEGES;

INSERT INTO pessoa(id, nome, ip)
VALUES(1,'Eduarda','123.123.123.123');

INSERT INTO investimento(id, valor)
VALUES(1,1000);

INSERT INTO anuncios(id, nome, dataInicio, dataFinal, fk_pessoa, fk_investimento)
VALUES (1,'Divulga Tudo','2021-05-12','2021-05-20',1,1);

SELECT DISTINCT SUM(valor)  
FROM anuncios
INNER JOIN investimentos
ON anuncios.fk_investimento = investimentos.id
INNER JOIN pessoas
ON anuncios.fk_pessoa = pessoas.id
WHERE 1=1;
SELECT * FROM anuncios;