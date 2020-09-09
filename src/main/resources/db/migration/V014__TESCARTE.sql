-- Create table
create table TESCARTE
(
  ncodicarte NUMBER not null,
  ncodiempre NUMBER not null,
  cdesccarte VARCHAR2(255) not null,
  ctipocarte VARCHAR2(15) not null
);
-- Add comments to the table 
comment on table TESCARTE
  is 'Carteira Financeira';
-- Add comments to the columns 
comment on column TESCARTE.ncodicarte
  is 'código da carteira';
comment on column TESCARTE.ncodiempre
  is 'código da empresa';
comment on column TESCARTE.cdesccarte
  is 'descrição da carteira';
comment on column TESCARTE.ctipocarte
  is 'tipo de carteira(RECEITA/DESPESA)';
-- Create/Recreate indexes 
create index FK_TESCARTE_CADEMPRE on TESCARTE (NCODIEMPRE);
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESCARTE
  add constraint PK_TESCARTE primary key (NCODICARTE)
  using index;
alter table TESCARTE
  add constraint FK_TESCARTE_CADEMPRE foreign key (NCODIEMPRE)
  references CADEMPRE (NCODIEMPRE);
  
insert into TESCARTE (NCODICARTE, NCODIEMPRE, CDESCCARTE, CTIPOCARTE)
values (1, 1, 'RECEBIMENTO', 'RECEITA');

insert into TESCARTE (NCODICARTE, NCODIEMPRE, CDESCCARTE, CTIPOCARTE)
values (2, 1, 'PAGAMENTO', 'DESPESA');  