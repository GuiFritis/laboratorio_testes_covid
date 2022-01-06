create database Lab_DuGustin;

use Lab_DuGustin;

create user cadastro@'localhost' identified by '11111111'; 
create user responsavel@'localhost' identified by '22222222'; 
create user supervisor@'localhost' identified by '33333333'; 
create user paciente@'localhost' identified by ''; 

select * from mysql.user;

grant select, insert, alter on coleta.* to cadastro;

grant select, insert, alter on paciente.* to cadastro;

grant insert, select, alter on teste.* to responsavel;

grant select on teste.* to supervisor;

grant alter on teste.valido to supervisor;

grant select on *.* to paciente;

create table paciente(
	nome varchar(50),
    cpf decimal(11) primary key,/*Vou usar o cpf como usuário de login do paciente, não coloquei RG pois hoje todos precisam de CPF*/
    senha varchar(12) not null,
    dataNasc date,
    sexo char(1),
    comorbidade bool
);

create table coleta(
	codColeta int primary key auto_increment,
    cpfPaciente decimal(11),
    profissional varchar(50),
    cidade varchar(50),
    tipoMaterial varchar(30),
    formaColeta varchar(50),  
    horarioColeta DateTime,
    sucesso bool,
    usado bool default false,
    observacao varchar(255) default "Sem observações" 
);

alter table coleta add constraint foreign key (cpfPaciente) references paciente(cpf) on update cascade on delete cascade;

create table teste(
	numTeste varchar(30) primary key,
    usado bool default false
);

create table recoleta(
	codRecoleta int primary key,
    codColetaPai int,
    motivo varchar(30),
    primeira bool
);

alter table recoleta add constraint foreign key (codRecoleta) references Coleta(codColeta) on delete cascade on update cascade,
	add constraint foreign key (codColetaPai) references Coleta(codColeta) on delete cascade on update cascade;
    
create table exame(
	codExame int primary key auto_increment,
    nome varchar(40),
    numTeste varchar(30),
    codColeta int,
    resultado varchar(20),
    diaExame date,
    valido bool default false,
    validado bool default false,
    observacao varchar(255) default "Sem observações"
);

alter table exame add constraint foreign key (numTeste) references Teste(numTeste) on delete cascade on update cascade,
	add constraint foreign key (codColeta) references Coleta(codColeta) on delete cascade on update cascade;

-- Requisitos do trabalho de Banco de Dados
select resultado, count(*) as quantPacientes
from exame e inner join coleta c on e.codColeta = c.codColeta
	inner join paciente p on c.cpfPaciente = p.cpf
group by resultado;

select p.nome, p.cpf, p.dataNasc, p.comorbidade, p.sexo
from paciente p inner join coleta c on p.cpf = c.cpfPaciente
	inner join exame e on c.codColeta = e.codColeta
where e.resultado = "DETECTADO";

select comorbidade, count(p.cpf) as Exames_Detectados
from paciente p inner join coleta c on p.cpf = c.cpfPaciente
	inner join exame e on c.codColeta = e.codColeta
where e.resultado = "DETECTADO" and p.comorbidade = false
group by comorbidade; -- como comorbidade é true ou false, vai ser agrupado por aqui

select min(TIMESTAMPDIFF (YEAR,p.dataNasc,CURDATE())) as Menor_Idade, 
	max(TIMESTAMPDIFF (YEAR,p.dataNasc,CURDATE())) as Maior_Idade, 
    avg(TIMESTAMPDIFF (YEAR,p.dataNasc,CURDATE())) as Media_Idades
from paciente p inner join coleta c on p.cpf = c.cpfPaciente
	inner join exame e on c.codColeta = e.codColeta
where e.resultado = "DETECTADO";

-- para esse criei inclusive uma view que está mais abaixo que chamei no projeto
select diaExame, count(*) as quantidade from exame
	group by diaExame
    order by diaExame;

create view allCR as
select * from coleta c left join recoleta r on c.codColeta = r.codRecoleta;

create view CNusadas as
select * from coleta
	where sucesso = true and usado = false
	order by codColeta;
    
create view TNusados as
select * from teste
	where usado = false
    order by numTeste;
    
create view Einvalidados as
select * from exame
	where validado = false
    order by codExame;
    
create view dias as
select diaExame, count(*) as quantidade from exame
	group by diaExame
    order by diaExame;
    
DELIMITER //
create trigger criadoExame after insert on exame
for each row
begin
	update teste set usado = true
    where numTeste = new.numTeste;
    update coleta set usado = true
    where codColeta = new.codColeta;
end; //    
        
DELIMITER //
create procedure selectPacienteAtendidos(in dia date)
begin
	select count(*) as quantidade
		from exame e inner join coleta c on e.codColeta = c.codColeta
			inner join paciente p on c.cpfPaciente = p.cpf
		where e.diaExame = dia;
end; //

DELIMITER //
create procedure selectResultadoExame(in result varchar(20), in dia date)
begin
	select count(*) as quantidade from exame
		where resultado = result and diaExame = dia;
end; //

use Lab_DuGustin;

select * from mysql.user;