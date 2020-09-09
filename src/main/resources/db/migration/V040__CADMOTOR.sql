-- Create table
create table CADMOTOR
(
  ncodimotor NUMBER not null,
  ncodigeral NUMBER not null,
  cnomemotor VARCHAR2(255) not null,
  cncpfmotor VARCHAR2(14) not null
);
-- Add comments to the table 
comment on table CADMOTOR
  is 'Motorista por Pessoa';
-- Add comments to the columns 
comment on column CADMOTOR.ncodimotor
  is 'código do motorista';
comment on column CADMOTOR.ncodigeral
  is 'código do cadastro geral';
comment on column CADMOTOR.cnomemotor
  is 'nome do motorista';
comment on column CADMOTOR.cncpfmotor
  is 'número do CPF do motorista';
-- Create/Recreate indexes 
create index FK_CADMOTOR_CADGERAL on CADMOTOR (NCODIGERAL);
-- Create/Recreate primary, unique and foreign key constraints 
alter table CADMOTOR
  add constraint PK_CADMOTOR primary key (NCODIMOTOR)
  using index;
alter table CADMOTOR
  add constraint FK_CADMOTOR_CADGERAL foreign key (NCODIGERAL)
  references CADGERAL (NCODIGERAL);