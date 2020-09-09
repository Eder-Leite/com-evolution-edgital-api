-- Create table
create table TESMFBAI
(
  ncodimfbai NUMBER not null,
  ncodibaixa NUMBER not null,
  ncodictfin NUMBER not null,
  ncoditppag NUMBER not null,
  ncodichequ NUMBER,
  ctipomfbai VARCHAR2(15) not null,
  nvalomfbai NUMBER(19,2) not null,
  ddatamfbai DATE not null
);
-- Add comments to the table 
comment on table TESMFBAI
  is 'Movimento Financeiro de Baixa Financeira';
-- Add comments to the columns 
comment on column TESMFBAI.ncodimfbai
  is 'código do movimento finananceiro da baixa financeira';
comment on column TESMFBAI.ncodibaixa
  is 'código da baixa financeira';
comment on column TESMFBAI.ncodictfin
  is 'código da conta financeira';
comment on column TESMFBAI.ncoditppag
  is 'código do tipo de pagamento';
comment on column TESMFBAI.ctipomfbai
  is 'tipo de movimento(DÉBITO/CRÉDITO) finananceiro da baixa financeira';
comment on column TESMFBAI.nvalomfbai
  is 'valor do movimento finananceiro da baixa financeira';
comment on column TESMFBAI.ddatamfbai
  is 'data do movivento finananceiro da baixa financeira';
comment on column TESMFBAI.ncodichequ
  is 'código do cheque';
-- Create/Recreate indexes 
create index FK_TESMFBAI_TESBAIXA on TESMFBAI (NCODIBAIXA);
create index FK_TESMFBAI_TESCHEQU on TESMFBAI (NCODICHEQU);
create index FK_TESMFBAI_TESCTFIN on TESMFBAI (NCODICTFIN);
create index FK_TESMFBAI_TESTPPAG on TESMFBAI (NCODITPPAG);
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESMFBAI
  add constraint PK_TESMFBAI primary key (NCODIMFBAI)
  using index;
alter table TESMFBAI
  add constraint FK_TESMFBAI_TESBAIXA foreign key (NCODIBAIXA)
  references TESBAIXA (NCODIBAIXA);
alter table TESMFBAI
  add constraint FK_TESMFBAI_TESCHEQU foreign key (NCODICHEQU)
  references TESCHEQU (NCODICHEQU);
alter table TESMFBAI
  add constraint FK_TESMFBAI_TESCTFIN foreign key (NCODICTFIN)
  references TESCTFIN (NCODICTFIN);
alter table TESMFBAI
  add constraint FK_TESMFBAI_TESTPPAG foreign key (NCODITPPAG)
  references TESTPPAG (NCODITPPAG);