-- Create table
create table ADMITPED
(
  ncodiitped NUMBER not null,
  ncodipedid NUMBER not null,
  ncodiprodu NUMBER,
  cdescitped VARCHAR2(120),
  nquanitped NUMBER(19,6) default 0 not null,
  nunititped NUMBER(19,6) default 0 not null,
  ndescitped NUMBER(19,2) default 0 not null,
  noutritped NUMBER(19,2) default 0 not null,
  nproditped NUMBER(19,2) default 0 not null,
  ntotaitped NUMBER(19,2) default 0 not null
);
-- Add comments to the table 
comment on table ADMITPED
  is 'Item do Pedido do Adm';
-- Add comments to the columns 
comment on column ADMITPED.ncodiitped
  is 'código do item do pedido do adm';
comment on column ADMITPED.ncodipedid
  is 'código do pedido do adm';
comment on column ADMITPED.ncodiprodu
  is 'código do produto';
comment on column ADMITPED.cdescitped
  is 'descrição do item do pedido do adm';
comment on column ADMITPED.nquanitped
  is 'quantidade do item do pedido do adm';
comment on column ADMITPED.nunititped
  is 'valor unitário do item do pedido do adm';
comment on column ADMITPED.ndescitped
  is 'valor de desconto do item do pedido do adm';
comment on column ADMITPED.noutritped
  is 'valor de outros do item do pedido do adm';
comment on column ADMITPED.nproditped
  is 'valor total do produto do item do pedido do adm';
comment on column ADMITPED.ntotaitped
  is 'valo total do item do pedido do adm';
-- Create/Recreate indexes 
create index FK_ADMITPED_ADMPEDID on ADMITPED (NCODIPEDID);
create index FK_ADMITPED_ADMPRODU on ADMITPED (NCODIPRODU);
-- Create/Recreate primary, unique and foreign key constraints 
alter table ADMITPED
  add constraint PK_ADMITPED primary key (NCODIITPED)
  using index;
alter table ADMITPED
  add constraint FK_ADMITPED_ADMPEDID foreign key (NCODIPEDID)
  references ADMPEDID (NCODIPEDID);
alter table ADMITPED
  add constraint FK_ADMITPED_ADMPRODU foreign key (NCODIPRODU)
  references ADMPRODU (NCODIPRODU);