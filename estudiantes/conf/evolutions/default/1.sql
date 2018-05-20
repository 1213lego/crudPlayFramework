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


# --- !Downs

drop table if exists estudiante cascade;

