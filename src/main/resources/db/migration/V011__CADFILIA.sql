-- Create table
create table CADFILIA
(
  ncodifilia NUMBER not null,
  ncodiempre NUMBER not null,
  ncodigeral NUMBER not null,
  ncodictfin NUMBER not null,
  ccodifilia VARCHAR2(10) not null,
  cnomefilia VARCHAR2(255) not null,
  crtrifilia VARCHAR2(2) not null,
  cstatfilia VARCHAR2(15) default 'ATIVO' not null
);
-- Add comments to the table 
comment on table CADFILIA
  is 'Filial da Empresa';
-- Add comments to the columns 
comment on column CADFILIA.ncodifilia
  is 'código da filial';
comment on column CADFILIA.ncodiempre
  is 'código da empresa';
comment on column CADFILIA.ncodigeral
  is 'código do cadastro geral';
comment on column CADFILIA.ncodictfin
  is 'código da conta financeira';
comment on column CADFILIA.cnomefilia
  is 'nome da filial';
comment on column CADFILIA.crtrifilia
  is 'código de regime tributário da filial';
comment on column CADFILIA.cstatfilia
  is 'status da filial(ATIVO/INATIVO)';
comment on column CADFILIA.ccodifilia
  is 'código literal da filial';
-- Create/Recreate indexes 
create index FK_CADFILIA_CADEMPRE on CADFILIA (NCODIEMPRE);
create index FK_CADFILIA_CADGERAL on CADFILIA (NCODIGERAL);
create index FK_CADFILIA_TESCTFIN on CADFILIA (NCODICTFIN);
-- Create/Recreate primary, unique and foreign key constraints 
alter table CADFILIA
  add constraint PK_CADFILIA primary key (NCODIFILIA)
  using index;
alter table CADFILIA
  add constraint FK_CADFILIA_CADEMPRE foreign key (NCODIEMPRE)
  references CADEMPRE (NCODIEMPRE);
alter table CADFILIA
  add constraint FK_CADFILIA_CADGERAL foreign key (NCODIGERAL)
  references CADGERAL (NCODIGERAL);
alter table CADFILIA
  add constraint FK_CADFILIA_TESCTFIN foreign key (NCODICTFIN)
  references TESCTFIN (NCODICTFIN);
  
insert into CADFILIA (NCODIFILIA, NCODIEMPRE, NCODIGERAL, NCODICTFIN, CCODIFILIA, CNOMEFILIA, CRTRIFILIA, CSTATFILIA)
values (1, 1, 1, 1, '01', 'UNIDADE SEDE', '1', 'ATIVO');  