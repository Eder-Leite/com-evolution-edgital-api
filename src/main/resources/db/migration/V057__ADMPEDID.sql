-- Create table
create table ADMPEDID
(
  ncodipedid NUMBER not null,
  ncodiusuar NUMBER not null,
  ncodialmox NUMBER not null,
  ncodigeral NUMBER not null,
  ncodifinal NUMBER not null,
  csitupedid VARCHAR2(15) default 'ABERTO' not null,
  ctipopedid VARCHAR2(15) not null,
  ddatapedid DATE not null,
  cdocupedid VARCHAR2(25),
  cdescpedid VARCHAR2(255),
  ndescpedid NUMBER(19,2) default 0 not null,
  noutrpedid NUMBER(19,2) default 0 not null,
  nprodpedid NUMBER(19,2) default 0 not null,
  ntotapedid NUMBER(19,2) default 0 not null,
  dcadapedid DATE default SYSDATE not null
);
-- Add comments to the table 
comment on table ADMPEDID
  is 'Pedido do ADM';
-- Add comments to the columns 
comment on column ADMPEDID.ncodipedid
  is 'código do pedido do adm';
comment on column ADMPEDID.ncodiusuar
  is 'código do usuário';
comment on column ADMPEDID.ncodialmox
  is 'código do almoxarifado';
comment on column ADMPEDID.ncodigeral
  is 'código do cadastro geral';
comment on column ADMPEDID.ncodifinal
  is 'código da finalidade fiscal';
comment on column FATPEDID.csitupedid
  is 'situação do pedido do faturamento(ABERTO/FECHADO/CANCELADO)';
comment on column ADMPEDID.ctipopedid
  is 'tipo de pedido do adm(ALMOXARIFADO/DIRETA)';
comment on column ADMPEDID.ddatapedid
  is 'data do pedido do adm';
comment on column ADMPEDID.cdocupedid
  is 'documento do pedido do adm';
comment on column ADMPEDID.cdescpedid
  is 'descrição do pedido do adm';
comment on column ADMPEDID.ndescpedid
  is 'total desconto do pedido do adm';
comment on column ADMPEDID.noutrpedid
  is 'total outros do pedido do adm';
comment on column ADMPEDID.nprodpedid
  is 'total do produtos/serviços do pedido do adm';
comment on column ADMPEDID.ntotapedid
  is 'total do pedido do adm';
comment on column ADMPEDID.dcadapedid
  is 'data de cadastro do pedido do adm';
-- Create/Recreate indexes 
create index FK_ADMPEDID_ADMALMOX on ADMPEDID (NCODIALMOX);
create index FK_ADMPEDID_CADGERAL on ADMPEDID (NCODIGERAL);
create index FK_ADMPEDID_LIVFINAL on ADMPEDID (NCODIFINAL);
create index FK_ADMPEDID_SEGUSUAR on ADMPEDID (NCODIUSUAR);
-- Create/Recreate primary, unique and foreign key constraints 
alter table ADMPEDID
  add constraint PK_ADMPEDID primary key (NCODIPEDID)
  using index;
alter table ADMPEDID
  add constraint FK_ADMPEDID_ADMALMOX foreign key (NCODIALMOX)
  references ADMALMOX (NCODIALMOX);
alter table ADMPEDID
  add constraint FK_ADMPEDID_CADGERAL foreign key (NCODIGERAL)
  references CADGERAL (NCODIGERAL);
alter table ADMPEDID
  add constraint FK_ADMPEDID_LIVFINAL foreign key (NCODIFINAL)
  references LIVFINAL (NCODIFINAL);
alter table ADMPEDID
  add constraint FK_ADMPEDID_SEGUSUAR foreign key (NCODIUSUAR)
  references SEGUSUAR (NCODIUSUAR);