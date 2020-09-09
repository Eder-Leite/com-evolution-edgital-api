-- Create table
create table FATITPED
(
  ncodiitped NUMBER not null,
  ncodipedid NUMBER not null,
  ncodiprodu NUMBER not null,
  ncodicompn NUMBER not null,
  ncodiitali NUMBER not null,
  nqtdeitped NUMBER(19,3) default 0 not null,
  nvuniitped NUMBER(19,6) default 0 not null,
  ncustitped NUMBER(19,6) default 0 not null,
  nproditped NUMBER(19,2) default 0 not null,
  ndescitped NUMBER(19,2) default 0 not null,
  noutritped NUMBER(19,2) default 0 not null,
  nfretitped NUMBER(19,2) default 0 not null,
  nseguitped NUMBER(19,2) default 0 not null,
  ninssitped NUMBER(19,2) default 0 not null,
  ntissitped NUMBER(19,2) default 0 not null,
  nirrfitped NUMBER(19,2) default 0 not null,
  ncsslitped NUMBER(19,2) default 0 not null,
  ntpisitped NUMBER(19,2) default 0 not null,
  ncofiitped NUMBER(19,2) default 0 not null,
  npipiitped NUMBER(19,2) default 0 not null,
  ntipiitped NUMBER(19,2) default 0 not null,
  nbicmitped NUMBER(19,2) default 0 not null,
  nricmitped NUMBER(19,6) default 0 not null,
  naicmitped NUMBER(19,6) default 0 not null,
  ndicmitped NUMBER(19,6) default 0 not null,
  nicmsitped NUMBER(19,2) default 0 not null,
  ntotaitped NUMBER(19,2) default 0 not null
);
-- Add comments to the table 
comment on table FATITPED
  is 'Item do Pedido';
-- Add comments to the columns 
comment on column FATITPED.ncodiitped
  is 'código do item do pedido';
comment on column FATITPED.ncodipedid
  is 'código do pedido do faturamento';
comment on column FATITPED.ncodiprodu
  is 'código do produto';
comment on column FATITPED.ncodicompn
  is 'código do complemento de CFOP';
comment on column FATITPED.ncodiitali
  is 'código do item de aliquota por UF';
comment on column FATITPED.nqtdeitped
  is 'quantidade do item do pedido';
comment on column FATITPED.nvuniitped
  is 'valor unitário de item do pedido';
comment on column FATITPED.ncustitped
  is 'valor custo do item do pedido';
comment on column FATITPED.nproditped
  is 'valor total do produto do item do pedido';
comment on column FATITPED.ndescitped
  is 'valor de desconto do item do pedido';
comment on column FATITPED.noutritped
  is 'valor de outras do item do pedido';
comment on column FATITPED.nfretitped
  is 'valor de frete do item do pedido';
comment on column FATITPED.nseguitped
  is 'valor de seguro do item do pedido';
comment on column FATITPED.ninssitped
  is 'valor de inss do item do pedido';
comment on column FATITPED.ntissitped
  is 'valor de iss do item do pedido';
comment on column FATITPED.nirrfitped
  is 'valor de irrf do item do pedido';
comment on column FATITPED.ncsslitped
  is 'valor de cssl do item do pedido';
comment on column FATITPED.ntpisitped
  is 'valor total do pis do item do pedido';
comment on column FATITPED.ncofiitped
  is 'valor total do cofins do item do pedido';
comment on column FATITPED.npipiitped
  is 'percentual ipi do item do pedido';
comment on column FATITPED.ntipiitped
  is 'valor total de ipi do item do pedido';
comment on column FATITPED.nbicmitped
  is 'base de icms do item do pedido';
comment on column FATITPED.nricmitped
  is 'redução na aliquota do icms do item do pedido';
comment on column FATITPED.naicmitped
  is 'aliquota de icms do item do pedido';
comment on column FATITPED.ndicmitped
  is 'diferimento de icms do item do pedido';
comment on column FATITPED.nicmsitped
  is 'valor de icms do item do pedido';
comment on column FATITPED.ntotaitped
  is 'total do item do pedido';
-- Create/Recreate indexes 
create index FK_FATITPED_ADMPRODU on FATITPED (NCODIPRODU);
create index FK_FATITPED_FATPEDID on FATITPED (NCODIPEDID);
create index FK_FATITPED_LIVCOMPN on FATITPED (NCODICOMPN);
create index FK_FATITPED_LIVITALI on FATITPED (NCODIITALI);
-- Create/Recreate primary, unique and foreign key constraints 
alter table FATITPED
  add constraint PK_FATITPED primary key (NCODIITPED)
  using index;
alter table FATITPED
  add constraint FK_FATITPED_ADMPRODU foreign key (NCODIPRODU)
  references ADMPRODU (NCODIPRODU);
alter table FATITPED
  add constraint FK_FATITPED_FATPEDID foreign key (NCODIPEDID)
  references FATPEDID (NCODIPEDID);
alter table FATITPED
  add constraint FK_FATITPED_LIVCOMPN foreign key (NCODICOMPN)
  references LIVCOMPN (NCODICOMPN);
alter table FATITPED
  add constraint FK_FATITPED_LIVITALI foreign key (NCODIITALI)
  references LIVITALI (NCODIITALI);