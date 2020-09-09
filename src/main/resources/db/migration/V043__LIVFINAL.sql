-- Create table
create table LIVFINAL
(
  ncodifinal NUMBER not null,
  ncodiempre NUMBER not null,
  ncodiopera NUMBER not null,
  cdescfinal VARCHAR2(255) not null,
  nindpfinal NUMBER default 9 not null,
  nfnfefinal NUMBER default 1 not null,
  nfretfinal NUMBER default 9 not null,
  cstatfinal VARCHAR2(15) default 'ATIVO' not null
);
-- Add comments to the table 
comment on table LIVFINAL
  is 'Finalidade da Operação';
-- Add comments to the columns 
comment on column LIVFINAL.ncodifinal
  is 'código da finalidade da operação';
comment on column LIVFINAL.ncodiempre
  is 'código da emprea';
comment on column LIVFINAL.ncodiopera
  is 'código da operação de estoque';
comment on column LIVFINAL.cdescfinal
  is 'descrição da finalidade da operação';
comment on column LIVFINAL.nindpfinal
  is 'indicador de presenção(NFe) da finalidade da operação';
comment on column LIVFINAL.nfnfefinal
  is 'finalidade de emissao(NFe) da finalidade da operação';
comment on column LIVFINAL.nfretfinal
  is 'modalidade de frete(NFe) da finalidade da operação';
comment on column LIVFINAL.cstatfinal
  is 'status da finalidade da operação(ATIVO/INATIVO)';
-- Create/Recreate indexes 
create index FK_LIVFINAL_ADMOPERA on LIVFINAL (NCODIOPERA);
create index FK_LIVFINAL_CADEMPRE on LIVFINAL (NCODIEMPRE);
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIVFINAL
  add constraint PK_LIVFINAL primary key (NCODIFINAL)
  using index;
alter table LIVFINAL
  add constraint FK_LIVFINAL_ADMOPERA foreign key (NCODIOPERA)
  references ADMOPERA (NCODIOPERA);
alter table LIVFINAL
  add constraint FK_LIVFINAL_CADEMPRE foreign key (NCODIEMPRE)
  references CADEMPRE (NCODIEMPRE);
  
insert into LIVFINAL (NCODIFINAL, NCODIEMPRE, NCODIOPERA, CDESCFINAL, NINDPFINAL, NFNFEFINAL, NFRETFINAL, CSTATFINAL)
values (1, 1, 1, 'VENDA DE MERCADORIAS', 9, 1, 9, 'ATIVO');

insert into LIVFINAL (NCODIFINAL, NCODIEMPRE, NCODIOPERA, CDESCFINAL, NINDPFINAL, NFNFEFINAL, NFRETFINAL, CSTATFINAL)
values (2, 1, 2, 'COMPRA PARA ALMOXARIFADO', 9, 1, 9, 'ATIVO');  