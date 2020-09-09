-- Create table
create table ADMOPERA
(
  ncodiopera NUMBER not null,
  ncodiempre NUMBER not null,
  cdescopera VARCHAR2(255) not null,
  ctipoopera VARCHAR2(15) default 'SAÍDA' not null,
  cmoveopera VARCHAR2(10) default 'SIM' not null,
  cstatopera VARCHAR2(15) default 'ATIVO' not null,
  ddataopera DATE default SYSDATE not null
);
-- Add comments to the table 
comment on table ADMOPERA
  is 'Operação para Movimentação de Estoque';
-- Add comments to the columns 
comment on column ADMOPERA.ncodiopera
  is 'código da operação de estoque';
comment on column ADMOPERA.ncodiempre
  is 'código da empresa';
comment on column ADMOPERA.cdescopera
  is 'descrição da operação de estoque';
comment on column ADMOPERA.ctipoopera
  is 'tipo da operação de estoque(SAÍDA/ENTRADA)';
comment on column ADMOPERA.cmoveopera
  is 'operação de estoque movimenta estoque(SIM/NÃO)';
comment on column ADMOPERA.cstatopera
  is 'status da operação de estoque(ATIVO/INATIVO)';
comment on column ADMOPERA.ddataopera
  is 'data de cadastro da operação de estoque';
-- Create/Recreate indexes 
create index FK_ADMOPERA_CADEMPRE on ADMOPERA (NCODIEMPRE);
-- Create/Recreate primary, unique and foreign key constraints 
alter table ADMOPERA
  add constraint PK_ADMOPERA primary key (NCODIOPERA)
  using index;
alter table ADMOPERA
  add constraint FK_ADMOPERA_CADEMPRE foreign key (NCODIEMPRE)
  references CADEMPRE (NCODIEMPRE);
  
insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (1, 1, 'VENDA', 'SAÍDA', 'SIM', 'ATIVO', to_date('27-08-2019 12:21:28', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (2, 1, 'COMPRA', 'ENTRADA', 'SIM', 'ATIVO', to_date('27-08-2019 12:21:45', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (3, 1, 'DEVOLUÇÃO DE VENDA', 'ENTRADA', 'SIM', 'ATIVO', to_date('27-08-2019 12:22:07', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (4, 1, 'DEVOLUÇÃO DE COMPRA', 'SAÍDA', 'SIM', 'ATIVO', to_date('27-08-2019 12:22:32', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (5, 1, 'TRANSFERÊNCIA DE SAÍDA', 'SAÍDA', 'SIM', 'ATIVO', to_date('27-08-2019 12:26:42', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (6, 1, 'TRANSFERÊNCIA DE ENTRADA', 'ENTRADA', 'SIM', 'ATIVO', to_date('27-08-2019 12:26:42', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (7, 1, 'VENDA MANUAL', 'SAÍDA', 'NÃO', 'ATIVO', to_date('27-08-2019 12:26:42', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (8, 1, 'COMPRA MANUAL', 'ENTRADA', 'NÃO', 'ATIVO', to_date('27-08-2019 12:26:42', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (9, 1, 'OUTRAS ENTRADAS', 'ENTRADA', 'SIM', 'ATIVO', to_date('27-08-2019 12:26:42', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (10, 1, 'OUTRAS SAÍDAS', 'SAÍDA', 'SIM', 'ATIVO', to_date('27-08-2019 12:26:42', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (11, 1, 'OUTRAS ENTRADAS MANUAL', 'ENTRADA', 'NÃO', 'ATIVO', to_date('27-08-2019 12:26:43', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (12, 1, 'OUTRAS SAÍDAS MANUAL', 'SAÍDA', 'NÃO', 'ATIVO', to_date('27-08-2019 12:26:43', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (13, 1, 'DEVOLUÇÃO DE VENDA MANUAL', 'ENTRADA', 'NÃO', 'ATIVO', to_date('27-08-2019 12:26:43', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (14, 1, 'DEVOLUÇÃO DE COMPRA MANUAL', 'SAÍDA', 'NÃO', 'ATIVO', to_date('27-08-2019 12:26:43', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (15, 1, 'QUEBRA TÉCNICA', 'SAÍDA', 'SIM', 'ATIVO', to_date('27-08-2019 12:43:23', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (16, 1, 'SOBRA TÉCNICA', 'ENTRADA', 'SIM', 'ATIVO', to_date('27-08-2019 12:43:23', 'dd-mm-yyyy hh24:mi:ss'));

insert into ADMOPERA (NCODIOPERA, NCODIEMPRE, CDESCOPERA, CTIPOOPERA, CMOVEOPERA, DSTATOPERA, CDATAOPERA)
values (17, 1, 'USO PRÓPRIO', 'SAÍDA', 'SIM', 'ATIVO', to_date('27-08-2019 12:43:23', 'dd-mm-yyyy hh24:mi:ss'));  