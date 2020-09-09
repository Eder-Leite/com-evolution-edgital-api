-- Create table
create table TESBAIXA
(
  ncodibaixa NUMBER not null,
  ncodifilia NUMBER not null,
  ncodigeral NUMBER not null,
  ncoditpbai NUMBER not null,
  ncodiusuar NUMBER not null,
  dcalcbaixa DATE not null,
  dmovibaixa DATE not null,
  ddatabaixa DATE default SYSDATE not null,
  nvdebbaixa NUMBER(19,2) default 0 not null,
  nvcrebaixa NUMBER(19,2) default 0 not null,
  nvtotbaixa NUMBER(19,2) default 0 not null,
  csitubaixa VARCHAR2(15) default 'ABERTO' not null,
  dprocbaixa DATE
);
-- Add comments to the table 
comment on table TESBAIXA
  is 'Baixa Financeira';
-- Add comments to the columns 
comment on column TESBAIXA.ncodibaixa
  is 'código da baixa financeira';
comment on column TESBAIXA.ncodifilia
  is 'código filial da empresa';
comment on column TESBAIXA.ncodigeral
  is 'código do cadastro geral';
comment on column TESBAIXA.ncoditpbai
  is 'código do tipo baixa financeira';
comment on column TESBAIXA.ncodiusuar
  is 'código do usuário';
comment on column TESBAIXA.dcalcbaixa
  is 'data de calculo juros/desconto da baixa financeira';
comment on column TESBAIXA.dmovibaixa
  is 'data da baixa financeira';
comment on column TESBAIXA.ddatabaixa
  is 'data de cadastro da baixa financeira';
comment on column TESBAIXA.nvdebbaixa
  is 'valor total de débito da baixa financeira';
comment on column TESBAIXA.nvcrebaixa
  is 'valor total de crédito da baixa financeira';
comment on column TESBAIXA.nvtotbaixa
  is 'total da baixa financeira';
comment on column TESBAIXA.csitubaixa
  is 'situação(ABERTO/FECHADO) da baixa financeira';
comment on column TESBAIXA.dprocbaixa
  is 'data de processamento da baixa financeira';
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESBAIXA
  add constraint PK_TESBAIXA primary key (NCODIBAIXA)
  using index;
alter table TESBAIXA
  add constraint FK_TESBAIXA_CADFILIA foreign key (NCODIFILIA)
  references CADFILIA (NCODIFILIA);
alter table TESBAIXA
  add constraint FK_TESBAIXA_CADGERAL foreign key (NCODIGERAL)
  references CADGERAL (NCODIGERAL);
alter table TESBAIXA
  add constraint FK_TESBAIXA_SEGUSUAR foreign key (NCODIUSUAR)
  references SEGUSUAR (NCODIUSUAR);
alter table TESBAIXA
  add constraint FK_TESBAIXA_TESTPBAI foreign key (NCODITPBAI)
  references TESTPBAI (NCODITPBAI);