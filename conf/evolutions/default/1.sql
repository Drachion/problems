# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  id                            bigint auto_increment not null,
  street1                       varchar(255),
  street2                       varchar(255),
  town                          varchar(255),
  post_code                     varchar(255),
  employee_email                varchar(255),
  manager_email                 varchar(255),
  constraint uq_address_employee_email unique (employee_email),
  constraint uq_address_manager_email unique (manager_email),
  constraint pk_address primary key (id)
);

create table department (
  dep_id                        bigint auto_increment not null,
  name                          varchar(255),
  manager_email                 varchar(255),
  constraint uq_department_manager_email unique (manager_email),
  constraint pk_department primary key (dep_id)
);

create table project (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  start_date                    date,
  end_date                      date,
  manager_email                 varchar(255),
  constraint pk_project primary key (id)
);

create table user (
  type                          varchar(31) not null,
  email                         varchar(255) not null,
  date_of_birth                 date,
  name                          varchar(255),
  password                      varchar(255),
  role                          varchar(255),
  mngr_id                       bigint,
  job_role                      varchar(255),
  address_id                    bigint,
  dept                          bigint,
  emp_id                        bigint,
  constraint uq_user_address_id unique (address_id),
  constraint uq_user_dept unique (dept),
  constraint pk_user primary key (email)
);

create table user_project (
  user_email                    varchar(255) not null,
  project_id                    bigint not null,
  constraint pk_user_project primary key (user_email,project_id)
);

alter table address add constraint fk_address_employee_email foreign key (employee_email) references user (email) on delete restrict on update restrict;

alter table address add constraint fk_address_manager_email foreign key (manager_email) references user (email) on delete restrict on update restrict;

alter table department add constraint fk_department_manager_email foreign key (manager_email) references user (email) on delete restrict on update restrict;

alter table project add constraint fk_project_manager_email foreign key (manager_email) references user (email) on delete restrict on update restrict;
create index ix_project_manager_email on project (manager_email);

alter table user add constraint fk_user_address_id foreign key (address_id) references address (id) on delete restrict on update restrict;

alter table user add constraint fk_user_dept foreign key (dept) references department (dep_id) on delete restrict on update restrict;

alter table user_project add constraint fk_user_project_user foreign key (user_email) references user (email) on delete restrict on update restrict;
create index ix_user_project_user on user_project (user_email);

alter table user_project add constraint fk_user_project_project foreign key (project_id) references project (id) on delete restrict on update restrict;
create index ix_user_project_project on user_project (project_id);


# --- !Downs

alter table address drop constraint if exists fk_address_employee_email;

alter table address drop constraint if exists fk_address_manager_email;

alter table department drop constraint if exists fk_department_manager_email;

alter table project drop constraint if exists fk_project_manager_email;
drop index if exists ix_project_manager_email;

alter table user drop constraint if exists fk_user_address_id;

alter table user drop constraint if exists fk_user_dept;

alter table user_project drop constraint if exists fk_user_project_user;
drop index if exists ix_user_project_user;

alter table user_project drop constraint if exists fk_user_project_project;
drop index if exists ix_user_project_project;

drop table if exists address;

drop table if exists department;

drop table if exists project;

drop table if exists user;

drop table if exists user_project;

