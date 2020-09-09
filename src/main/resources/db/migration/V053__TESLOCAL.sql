-- Create table
create table TESLOCAL
(
  ncodilocal NUMBER not null,
  ncodifilia NUMBER,
  ncodictfin NUMBER,
  cdescricao VARCHAR2(255)
);
-- Add comments to the table 
comment on table TESLOCAL
  is 'Local para Faturamento';
-- Add comments to the columns 
comment on column TESLOCAL.ncodilocal
  is 'código do local para faturamento';
comment on column TESLOCAL.ncodifilia
  is 'código da filial';
comment on column TESLOCAL.ncodictfin
  is 'código da conta financeira';
comment on column TESLOCAL.cdescricao
  is 'descrição do local para faturamento';
-- Create/Recreate indexes 
create index FK_TESLOCAL_CADFILIA on TESLOCAL (NCODIFILIA);
create index FK_TESLOCAL_TESCTFIN on TESLOCAL (NCODICTFIN);
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESLOCAL
  add constraint PK_TESLOCAL primary key (NCODILOCAL)
  using index;
alter table TESLOCAL
  add constraint FK_TESLOCAL_CADFILIA foreign key (NCODIFILIA)
  references CADFILIA (NCODIFILIA);
alter table TESLOCAL
  add constraint FK_TESLOCAL_TESCTFIN foreign key (NCODICTFIN)
  references TESCTFIN (NCODICTFIN);
  
insert into TESLOCAL (NCODILOCAL, NCODIFILIA, NCODICTFIN, CDESCRICAO)
values (1, 1, 1, 'PDV 01');  