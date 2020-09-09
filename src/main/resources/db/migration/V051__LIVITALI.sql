-- Create table
create table LIVITALI
(
  ncodiitali NUMBER not null,
  nnumealiuf NUMBER not null,
  ddataitali DATE not null,
  ncoditribu NUMBER not null,
  ncodicomen NUMBER,
  npicoitali NUMBER,
  ncodiajicm NUMBER,
  naliqitali NUMBER default 0 not null,
  nredaitali NUMBER default 0,
  nrbasitali NUMBER default 0,
  cpautitali VARCHAR2(10) default 'NÃO',
  nvpauitali NUMBER default 0,
  nalititali NUMBER default 0,
  dcadaitali DATE default SYSDATE
);
-- Add comments to the table 
comment on table LIVITALI
  is 'Item da Aliquota por UF';
-- Add comments to the columns 
comment on column LIVITALI.ncodiitali
  is 'código do item da aliquota por UF';
comment on column LIVITALI.nnumealiuf
  is 'código da aliquota por UF';
comment on column LIVITALI.ddataitali
  is 'data item da aliquota por UF';
comment on column LIVITALI.ncoditribu
  is 'código da tributação';
comment on column LIVITALI.ncodicomen
  is 'código do comentário fiscal';
comment on column LIVITALI.npicoitali
  is 'código do comentário pis/cofins ';
comment on column LIVITALI.ncodiajicm
  is 'código do ajuste de icms';
comment on column LIVITALI.naliqitali
  is 'aliquota de icms';
comment on column LIVITALI.nredaitali
  is 'percentual de redução na aliquota';
comment on column LIVITALI.nrbasitali
  is 'percentual de redução na base de calculo';
comment on column LIVITALI.cpautitali
  is 'pauta do item da aliquota por UF';
comment on column LIVITALI.nvpauitali
  is 'valor de pauta do item da aliquota por UF';
comment on column LIVITALI.nalititali
  is 'aliquota da entrada por transferencia do item da aliquota por UF';
comment on column LIVITALI.dcadaitali
  is 'data de cadastro do item da aliquota por UF';
-- Create/Recreate indexes 
create index FK_LIVITALI_LIVAJICM on LIVITALI (NCODIAJICM);
create index FK_LIVITALI_LIVALIUF on LIVITALI (NNUMEALIUF);
create index FK_LIVITALI_LIVCOMEN on LIVITALI (NCODICOMEN);
create index FK_LIVITALI_LIVCOMEN1 on LIVITALI (NPICOITALI);
create index FK_LIVITALI_LIVTRIBU on LIVITALI (NCODITRIBU);
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIVITALI
  add constraint PK_LIVITALI primary key (NCODIITALI)
  using index;
alter table LIVITALI
  add constraint UK_LIVITALI unique (NNUMEALIUF, DDATAITALI)
  using index;
alter table LIVITALI
  add constraint FK_LIVITALI_LIVAJICM foreign key (NCODIAJICM)
  references LIVAJICM (NCODIAJICM);
alter table LIVITALI
  add constraint FK_LIVITALI_LIVALIUF foreign key (NNUMEALIUF)
  references LIVALIUF (NNUMEALIUF);
alter table LIVITALI
  add constraint FK_LIVITALI_LIVCOMEN foreign key (NCODICOMEN)
  references LIVCOMEN (NCODICOMEN);
alter table LIVITALI
  add constraint FK_LIVITALI_LIVCOMEN1 foreign key (NPICOITALI)
  references LIVCOMEN (NCODICOMEN);
alter table LIVITALI
  add constraint FK_LIVITALI_LIVTRIBU foreign key (NCODITRIBU)
  references LIVTRIBU (NCODITRIBU);