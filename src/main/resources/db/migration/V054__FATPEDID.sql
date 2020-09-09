-- Create table
create table FATPEDID
(
  ncodipedid NUMBER not null,
  ncodilocal number not null,
  ncodiusuar NUMBER not null,
  ncpaipedid NUMBER,
  ncodialmox NUMBER not null,
  ncodigeral NUMBER not null,
  ncodiender NUMBER not null,
  ncodivende NUMBER not null,
  ncodifinal NUMBER not null,
  ntranpedid NUMBER,
  ncodoveicu NUMBER,
  ncodimotor NUMBER,
  nindcpedid NUMBER not null,
  nindppedid NUMBER not null,
  ntipfpedid NUMBER not null,
  nvolupedid NUMBER default 1 not null,
  cespepedid VARCHAR2(60) default 'UNIDADE' not null,
  npesbpedid NUMBER(19,2) default 0 not null,
  npeslpedid NUMBER(19,2) default 0 not null,
  cdocupedid VARCHAR2(25) not null,
  ddatapedid DATE default SYSDATE not null,
  cdescpedid VARCHAR2(255),
  csitupedid VARCHAR2(15) default 'ABERTO' not null,
  nnomepedid VARCHAR2(255),
  ncnpjpedid VARCHAR2(14),
  nplacpedid VARCHAR2(7) default 'AAA0000' not null,
  nnukmpedid NUMBER,
  nprodpedid NUMBER(19,2) default 0 not null,
  ndescpedid NUMBER(19,2) default 0 not null,
  nicmspedid NUMBER(19,2) default 0 not null,
  ntipipedid NUMBER(19,2) default 0 not null,
  nfretpedid NUMBER(19,2) default 0 not null,
  nsegupedid NUMBER(19,2) default 0 not null,
  noutrpedid NUMBER(19,2) default 0 not null,
  ninsspedid NUMBER(19,2) default 0 not null,
  ntisspedid NUMBER(19,2) default 0 not null,
  nirrfpedid NUMBER(19,2) default 0 not null,
  ncsslpedid NUMBER(19,2) default 0 not null,
  ntpispedid NUMBER(19,2) default 0 not null,
  ncofipedid NUMBER(19,2) default 0 not null,
  ntotapedid NUMBER(19,2) default 0 not null,
  nvdinpedid NUMBER(19,2) default 0 not null,
  nvchepedid NUMBER(19,2) default 0 not null,
  nvcarpedid NUMBER(19,2) default 0 not null,
  nvcfrpedid NUMBER(19,2) default 0 not null,
  nvtropedid NUMBER(19,2) default 0 not null,
  cobsvpedid VARCHAR2(2000)
);
-- Add comments to the table 
comment on table FATPEDID
  is 'Pedido do Faturamento';
-- Add comments to the columns 
comment on column FATPEDID.ncodipedid
  is 'código do pedido do faturamento';
comment on column FATPEDID.ncodilocal
  is 'código do local de faturamento';  
comment on column FATPEDID.ncodiusuar
  is 'código do usuário';
comment on column FATPEDID.ncpaipedid
  is 'código pai do pedido do faturamento';
comment on column FATPEDID.ncodialmox
  is 'código do almoxarifado';
comment on column FATPEDID.ncodigeral
  is 'código do cadastro geral';
comment on column FATPEDID.ncodiender
  is 'código do endereço';
comment on column FATPEDID.ncodivende
  is 'código do vendedor do faturamento';
comment on column FATPEDID.ncodifinal
  is 'código da finalidade';
comment on column FATPEDID.ntranpedid
  is 'código do transportador';
comment on column FATPEDID.ncodoveicu
  is 'código do veiculo';
comment on column FATPEDID.ncodimotor
  is 'código do motorista';
comment on column FATPEDID.nindcpedid
  is 'indica operação com consumidor final do pedido do faturamento';
comment on column FATPEDID.nindppedid
  is 'indicador de presença do comprador';
comment on column FATPEDID.ntipfpedid
  is 'tipo de frete do pedido do faturamento';
comment on column FATPEDID.nvolupedid
  is 'número de volume do pedido do faturamento';
comment on column FATPEDID.cespepedid
  is 'espécie de volume do pedido do faturamento';
comment on column FATPEDID.npesbpedid
  is 'peso bruto do pedido do faturamento';
comment on column FATPEDID.npeslpedid
  is 'peso líquido do pedido do faturamento';
comment on column FATPEDID.cdocupedid
  is 'documento do pedido do faturamento';
comment on column FATPEDID.ddatapedid
  is 'data do pedido do faturamento';
comment on column FATPEDID.cdescpedid
  is 'descrição do pedido do faturamento';
comment on column FATPEDID.csitupedid
  is 'situação do pedido do faturamento(ABERTO/FECHADO/CANCELADO)';
comment on column FATPEDID.nnomepedid
  is 'nome do consumidor no pedido do faturamento';
comment on column FATPEDID.ncnpjpedid
  is 'cnpj ou cpf do consumidor no pedido do faturamento';
comment on column FATPEDID.nplacpedid
  is 'placa do consumidor no pedido do faturamento';
comment on column FATPEDID.nnukmpedid
  is 'número do km do consumidor no pedido do faturamento';
comment on column FATPEDID.nprodpedid
  is 'valor total de produtos/serviço do pedido do faturamento';
comment on column FATPEDID.ndescpedid
  is 'valor total de desconto do pedido do faturamento';
comment on column FATPEDID.nicmspedid
  is 'valor total de icms do pedido do faturamento';
comment on column FATPEDID.ntipipedid
  is 'valor total de ipi do pedido do faturamento';
comment on column FATPEDID.nfretpedid
  is 'valor total de frete do pedido do faturamento';
comment on column FATPEDID.nsegupedid
  is 'valor total de seguro do pedido do faturamento';
comment on column FATPEDID.noutrpedid
  is 'valor total outros despesas do pedido do faturamento';
comment on column FATPEDID.ninsspedid
  is 'valor total de inss do pedido do faturamento';
comment on column FATPEDID.ntisspedid
  is 'valor total de iss do pedido do faturamento';
comment on column FATPEDID.nirrfpedid
  is 'valor total de irrf do pedido do faturamento';
comment on column FATPEDID.ncsslpedid
  is 'valor total de cssl do pedido do faturamento';
comment on column FATPEDID.ntpispedid
  is 'valor total de pis do pedido do faturamento';
comment on column FATPEDID.ncofipedid
  is 'valor total de cofins do pedido do faturamento';
comment on column FATPEDID.ntotapedid
  is 'valor total do pedido do faturamento';
comment on column FATPEDID.nvdinpedid
  is 'valor total em dinheiro do pedido do faturamento';
comment on column FATPEDID.nvchepedid
  is 'valor total em cheque do pedido do faturamento';
comment on column FATPEDID.nvcarpedid
  is 'valor total em cartão do pedido do faturamento';
comment on column FATPEDID.nvcfrpedid
  is 'valor total em carta frete do pedido do faturamento';
comment on column FATPEDID.nvtropedid
  is 'valor de troco do pedido do faturamento';
comment on column FATPEDID.cobsvpedid
  is 'observação do pedido do faturamento';
-- Create/Recreate indexes 
create index FK_FATPEDID_ADMALMOX on FATPEDID (NCODIALMOX);
create index FK_FATPEDID_CADENDER on FATPEDID (NCODIENDER);
create index FK_FATPEDID_CADGERAL on FATPEDID (NCODIGERAL);
create index FK_FATPEDID_CADGERAL1 on FATPEDID (NTRANPEDID);
create index FK_FATPEDID_CADMOTOR on FATPEDID (NCODIMOTOR);
create index FK_FATPEDID_CADVEICU on FATPEDID (NCODOVEICU);
create index FK_FATPEDID_CADVENDE on FATPEDID (NCODIVENDE);
create index FK_FATPEDID_FATPEDID on FATPEDID (NCPAIPEDID);
create index FK_FATPEDID_LIVFINAL on FATPEDID (NCODIFINAL);
create index FK_FATPEDID_SEGUSUAR on FATPEDID (NCODIUSUAR);
create index FK_FATPEDID_TESLOCAL on FATPEDID (NCODILOCAL);
-- Create/Recreate primary, unique and foreign key constraints 
alter table FATPEDID
  add constraint PK_FATPEDID primary key (NCODIPEDID)
  using index;
alter table FATPEDID
  add constraint FK_FATPEDID_ADMALMOX foreign key (NCODIALMOX)
  references ADMALMOX (NCODIALMOX);
alter table FATPEDID
  add constraint FK_FATPEDID_CADENDER foreign key (NCODIENDER)
  references CADENDER (NCODIENDER);
alter table FATPEDID
  add constraint FK_FATPEDID_CADGERAL foreign key (NCODIGERAL)
  references CADGERAL (NCODIGERAL);
alter table FATPEDID
  add constraint FK_FATPEDID_CADGERAL1 foreign key (NTRANPEDID)
  references CADGERAL (NCODIGERAL);
alter table FATPEDID
  add constraint FK_FATPEDID_CADMOTOR foreign key (NCODIMOTOR)
  references CADMOTOR (NCODIMOTOR);
alter table FATPEDID
  add constraint FK_FATPEDID_CADVEICU foreign key (NCODOVEICU)
  references CADVEICU (NCODIVEICU);
alter table FATPEDID
  add constraint FK_FATPEDID_CADVENDE foreign key (NCODIVENDE)
  references CADVENDE (NCODIVENDE);
alter table FATPEDID
  add constraint FK_FATPEDID_FATPEDID foreign key (NCPAIPEDID)
  references FATPEDID (NCODIPEDID);
alter table FATPEDID
  add constraint FK_FATPEDID_LIVFINAL foreign key (NCODIFINAL)
  references LIVFINAL (NCODIFINAL);
alter table FATPEDID
  add constraint FK_FATPEDID_SEGUSUAR foreign key (NCODIUSUAR)
  references SEGUSUAR (NCODIUSUAR);  
alter table FATPEDID
  add constraint FK_FATPEDID_TESLOCAL foreign key (NCODILOCAL)
  references TESLOCAL (NCODILOCAL);
