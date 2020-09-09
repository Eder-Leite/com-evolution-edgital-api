-- Create table
create table TESCTFIN
(
  ncodictfin NUMBER not null,
  ncodiagenc NUMBER not null,
  ncodiempre NUMBER not null,
  cnumectfin VARCHAR2(20) not null,
  cdigictfin VARCHAR2(2) not null,
  cdescctfin VARCHAR2(255) not null,
  ctipoctfin VARCHAR2(15) default 'CORRENTE' not null,
  cstatctfin VARCHAR2(15) default 'ATIVO' not null
);
-- Add comments to the table 
comment on table TESCTFIN
  is 'Conta Financeira';
-- Add comments to the columns 
comment on column TESCTFIN.ncodictfin
  is 'código da conta financeira';
comment on column TESCTFIN.ncodiagenc
  is 'código da agência';
comment on column TESCTFIN.ncodiempre
  is 'código da empresa';
comment on column TESCTFIN.cnumectfin
  is 'número da conta financeira';
comment on column TESCTFIN.cdigictfin
  is 'digito da conta financeira';
comment on column TESCTFIN.cdescctfin
  is 'descrição da conta financeira';
comment on column TESCTFIN.ctipoctfin
  is 'tipo de conta financeira(POUPANÇA/CORRENTE)';
comment on column TESCTFIN.cstatctfin
  is 'status da conta financeira(ATIVO/INATIVO)';
-- Create/Recreate indexes 
create index FK_TESCTFIN_CADEMPRE on TESCTFIN (NCODIEMPRE);
create index FK_TESCTFIN_TESAGENC on TESCTFIN (NCODIAGENC);
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESCTFIN
  add constraint PK_TESCTFIN primary key (NCODICTFIN)
  using index;
alter table TESCTFIN
  add constraint FK_TESCTFIN_CADEMPRE foreign key (NCODIEMPRE)
  references CADEMPRE (NCODIEMPRE);
alter table TESCTFIN
  add constraint FK_TESCTFIN_TESAGENC foreign key (NCODIAGENC)
  references TESAGENC (NCODIAGENC);
  
insert into TESCTFIN (NCODICTFIN, NCODIAGENC, NCODIEMPRE, CNUMECTFIN, CDIGICTFIN, CDESCCTFIN, CTIPOCTFIN, CSTATCTFIN)
values (1, 1, 1, '01', '0', 'CONTA CAIXA ASTORGA', 'CORRENTE', 'ATIVO');  