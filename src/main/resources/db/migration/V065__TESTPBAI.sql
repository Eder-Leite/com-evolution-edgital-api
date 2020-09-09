-- Create table
create table TESTPBAI
(
  ncoditpbai NUMBER not null,
  cdesctpbai VARCHAR2(255) not null,
  cstattpbai VARCHAR2(15) default 'ATIVO' not null
);
-- Add comments to the table 
comment on table TESTPBAI
  is 'Tipo de Baixa Financeira';
-- Add comments to the columns 
comment on column TESTPBAI.ncoditpbai
  is 'código do tipo de baixa financeira';
comment on column TESTPBAI.cdesctpbai
  is 'descrição do tipo de baixa financeira';
comment on column TESTPBAI.cstattpbai
  is 'status(ATIVO/INATIVO) do tipo de baixa financeira';
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESTPBAI
  add constraint PK_TESTPBAI primary key (NCODITPBAI)
  using index;
  
  
insert into TESTPBAI (NCODITPBAI, CDESCTPBAI, CSTATTPBAI)
values (1, 'CAIXA', 'ATIVO');

insert into TESTPBAI (NCODITPBAI, CDESCTPBAI, CSTATTPBAI)
values (2, 'ORDEM DE PAGAMENTO', 'ATIVO');  