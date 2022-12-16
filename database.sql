drop database if exists banco;
create database banco;

use banco;

create table user(

id 				int 			primary key 		auto_increment,

nome 			varchar(20)		not null,
sobrenome		varchar(40)		not null,
cpf				decimal(11)		not null,
nascimento		date			not null,
rg				decimal(9)		not null,
saldo			double			default 350.0,
retirada		double			default 0,

username 		varchar(15)				references	login(username)
);

create table login(

username	varchar(15)			not null		primary key,
senha		varchar(20)			not null
);

create table acesso(

id			int					auto_increment	primary key,
data 		datetime			default now(),
username	varchar(15)			references login(username)

);

create table movimentacao(

id				int				primary key			auto_increment,

data 			datetime		default now(),
valor			double			not null,
envio_id		int				references user(id),
destino_id 		int				references user(id)
);



delimiter $

create procedure Cadastro(nome varchar(15), sobrenome varchar(40), 
cpf decimal(11), nascimento date, rg decimal(9), 
username varchar(15), senha varchar(20))

begin

insert into user (nome, sobrenome, cpf, nascimento, rg, username) values(nome, sobrenome, cpf, nascimento, rg, username);
insert into login values(username, senha);

end$



create procedure Transferencia(sender_id int, destino_id int, valor double)

begin

set @sender_saldo = (select user.saldo from user where user.id = sender_id);
set @destino_saldo = (select user.saldo from user where user.id = destino_id);

set @sfinal_sender = (@sender_saldo - valor);
set @dfinal_sender = (@destino_saldo + valor);

UPDATE user SET saldo = @sfinal_sender WHERE user.id = sender_id;
UPDATE user SET saldo = @dfinal_sender WHERE user.id = destino_id;

insert into movimentacao (valor, envio_id, destino_id) values(valor, sender_id, destino_id);

end$



create procedure Login(login varchar(15), senha varchar(20))

begin
	set @getLogin = (SELECT login.username FROM login WHERE login.senha = senha and login.username = login);

	SELECT user.id,user.username,login.senha FROM user join login on user.username = login.username WHERE login.username = login;

		if @getLogin is not null then
			insert into acesso (username) values(login);
		end if;
end$



create procedure Saque(id int, valor double)

begin

set @saldo = (select user.saldo from user where user.id = id);
set @rsaldo = (select user.retirada from user where user.id = id);

set @sfinal = (@saldo - valor);
set @rfinal = (@rsaldo + valor);

UPDATE user SET saldo = @sfinal WHERE user.id = id;
UPDATE user SET retirada = @rfinal WHERE user.id = id;

end$



create procedure Deposito(id int, valor double)

begin

set @saldo = (select user.saldo from user where user.id = id);
set @sfinal = (@saldo + valor);

UPDATE user SET saldo = @sfinal WHERE user.id = id;

end$



create procedure Retirada(id int, valor double)

begin

set @saldo = (select user.saldo from user where user.id = id);
set @rsaldo = (select user.retirada from user where user.id = id);

set @sfinal = (@saldo + valor);
set @rfinal = (@rsaldo - valor);

UPDATE user SET saldo = @sfinal WHERE user.id = id;
UPDATE user SET retirada = @rfinal WHERE user.id = id;

end$

delimiter ;