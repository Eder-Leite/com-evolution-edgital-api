-- Create table
create table ADMSBCAT
(
  ncodisbcat NUMBER not null,
  ncodicateg NUMBER not null,
  ccodisbcat VARCHAR2(4) not null,
  cdescsbcat VARCHAR2(255) not null,
  nprvesbcat NUMBER,
  nprdvsbcat NUMBER,
  npdcosbcat NUMBER,
  npddcsbcat NUMBER
);
-- Add comments to the table 
comment on table ADMSBCAT
  is 'SubCategoria de Produto';
-- Add comments to the columns 
comment on column ADMSBCAT.ncodisbcat
  is 'código da subcategoria de produto';
comment on column ADMSBCAT.ncodicateg
  is 'código da categoria de produto';
comment on column ADMSBCAT.ccodisbcat
  is 'código literal da subcategoria de produto';
comment on column ADMSBCAT.cdescsbcat
  is 'descrição da subcategoria de produto';
comment on column ADMSBCAT.nprvesbcat
  is 'plano de receita para venda da subcategoria de produto';
comment on column ADMSBCAT.nprdvsbcat
  is 'plano de receita para devolução venda da subcategoria de produto';
comment on column ADMSBCAT.npdcosbcat
  is 'plano de despesa para compra da subcategoria de produto';
comment on column ADMSBCAT.npddcsbcat
  is 'plano de despesa para devolução de compra da subcategoria de produto';
-- Create/Recreate primary, unique and foreign key constraints 
alter table ADMSBCAT
  add constraint PK_ADMSBCAT primary key (NCODISBCAT)
  using index;
alter table ADMSBCAT
  add constraint UK_ADMSBCAT unique (NCODICATEG, CCODISBCAT)
  using index;  
alter table ADMSBCAT
  add constraint FK_ADMSBCAT_ADMCATEG foreign key (NCODICATEG)
  references ADMCATEG (NCODICATEG);
alter table ADMSBCAT
  add constraint FK_ADMSBCAT_TESPREDE1 foreign key (NPRVESBCAT)
  references TESPREDE (NCODIPREDE);
alter table ADMSBCAT
  add constraint FK_ADMSBCAT_TESPREDE2 foreign key (NPRDVSBCAT)
  references TESPREDE (NCODIPREDE);
alter table ADMSBCAT
  add constraint FK_ADMSBCAT_TESPREDE3 foreign key (NPDCOSBCAT)
  references TESPREDE (NCODIPREDE);
alter table ADMSBCAT
  add constraint FK_ADMSBCAT_TESPREDE4 foreign key (NPDDCSBCAT)
  references TESPREDE (NCODIPREDE);
  
insert into ADMSBCAT (NCODISBCAT, NCODICATEG, CCODISBCAT, CDESCSBCAT, NPRVESBCAT, NPRDVSBCAT, NPDCOSBCAT, NPDDCSBCAT)
values (1, 1, '1001', 'ETANOL HIDRATADO', null, null, null, null);

insert into ADMSBCAT (NCODISBCAT, NCODICATEG, CCODISBCAT, CDESCSBCAT, NPRVESBCAT, NPRDVSBCAT, NPDCOSBCAT, NPDDCSBCAT)
values (2, 1, '1002', 'GASOLINA ORIGINAL ADITIVADA C COMUM', null, null, null, null);

insert into ADMSBCAT (NCODISBCAT, NCODICATEG, CCODISBCAT, CDESCSBCAT, NPRVESBCAT, NPRDVSBCAT, NPDCOSBCAT, NPDDCSBCAT)
values (3, 1, '1003', 'ÓLEO DIESEL B S10 COMUM', null, null, null, null);

insert into ADMSBCAT (NCODISBCAT, NCODICATEG, CCODISBCAT, CDESCSBCAT, NPRVESBCAT, NPRDVSBCAT, NPDCOSBCAT, NPDDCSBCAT)
values (4, 1, '1004', 'ÓLEO DIESEL B S500 COMUM', null, null, null, null);
  