-- Create table
create table TESAGENC
(
  ncodiagenc NUMBER not null,
  ncodibanco NUMBER not null,
  ccodiagenc VARCHAR2(10) not null,
  cdigiagenc VARCHAR2(2) default '0' not null,
  cdescagenc VARCHAR2(255) not null,
  ccidaagenc VARCHAR2(255) not null,
  cstatagenc VARCHAR2(15) default 'ATIVO' not null
);
-- Add comments to the table 
comment on table TESAGENC
  is 'Agência Bancária';
-- Add comments to the columns 
comment on column TESAGENC.ncodiagenc
  is 'código da agencia';
comment on column TESAGENC.ncodibanco
  is 'código do banco';
comment on column TESAGENC.ccodiagenc
  is 'código literal da agencia';
comment on column TESAGENC.cdescagenc
  is 'descrição da agencia';
comment on column TESAGENC.ccidaagenc
  is 'nome da cidade';
comment on column TESAGENC.cstatagenc
  is 'status da agencia(ATIVO/INATIVO)';
comment on column TESAGENC.cdigiagenc
  is 'digito da agencia';
-- Create/Recreate indexes 
create index FK_TESAGENC_TESBANCO on TESAGENC (NCODIBANCO);
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESAGENC
  add constraint PK_TESAGENC primary key (NCODIAGENC)
  using index;
alter table TESAGENC
  add constraint FK_TESAGENC_TESBANCO foreign key (NCODIBANCO)
  references TESBANCO (NCODIBANCO);

insert into TESAGENC (NCODIAGENC, NCODIBANCO, CCODIAGENC, CDIGIAGENC, CDESCAGENC, CCIDAAGENC, CSTATAGENC)
values (1, 1, '01', '0', 'MOVIMENTO CAIXA ASTORGA', 'ASTORGA', 'ATIVO');