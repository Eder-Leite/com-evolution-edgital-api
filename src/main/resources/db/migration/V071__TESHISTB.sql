-- Create table
create table TESHISTB
(
  ncodihistb NUMBER not null,
  cdeschistb VARCHAR2(255) not null,
  cstathistb VARCHAR2(15) default 'ATIVO' not null
);
-- Add comments to the table 
comment on table TESHISTB
  is 'Histórico Bancário';
-- Add comments to the columns 
comment on column TESHISTB.ncodihistb
  is 'código do histórico bancário';
comment on column TESHISTB.cdeschistb
  is 'descrição do histórico bancário';
comment on column TESHISTB.cstathistb
  is 'status(ATIVO/INATIVO) do histórico bancário';
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESHISTB
  add constraint PK_TESHISTB primary key (NCODIHISTB)
  using index;

--------------

insert into teshistb (NCODIHISTB, CDESCHISTB, CSTATHISTB)
values (1, 'RECEBIMENTO DE CLIENTE', 'ATIVO');

insert into teshistb (NCODIHISTB, CDESCHISTB, CSTATHISTB)
values (2, 'PAGAMENTO DE FORNECEDOR', 'ATIVO');

insert into teshistb (NCODIHISTB, CDESCHISTB, CSTATHISTB)
values (3, 'TRANSFERÊNCIA DE ENTRADA', 'ATIVO');

insert into teshistb (NCODIHISTB, CDESCHISTB, CSTATHISTB)
values (4, 'TRANSFERÊNCIA DE SAIDA', 'ATIVO');
