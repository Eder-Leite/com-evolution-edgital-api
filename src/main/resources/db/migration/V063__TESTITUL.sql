-- Create table
create table TESTITUL
(
  ncodititul NUMBER not null,
  ncodiempre NUMBER not null,
  ncodigeral NUMBER not null,
  ncodiusuar NUMBER not null,
  ncodiprede NUMBER,
  nfat_pedid NUMBER,
  nadm_pedid NUMBER,
  ncodilancm NUMBER,
  ntitptitul NUMBER,
  ctipotitul VARCHAR2(15) not null,
  ddemititul DATE not null,
  ddventitul DATE not null,
  ddatatitul DATE default SYSDATE not null,
  ddliqtitul DATE,
  cdocutitul VARCHAR2(25) not null,
  nparctitul NUMBER default 1 not null,
  nvalotitul NUMBER(19,2) default 0 not null,
  nvpagtitul NUMBER(19,2) default 0 not null,
  nvdestitul NUMBER(19,2) default 0 not null,
  nvjurtitul NUMBER(19,2) default 0 not null,
  ntxjutitul NUMBER(5,2) default 0 not null,
  ntxdetitul NUMBER(5,2) default 0 not null
);
-- Add comments to the table 
comment on table TESTITUL
  is 'Titulos a Receber/Pagar';
-- Add comments to the columns 
comment on column TESTITUL.ncodititul
  is 'código do título financeiro';
comment on column TESTITUL.ncodiempre
  is 'código da empresa';
comment on column TESTITUL.ncodigeral
  is 'código do cadastro geral';
comment on column TESTITUL.ncodiusuar
  is 'código do usuário';
comment on column TESTITUL.ncodiprede
  is 'código do plano de receita ou despesa';  
comment on column TESTITUL.nfat_pedid
  is 'código do pedido do faturamento';
comment on column TESTITUL.nadm_pedid
  is 'código do pedido do adm';  
comment on column TESTITUL.ncodilancm
  is 'código do lançamento manual financeiro';
comment on column TESTITUL.ntitptitul
  is 'título pai do título financeiro';  
comment on column TESTITUL.ctipotitul
  is 'tipo do título financeiro(DÉBITO/CRÉDITO)';
comment on column TESTITUL.ddemititul
  is 'data de emissão do título financeiro';
comment on column TESTITUL.ddventitul
  is 'data de vencimento do título financeiro';
comment on column TESTITUL.ddatatitul
  is 'data lançamento do título financeiro';
comment on column TESTITUL.ddliqtitul
  is 'data de liquidação do título financeiro';
comment on column TESTITUL.cdocutitul
  is 'documento do título financeiro';
comment on column TESTITUL.nparctitul
  is 'número da parcela do título financeiro';
comment on column TESTITUL.nvalotitul
  is 'valor do título financeiro';
comment on column TESTITUL.nvpagtitul
  is 'valor pago do título financeiro';
comment on column TESTITUL.nvdestitul
  is 'valor de desconto do título financeiro';
comment on column TESTITUL.nvjurtitul
  is 'valor de juros do título financeiro';
comment on column TESTITUL.ntxjutitul
  is 'valor de taxa de juros do título financeiro';
comment on column TESTITUL.ntxdetitul
  is 'valor de taxa de desconto do título financeiro';  
-- Create/Recreate indexes 
create index FK_TESTITUL_ADMPEDID on TESTITUL (NADM_PEDID);
create index FK_TESTITUL_FATPEDID on TESTITUL (NFAT_PEDID);
create index FK_TESTITUL_CADEMPRE on TESTITUL (NCODIEMPRE);
create index FK_TESTITUL_CADGERAL on TESTITUL (NCODIGERAL);
create index FK_TESTITUL_SEGUSUAR on TESTITUL (NCODIUSUAR);
create index FK_TESTITUL_TESTITUL on TESTITUL (NTITPTITUL);
create index FK_TESTITUL_TESLANCM on TESTITUL (NCODILANCM);
create index FK_TESTITUL_TESPREDE on TESTITUL (NCODIPREDE);  
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESTITUL
  add constraint PK_TESTITUL primary key (NCODITITUL)
  using index;
alter table TESTITUL
  add constraint FK_TESTITUL_ADMPEDID foreign key (NADM_PEDID)
  references ADMPEDID (NCODIPEDID);
alter table TESTITUL
  add constraint FK_TESTITUL_FATPEDID foreign key (NFAT_PEDID)
  references FATPEDID (NCODIPEDID);  
alter table TESTITUL
  add constraint FK_TESTITUL_CADEMPRE foreign key (NCODIEMPRE)
  references CADEMPRE (NCODIEMPRE);
alter table TESTITUL
  add constraint FK_TESTITUL_CADGERAL foreign key (NCODIGERAL)
  references CADGERAL (NCODIGERAL);
alter table TESTITUL
  add constraint FK_TESTITUL_SEGUSUAR foreign key (NCODIUSUAR)
  references SEGUSUAR (NCODIUSUAR); 
alter table TESTITUL
  add constraint FK_TESTITUL_TESPREDE foreign key (NCODIPREDE)
  references TESPREDE (NCODIPREDE);  
alter table TESTITUL
  add constraint FK_TESTITUL_TESTITUL foreign key (NTITPTITUL)
  references TESTITUL (NCODITITUL);