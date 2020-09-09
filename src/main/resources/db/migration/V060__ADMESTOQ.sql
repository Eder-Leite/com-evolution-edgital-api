-- Create table
create table ADMESTOQ
(
  ncodiestoq NUMBER not null,
  ncodialmox NUMBER not null,
  ncodiprodu NUMBER not null,
  nquanestoq NUMBER(19,3) default 0 not null,
  ncustestoq NUMBER(19,10) default 0 not null,
  nvendestoq NUMBER(19,10) default 0 not null
);
-- Add comments to the table 
comment on table ADMESTOQ
  is 'Estoque de Produto';
-- Add comments to the columns 
comment on column ADMESTOQ.ncodiestoq
  is 'código do estoque de produto';
comment on column ADMESTOQ.ncodiprodu
  is 'código do produto';
comment on column ADMESTOQ.ncodialmox
  is 'código do almoxarifado';
comment on column ADMESTOQ.nquanestoq
  is 'quantidade do estoque de produto';
comment on column ADMESTOQ.ncustestoq
  is 'valor de custo do estoque de produto';
comment on column ADMESTOQ.nvendestoq
  is 'valor de venda do estoque de poduto';
-- Create/Recreate indexes 
create index FK_ADMESTOQ_ADMPRODU on ADMESTOQ (NCODIPRODU);
create index FK_ADMESTOQ_ADMALMOX on ADMESTOQ (NCODIALMOX);
-- Create/Recreate primary, unique and foreign key constraints 
alter table ADMESTOQ
  add constraint PK_ADMESTOQ primary key (NCODIESTOQ)
  using index;
alter table ADMESTOQ
  add constraint FK_ADMESTOQ_ADMPRODU foreign key (NCODIPRODU)
  references ADMPRODU (NCODIPRODU);
alter table ADMESTOQ
  add constraint FK_ADMESTOQ_ADMALMOX foreign key (NCODIALMOX)
  references ADMALMOX (NCODIALMOX);