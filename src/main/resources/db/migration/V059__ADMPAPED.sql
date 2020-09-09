-- Create table
create table ADMPAPED
(
  ncodipaped NUMBER not null,
  ncodipedid NUMBER not null,
  nvalopaped NUMBER(19,2) default 0 not null,
  dvencpaped DATE not null
);
-- Add comments to the table 
comment on table ADMPAPED
  is 'Parcela do Pedido do adm';
-- Add comments to the columns 
comment on column ADMPAPED.ncodipaped
  is 'código da parcela do pedido do adm';
comment on column ADMPAPED.ncodipedid
  is 'código do pedido do adm';
comment on column ADMPAPED.nvalopaped
  is 'valor da parcela do pedido do adm';
comment on column ADMPAPED.dvencpaped
  is 'data de vencimento da parcela do pedido do adm';
-- Create/Recreate indexes 
create index PK_ADMPAPED_ADMPEDID on ADMPAPED (NCODIPEDID);
-- Create/Recreate primary, unique and foreign key constraints 
alter table ADMPAPED
  add constraint PK_ADMPAPED primary key (NCODIPAPED)
  using index;
alter table ADMPAPED
  add constraint PK_ADMPAPED_ADMPEDID foreign key (NCODIPEDID)
  references ADMPEDID (NCODIPEDID);