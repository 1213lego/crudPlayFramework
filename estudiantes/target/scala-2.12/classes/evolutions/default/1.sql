# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table estudiante (
  identificacion                bigserial not null,
  nombres                       varchar(255),
  apellidos                     varchar(255),
  semestre                      integer,
  constraint pk_estudiante primary key (identificacion)
);

create table propietario (
  cedula                        bigserial not null,
  nombres                       varchar(255),
  apellidos                     varchar(255),
  constraint pk_propietario primary key (cedula)
);

create table vehiculo (
  placa                         varchar(255) not null,
  propietario_cedula            bigint,
  marca                         varchar(255),
  modelo                        integer,
  tipo                          varchar(255),
  pasajeros                     integer,
  constraint pk_vehiculo primary key (placa)
);

alter table vehiculo add constraint fk_vehiculo_propietario_cedula foreign key (propietario_cedula) references propietario (cedula) on delete restrict on update restrict;
create index ix_vehiculo_propietario_cedula on vehiculo (propietario_cedula);


# --- !Downs

alter table if exists vehiculo drop constraint if exists fk_vehiculo_propietario_cedula;
drop index if exists ix_vehiculo_propietario_cedula;

drop table if exists estudiante cascade;

drop table if exists propietario cascade;

drop table if exists vehiculo cascade;

