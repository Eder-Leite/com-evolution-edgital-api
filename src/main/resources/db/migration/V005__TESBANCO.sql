-- Create table
create table TESBANCO
(
  ncodibanco NUMBER not null,
  ccodibanco VARCHAR2(10) not null,
  cdescbanco VARCHAR2(255) not null,
  ctipobanco VARCHAR2(15) not null,
  cstatbanco VARCHAR2(15) default 'ATIVO' not null
);
-- Add comments to the table 
comment on table TESBANCO
  is 'Banco';
-- Add comments to the columns 
comment on column TESBANCO.ncodibanco
  is 'código do banco';
comment on column TESBANCO.ccodibanco
  is 'código literal do banco';
comment on column TESBANCO.cdescbanco
  is 'descrição do banco';
comment on column TESBANCO.ctipobanco
  is 'tipo de banco(CAIXA/BANCÁRIO)';
comment on column TESBANCO.cstatbanco
  is 'status do banco (ATIVO/INATIVO)';
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESBANCO
  add constraint PK_TESBANCO primary key (NCODIBANCO)
  using index;
  
insert into TESBANCO (NCODIBANCO, CCODIBANCO, CDESCBANCO, CTIPOBANCO, CSTATBANCO)
values (1, '0', 'MOVIMENTO CAIXA', 'CAIXA', 'ATIVO');

insert into TESBANCO (NCODIBANCO, CCODIBANCO, CDESCBANCO, CTIPOBANCO, CSTATBANCO)
values (2, '1', 'BANCO DO BRASIL', 'BANCÁRIO', 'ATIVO');  