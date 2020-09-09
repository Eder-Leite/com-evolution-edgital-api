-- Create table
create table TESMOVIM
(
  ncodimovim NUMBER not null,
  ncodifilia NUMBER not null,
  ncodictfin NUMBER not null,
  ncodiusuar NUMBER not null,
  ncodihistb NUMBER not null,
  ncodibaixa NUMBER,
  ncodichequ NUMBER,
  ctipomovim VARCHAR2(15) not null,
  cdctomovim VARCHAR2(25) not null,
  ddatamovim DATE not null,
  nvalomovim NUMBER(19,2) default 0 not null,
  cdescmovim VARCHAR2(255) not null,
  cconcmovim VARCHAR2(10) default 'NÃO' not null,
  dlactmovim DATE default sysdate not null
);
-- Add comments to the table 
comment on table TESMOVIM
  is 'Movimento Financeiro';
-- Add comments to the columns 
comment on column TESMOVIM.ncodimovim
  is 'código do movimento financeiro';
comment on column TESMOVIM.ncodifilia
  is 'código da filial';
comment on column TESMOVIM.ncodictfin
  is 'código da conta financeira';
comment on column TESMOVIM.ncodiusuar
  is 'código do usuário';
comment on column TESMOVIM.ncodihistb
  is 'código do histórico bancário';
comment on column TESMOVIM.ncodibaixa
  is 'código da baixa financeira';
comment on column TESMOVIM.ncodichequ
  is 'código do cheque';
comment on column TESMOVIM.ctipomovim
  is 'tipo do movimento financeiro(CRÉDITO/DÉBITO)';
comment on column TESMOVIM.cdctomovim
  is 'documento do movimento financeiro';
comment on column TESMOVIM.ddatamovim
  is 'data do movimento financeiro';
comment on column TESMOVIM.nvalomovim
  is 'valor do movimento financeiro';
comment on column TESMOVIM.cdescmovim
  is 'descrição do movimento financeiro';
comment on column TESMOVIM.cconcmovim
  is 'conciliado do movimento financeiro';
comment on column TESMOVIM.dlactmovim
  is 'data de lançamento do movimento financeiro';
-- Create/Recreate indexes 
create index FK_TESMOVIM_CADFILIA on TESMOVIM (NCODIFILIA);
create index FK_TESMOVIM_SEGUSUAR on TESMOVIM (NCODIUSUAR);
create index FK_TESMOVIM_TESBAIXA on TESMOVIM (NCODIBAIXA);
create index FK_TESMOVIM_TESCHEQU on TESMOVIM (NCODICHEQU);
create index FK_TESMOVIM_TESCTFIN on TESMOVIM (NCODICTFIN);
create index FK_TESMOVIM_TESHISTB on TESMOVIM (NCODIHISTB);
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESMOVIM
  add constraint PK_TESMOVIM primary key (NCODIMOVIM)
  using index;
alter table TESMOVIM
  add constraint FK_TESMOVIM_CADFILIA foreign key (NCODIFILIA)
  references CADFILIA (NCODIFILIA);
alter table TESMOVIM
  add constraint FK_TESMOVIM_SEGUSUAR foreign key (NCODIUSUAR)
  references SEGUSUAR (NCODIUSUAR);
alter table TESMOVIM
  add constraint FK_TESMOVIM_TESBAIXA foreign key (NCODIBAIXA)
  references TESBAIXA (NCODIBAIXA);
alter table TESMOVIM
  add constraint FK_TESMOVIM_TESCHEQU foreign key (NCODICHEQU)
  references TESCHEQU (NCODICHEQU);
alter table TESMOVIM
  add constraint FK_TESMOVIM_TESCTFIN foreign key (NCODICTFIN)
  references TESCTFIN (NCODICTFIN);
alter table TESMOVIM
  add constraint FK_TESMOVIM_TESHISTB foreign key (NCODIHISTB)
  references TESHISTB (NCODIHISTB);
