-- Create table
create table FATPAPED
(
  ncodipaped NUMBER not null,
  ncodipedid NUMBER,
  nvalopaped NUMBER(19,2),
  dvencpaped DATE
);
-- Add comments to the table 
comment on table FATPAPED
  is 'Parcela do Pedido do Faturamento';
-- Add comments to the columns 
comment on column FATPAPED.ncodipaped
  is 'código da parcela do pedido do faturamento';
comment on column FATPAPED.ncodipedid
  is 'código do pedido do faturamento';
comment on column FATPAPED.nvalopaped
  is 'valor da parcela do pedido do faturamento';
comment on column FATPAPED.dvencpaped
  is 'vencimento da parcela do pedido do faturamento';
-- Create/Recreate indexes 
create index FK_FATPAPED_FATPEDID on FATPAPED (NCODIPEDID);
-- Create/Recreate primary, unique and foreign key constraints 
alter table FATPAPED
  add constraint PK_FATPAPED primary key (NCODIPAPED)
  using index;
alter table FATPAPED
  add constraint FK_FATPAPED_FATPEDID foreign key (NCODIPEDID)
  references FATPEDID (NCODIPEDID);