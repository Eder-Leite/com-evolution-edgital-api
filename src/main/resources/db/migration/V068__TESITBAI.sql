-- Create table
create table TESITBAI
(
  ncodiitbai NUMBER not null,
  ncodibaixa NUMBER not null,
  ncodititul NUMBER not null,
  nvabeitbai NUMBER(19,2) default 0 not null,
  nvjuritbai NUMBER(19,2) default 0 not null,
  nvdesitbai NUMBER(19,2) default 0 not null,
  nsalditbai NUMBER(19,2) default 0 not null,
  nvaloitbai NUMBER(19,2) default 0 not null
);
-- Add comments to the table 
comment on table TESITBAI
  is 'Itens da Baixa Financeira';
-- Add comments to the columns 
comment on column TESITBAI.ncodiitbai
  is 'código do item da baixa financeira';
comment on column TESITBAI.ncodibaixa
  is 'código da baixa financeira';
comment on column TESITBAI.ncodititul
  is 'código do título financeiro';
comment on column TESITBAI.nvabeitbai
  is 'valor em aberto do titulo do item da baixa financeira';
comment on column TESITBAI.nvjuritbai
  is 'valor de juros do titulo do item da baixa financeira';
comment on column TESITBAI.nvdesitbai
  is 'valor de desconto do titulo do item da baixa financeira';
comment on column TESITBAI.nsalditbai
  is 'saldo do titulo do item da baixa financeira';
comment on column TESITBAI.nvaloitbai
  is 'valor de baixa titulo do item da baixa financeira';
-- Create/Recreate indexes 
create index FK_TESITBAI_TESBAIXA on TESITBAI (NCODIBAIXA);
create index FK_TESITBAI_TESTITUL on TESITBAI (NCODITITUL);
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESITBAI
  add constraint PK_TESITBAI primary key (NCODIITBAI)
  using index;
alter table TESITBAI
  add constraint FK_TESITBAI_TESBAIXA foreign key (NCODIBAIXA)
  references TESBAIXA (NCODIBAIXA);
alter table TESITBAI
  add constraint FK_TESITBAI_TESTITUL foreign key (NCODITITUL)
  references TESTITUL (NCODITITUL);