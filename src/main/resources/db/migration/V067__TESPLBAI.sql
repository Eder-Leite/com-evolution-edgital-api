-- Create table
create table TESPLBAI
(
  ncodiplbai NUMBER not null,
  ncodibaixa NUMBER not null,
  ncodititul NUMBER not null,
  ncodictfin NUMBER,
  ncoditppag NUMBER,
  nvaloplbai NUMBER(19,2) default 0 not null,
  ctipoplbai VARCHAR2(25) default 'NORMAL' not null
);
-- Add comments to the table 
comment on table TESPLBAI
  is 'Pré Lançamento de Baixa Financeira';
-- Add comments to the columns 
comment on column TESPLBAI.ncodiplbai
  is 'código do pré lançamento da baixa financeira';
comment on column TESPLBAI.ncodibaixa
  is 'código da baixa financeira';
comment on column TESPLBAI.ncodititul
  is 'código do título financeiro';
comment on column TESPLBAI.ncodictfin
  is 'código da conta financeira';
comment on column TESPLBAI.ncoditppag
  is 'código do tipo de pagamento';
comment on column TESPLBAI.nvaloplbai
  is 'valor do pré lançamento da baixa financeira';
comment on column TESPLBAI.ctipoplbai
  is 'tipo(NORMAL/JUROS/DESCONTO) do pré lançamento da baixa financeira';
-- Create/Recreate indexes 
create index FK_TESPLBAI_TESBAIXA on TESPLBAI (NCODIBAIXA);
create index FK_TESPLBAI_TESCTFIN on TESPLBAI (NCODICTFIN);
create index FK_TESPLBAI_TESTITUL on TESPLBAI (NCODITITUL);
create index FK_TESPLBAI_TESTPPAG on TESPLBAI (NCODITPPAG);
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESPLBAI
  add constraint PK_TESPLBAI primary key (NCODIPLBAI)
  using index;
alter table TESPLBAI
  add constraint FK_TESPLBAI_TESBAIXA foreign key (NCODIBAIXA)
  references TESBAIXA (NCODIBAIXA);
alter table TESPLBAI
  add constraint FK_TESPLBAI_TESCTFIN foreign key (NCODICTFIN)
  references TESCTFIN (NCODICTFIN);
alter table TESPLBAI
  add constraint FK_TESPLBAI_TESTITUL foreign key (NCODITITUL)
  references TESTITUL (NCODITITUL);
alter table TESPLBAI
  add constraint FK_TESPLBAI_TESTPPAG foreign key (NCODITPPAG)
  references TESTPPAG (NCODITPPAG);