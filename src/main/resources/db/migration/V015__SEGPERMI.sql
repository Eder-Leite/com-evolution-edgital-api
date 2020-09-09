-- Create table
create table SEGPERMI
(
  ncodipermi NUMBER not null,
  cdescpermi VARCHAR2(500) not null,
  csiglpermi VARCHAR2(255) not null,
  cstatpermi VARCHAR2(15) default 'ATIVO' not null
);
-- Add comments to the table 
comment on table SEGPERMI
  is 'Permissão Usuário';
-- Add comments to the columns 
comment on column SEGPERMI.ncodipermi
  is 'código da permissão usuário';
comment on column SEGPERMI.cdescpermi
  is 'descrição da permissão usuário';
comment on column SEGPERMI.csiglpermi
  is 'sigla da permissão usuário';
comment on column SEGPERMI.cstatpermi
  is 'status da permissão usuário(ATIVO/INATIVO)';
-- Create/Recreate primary, unique and foreign key constraints 
alter table SEGPERMI
  add constraint PK_SEGPERMI primary key (NCODIPERMI)
  using index;
alter table SEGPERMI
  add constraint UK_SEGPERMI unique (CSIGLPERMI)
  using index;  
  
insert into SEGPERMI (NCODIPERMI, CDESCPERMI, CSIGLPERMI, CSTATPERMI)
values (1, 'DESENVOLVEDOR', 'ROLE_DESENVOLVEDOR', 'ATIVO');  

insert into SEGPERMI (NCODIPERMI, CDESCPERMI, CSIGLPERMI, CSTATPERMI)
values (2, 'ADMINISTRADOR', 'ROLE_ADMINISTRADOR', 'ATIVO'); 

insert into SEGPERMI (NCODIPERMI, CDESCPERMI, CSIGLPERMI, CSTATPERMI)
values (3, 'SUPERVISOR', 'ROLE_SUPERVISOR', 'ATIVO'); 

insert into SEGPERMI (NCODIPERMI, CDESCPERMI, CSIGLPERMI, CSTATPERMI)
values (4, 'USUARIO', 'ROLE_USUARIO', 'ATIVO'); 