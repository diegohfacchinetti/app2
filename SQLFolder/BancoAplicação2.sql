create database App2;
use App2;
create table Fornecedor(id_forn int unsigned not null auto_increment,
						razao_forn varchar(60) not null,
                        fantasia_forn varchar(60) not null,
                        cnpj_forn varchar(18) not null,
                        inscr_forn varchar(18) not null,
                        tel_forn varchar(15),
                        primary key(id_forn));
create table Produto(cod_prod  int unsigned not null auto_increment,
					 des_prod varchar (40) not null ,
                     custo_prod double not null,
                     indice_prod decimal (8,3),
                     venda_prod double not null,
                     forn_prod int unsigned not null,
                     estoque_prod int,
                     primary key(cod_prod),
                     foreign key(forn_prod) references Fornecedor (id_forn));
create table Compras(id_compra int unsigned not null auto_increment,
					 num_nota varchar(6) not null,
                     id_forn int unsigned not null,
                     data_compra date,
                     primary key(id_compra),
                     foreign key(id_forn) references Fornecedor (id_forn));                     
create table Itens_compra(id int unsigned not null auto_increment,
						  id_compra int unsigned,
                          id_prod int unsigned,
                          qtd int,
                          valor double,
                          primary key(id),
                          foreign key(id_compra) references Compras (id_compra),
                          foreign key(id_prod) references Produto (cod_prod));
select * from compras;
