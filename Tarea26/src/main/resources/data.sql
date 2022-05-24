DROP table IF EXISTS facultad;
DROP table IF EXISTS investigadores;
DROP table IF EXISTS equipos;
DROP table IF EXISTS reservas;



CREATE TABLE facultad(
	id int  auto_increment PRIMARY KEY,
	nombre varchar(100)
);

CREATE TABLE investigadores (
  id varchar(8),
  NomApels varchar(100) DEFAULT NULL,
  facultad_id int DEFAULT NULL, 
  PRIMARY KEY (id),
  CONSTRAINT facultad_fk FOREIGN KEY (facultad_id) REFERENCES facultad(id)
);

CREATE TABLE equipos (
  id varchar(4),
  nombre varchar(100) DEFAULT NULL,
  facultad_id int DEFAULT NULL, 
  PRIMARY KEY (id),
  CONSTRAINT facultad_fk1 FOREIGN KEY (facultad_id) REFERENCES facultad(id)
);

CREATE TABLE reservas (
  id int  auto_increment PRIMARY KEY,
  investigadores_id varchar(8), 
  equipos_id varchar(4), 
  comienzo varchar(100) DEFAULT NULL,
  fin varchar(100) DEFAULT NULL,
  CONSTRAINT investigadores_fk FOREIGN KEY (investigadores_id) REFERENCES investigadores(id),
  CONSTRAINT equipos_fk FOREIGN KEY (equipos_id) REFERENCES equipos(id)
);



insert into facultad (nombre) values('Rovira');
insert into facultad (nombre) values('UAB');
insert into facultad (nombre) values('BLANQUERNA');
insert into facultad (nombre) values('UB');
insert into facultad (nombre) values('UNI NAVARRA');
insert into facultad (nombre) values('UNI INTER');

insert into investigadores (id,  NomApels, facultad_id) values ('12345678','Marc',1);
insert into investigadores (id,  NomApels, facultad_id) values ('54321123','Veronika',2);
insert into investigadores (id,  NomApels, facultad_id) values ('13579975','Isidre',3);
insert into investigadores (id,  NomApels, facultad_id) values ('24681345','Ferran',4);
insert into investigadores (id,  NomApels, facultad_id) values ('23456655','Adria',5);
insert into investigadores (id,  NomApels, facultad_id) values ('34567444','Borja',6);

insert into equipos (id, nombre, facultad_id) values('1111','A' ,1);
insert into equipos (id, nombre, facultad_id) values('2222','B' ,2);
insert into equipos (id, nombre, facultad_id) values('3333','C' ,3);
insert into equipos (id, nombre, facultad_id) values('4444','D' ,4);
insert into equipos (id, nombre, facultad_id) values('5555','E' ,5);
insert into equipos (id, nombre, facultad_id) values('6666','F' ,6);

insert into reservas (investigadores_id, equipos_id, comienzo, fin) values('12345678' ,'1111','1111-22-22','1111-22-22');
insert into reservas (investigadores_id, equipos_id, comienzo, fin) values('23456655' ,'2222','2222-22-22','2222-22-22');
insert into reservas (investigadores_id, equipos_id, comienzo, fin) values('54321123' ,'3333','3333-33-33','3313-22-22');
insert into reservas (investigadores_id, equipos_id, comienzo, fin) values('13579975' ,'4444','4444-44-44','1444-22-22');
insert into reservas (investigadores_id, equipos_id, comienzo, fin) values('34567444' ,'5555','5555-55-55','1151-22-22');
insert into reservas (investigadores_id, equipos_id, comienzo, fin) values('24681345' ,'6666','6666-66-66','1661-22-22');


