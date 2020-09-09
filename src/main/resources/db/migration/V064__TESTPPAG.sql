-- Create table
create table TESTPPAG
(
  ncoditppag NUMBER not null,
  cdesctppag VARCHAR2(255) not null,
  cstattppag VARCHAR2(15) default 'ATIVO' not null
);
-- Add comments to the table 
comment on table TESTPPAG
  is 'Tipo de Pagamento';
-- Add comments to the columns 
comment on column TESTPPAG.ncoditppag
  is 'código do tipo de pagamento';
comment on column TESTPPAG.cdesctppag
  is 'descrição do tipo de pagamento';
comment on column TESTPPAG.cstattppag
  is 'status(ATIVO/INATIVO) do tipo de pagamento';
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESTPPAG
  add constraint PK_TESTPPAG primary key (NCODITPPAG)
  using index;
  
insert into TESTPPAG (NCODITPPAG, CDESCTPPAG, CSTATTPPAG)
values (1, 'DINHEIRO', 'ATIVO');

insert into TESTPPAG (NCODITPPAG, CDESCTPPAG, CSTATTPPAG)
values (2, 'MOEDA', 'ATIVO');

insert into TESTPPAG (NCODITPPAG, CDESCTPPAG, CSTATTPPAG)
values (3, 'CHEQUE', 'ATIVO');

insert into TESTPPAG (NCODITPPAG, CDESCTPPAG, CSTATTPPAG)
values (4, 'CARTÃO', 'ATIVO');

insert into TESTPPAG (NCODITPPAG, CDESCTPPAG, CSTATTPPAG)
values (5, 'DEPÓSITO', 'ATIVO');

insert into TESTPPAG (NCODITPPAG, CDESCTPPAG, CSTATTPPAG)
values (6, 'ENCONTRO DE CONTAS', 'ATIVO');

insert into TESTPPAG (NCODITPPAG, CDESCTPPAG, CSTATTPPAG)
values (7, 'BOLETO', 'ATIVO');  