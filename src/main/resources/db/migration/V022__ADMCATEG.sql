-- Create table
create table ADMCATEG
(
  ncodicateg NUMBER not null,
  ncodiempre NUMBER not null,
  ccodicateg VARCHAR2(4) not null,
  cdesccateg VARCHAR2(255) not null,
  nprvecateg NUMBER,
  nprdvcateg NUMBER,
  npdcocateg NUMBER,
  npddccateg NUMBER
);
-- Add comments to the table 
comment on table ADMCATEG
  is 'Categoria Produto';
-- Add comments to the columns 
comment on column ADMCATEG.ncodicateg
  is 'código da categoria de produto';
comment on column ADMCATEG.ncodiempre
  is 'código da empresa';
comment on column ADMCATEG.ccodicateg
  is 'código literal da categoria de produto';
comment on column ADMCATEG.cdesccateg
  is 'descrição da categoria de produto';
comment on column ADMCATEG.nprvecateg
  is 'plano do receita para venda da categoria de produto';
comment on column ADMCATEG.nprdvcateg
  is 'plano do receita para devolução venda da categoria de produto';
comment on column ADMCATEG.npdcocateg
  is 'plano do despesa para compra da categoria de produto';
comment on column ADMCATEG.npddccateg
  is 'plano do despesa para devolução de compra da categoria de produto';
-- Create/Recreate indexes 
create index FK_ADMCATEG_CADEMPRE on ADMCATEG (NCODIEMPRE);
create index FK_ADMCATEG_TESPREDE1 on ADMCATEG (NPRVECATEG);
create index FK_ADMCATEG_TESPREDE2 on ADMCATEG (NPRDVCATEG);
create index FK_ADMCATEG_TESPREDE3 on ADMCATEG (NPDCOCATEG);
create index FK_ADMCATEG_TESPREDE4 on ADMCATEG (NPDDCCATEG);
-- Create/Recreate primary, unique and foreign key constraints 
alter table ADMCATEG
  add constraint PK_ADMCATEG primary key (NCODICATEG)
  using index;
alter table ADMCATEG
  add constraint UK_ADMCATEG unique (NCODIEMPRE, CCODICATEG)
  using index;  
alter table ADMCATEG
  add constraint FK_ADMCATEG_CADEMPRE foreign key (NCODIEMPRE)
  references CADEMPRE (NCODIEMPRE);
alter table ADMCATEG
  add constraint FK_ADMCATEG_TESPREDE1 foreign key (NPRVECATEG)
  references TESPREDE (NCODIPREDE);
alter table ADMCATEG
  add constraint FK_ADMCATEG_TESPREDE2 foreign key (NPRDVCATEG)
  references TESPREDE (NCODIPREDE);
alter table ADMCATEG
  add constraint FK_ADMCATEG_TESPREDE3 foreign key (NPDCOCATEG)
  references TESPREDE (NCODIPREDE);
alter table ADMCATEG
  add constraint FK_ADMCATEG_TESPREDE4 foreign key (NPDDCCATEG)
  references TESPREDE (NCODIPREDE);
  
insert into ADMCATEG (NCODICATEG, NCODIEMPRE, CCODICATEG, CDESCCATEG, NPRVECATEG, NPRDVCATEG, NPDCOCATEG, NPDDCCATEG)
values (1, 1, '1000', 'COMBUSTÍVEIS', 1, null, 5, null);  