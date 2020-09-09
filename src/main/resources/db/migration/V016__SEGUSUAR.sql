-- Create table
create table SEGUSUAR
(
  ncodiusuar NUMBER not null,
  ncodifilia NUMBER not null,
  cnomeusuar VARCHAR2(255) not null,
  cemaiusuar VARCHAR2(255) not null,
  csenhusuar VARCHAR2(255) not null,
  cncpfusuar VARCHAR2(14) not null,
  ctipousuar VARCHAR2(25) default 'FUNCIONÁRIO' not null,
  ddatausuar DATE default SYSDATE not null,
  cstatusuar VARCHAR2(15) default 'ATIVO' not null,
  cfotousuar CLOB
);
-- Add comments to the table 
comment on table SEGUSUAR
  is 'Usuário';
-- Add comments to the columns 
comment on column SEGUSUAR.ncodiusuar
  is 'código do usuário';
comment on column SEGUSUAR.ncodifilia
  is 'código da filial';
comment on column SEGUSUAR.cnomeusuar
  is 'nome do usuário';
comment on column SEGUSUAR.cemaiusuar
  is 'email do usuário';
comment on column SEGUSUAR.csenhusuar
  is 'senha do usuário';
comment on column SEGUSUAR.cncpfusuar
  is 'número do CPF do usuário';
comment on column SEGUSUAR.ctipousuar
  is 'tipo de usuário(FUNCIONÁRIO/SUPERVISOR/ADMINISTRADOR/DESENVOLVEDOR)';
comment on column SEGUSUAR.ddatausuar
  is 'data de cadastro do usuário';
comment on column SEGUSUAR.cstatusuar
  is 'status do usuário(ATIVO/INATIVO/BLOQUEADO)';
comment on column SEGUSUAR.cfotousuar
  is 'foto do usuário';
-- Create/Recreate indexes 
create index FK_SEGUSUAR_CADFILIA on SEGUSUAR (NCODIFILIA);
-- Create/Recreate primary, unique and foreign key constraints 
alter table SEGUSUAR
  add constraint PK_SEGUSUAR primary key (NCODIUSUAR)
  using index;
alter table SEGUSUAR
  add constraint UK_SEGUSUAR unique (CEMAIUSUAR)
  using index;
alter table SEGUSUAR
  add constraint FK_SEGUSUAR_CADFILIA foreign key (NCODIFILIA)
  references CADFILIA (NCODIFILIA);
  
insert into SEGUSUAR (NCODIUSUAR, NCODIFILIA, CNOMEUSUAR, CEMAIUSUAR, CSENHUSUAR, CNCPFUSUAR, CTIPOUSUAR, DDATAUSUAR, CSTATUSUAR, CFOTOUSUAR)
values (1, 1, 'EDER APARECIDO LEITE', 'EDER@EVOLUTIONSISTEMAS.COM.BR', '$2a$10$sflkcQ3nendMPcWiJoTYb.CE6p1mzHNHsp1yOvmpD9IBS9lap6YOa', '028.265.789.44', 'DESENVOLVEDOR', to_date('20-08-2019 22:46:56', 'dd-mm-yyyy hh24:mi:ss'), 'ATIVO', null);  