-- Create table
create table LIVMODEL
(
  ncodimodel NUMBER not null,
  ccodimodel VARCHAR2(4) not null,
  cdescmodel VARCHAR2(255) not null,
  csiglmodel VARCHAR2(15) not null
);
-- Add comments to the table 
comment on table LIVMODEL
  is 'Modelo de Documentos Fiscais';
-- Add comments to the columns 
comment on column LIVMODEL.ncodimodel
  is 'código do modelo fiscal';
comment on column LIVMODEL.ccodimodel
  is 'código literal do modelo fiscal';
comment on column LIVMODEL.cdescmodel
  is 'descrição do modelo fiscal';
comment on column LIVMODEL.csiglmodel
  is 'sigla do modelo fiscal';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIVMODEL
  add constraint PK_LIVMODEL primary key (NCODIMODEL)
  using index;
alter table LIVMODEL
  add constraint UK_LIVMODEL unique (CCODIMODEL)
  using index;
  
insert into LIVMODEL (NCODIMODEL, CCODIMODEL, CDESCMODEL, CSIGLMODEL)
values (1, '1', 'Nota Fiscal', 'NF');

insert into LIVMODEL (NCODIMODEL, CCODIMODEL, CDESCMODEL, CSIGLMODEL)
values (2, '55', 'Nota Fiscal Eletrônica', 'NF-e');

insert into LIVMODEL (NCODIMODEL, CCODIMODEL, CDESCMODEL, CSIGLMODEL)
values (3, '57', 'Conhecimento de Transporte Eletrônico', 'CT-e');

insert into LIVMODEL (NCODIMODEL, CCODIMODEL, CDESCMODEL, CSIGLMODEL)
values (4, '65', 'Nota Fiscal de Venda a Consumidor Final', 'NFC-e');

insert into LIVMODEL (NCODIMODEL, CCODIMODEL, CDESCMODEL, CSIGLMODEL)
values (5, '67', 'Conhecimento de Transporte de Pessoas, Valores e Bagagens', 'CT-e OS');

insert into LIVMODEL (NCODIMODEL, CCODIMODEL, CDESCMODEL, CSIGLMODEL)
values (6, '58', 'Manifesto Eletrônico de Documentos Fiscais', 'MDF-e');

insert into LIVMODEL (NCODIMODEL, CCODIMODEL, CDESCMODEL, CSIGLMODEL)
values (7, '0', 'Aviso de Lançamento', 'Aviso');  