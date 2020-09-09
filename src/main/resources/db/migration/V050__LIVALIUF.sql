-- Create table
create table LIVALIUF
(
  nnumealiuf NUMBER not null,
  ncodiusuar NUMBER not null,
  ncodiempre NUMBER not null,
  ncodifilia NUMBER,
  ncodifinal NUMBER not null,
  ncodi_cfop NUMBER not null,
  ncodicompn NUMBER,
  ncodiregia NUMBER,
  ncodiestad NUMBER,
  ncodicateg NUMBER,
  ncodisbcat NUMBER,
  ncodiprodu NUMBER,
  ncfopaliuf NUMBER,
  nnumecompn NUMBER,
  nnumestcof NUMBER not null,
  nnumestpis NUMBER not null,
  cstataliuf VARCHAR2(10) not null,
  ddataaliuf DATE not null
);
-- Add comments to the table 
comment on table LIVALIUF
  is 'Aliquota por UF';
-- Add comments to the columns 
comment on column LIVALIUF.nnumealiuf
  is 'código da aliquota por UF';
comment on column LIVALIUF.ncodiusuar
  is 'código do usuário';
comment on column LIVALIUF.ncodiempre
  is 'código da empresa';
comment on column LIVALIUF.ncodifilia
  is 'código da filial';
comment on column LIVALIUF.ncodifinal
  is 'código da finalidade';
comment on column LIVALIUF.ncodi_cfop
  is 'código da natureza da operação CFOP';
comment on column LIVALIUF.ncodicompn
  is 'código do complemento de natureza de operação CFOP';
comment on column LIVALIUF.ncodiregia
  is 'código da região';
comment on column LIVALIUF.ncodiestad
  is 'código do estado';
comment on column LIVALIUF.ncodicateg
  is 'código da categoria de produto';
comment on column LIVALIUF.ncodisbcat
  is 'código da subcategoria de produto';
comment on column LIVALIUF.ncodiprodu
  is 'código do produto';
comment on column LIVALIUF.ncfopaliuf
  is 'código CFOP destino da aliquota por UF';
comment on column LIVALIUF.nnumecompn
  is 'código complemento de natureza de operação CFOP destino da aliquota por UF';
comment on column LIVALIUF.nnumestcof
  is 'ST cofins da aliquota por UF';
comment on column LIVALIUF.nnumestpis
  is 'ST pis da aliquota por UF';
comment on column LIVALIUF.cstataliuf
  is 'status da aliquota por UF(ATIVO/INATIVO)';
comment on column LIVALIUF.ddataaliuf
  is 'data de casdastro da aliquota por UF';
-- Create/Recreate indexes 
create index FK_LIVALIUF_ADMCATEG on LIVALIUF (NCODICATEG);
create index FK_LIVALIUF_ADMPRODU on LIVALIUF (NCODIPRODU);
create index FK_LIVALIUF_ADMSBCAT on LIVALIUF (NCODISBCAT);
create index FK_LIVALIUF_CADEMPRE on LIVALIUF (NCODIEMPRE);
create index FK_LIVALIUF_CADESTAD on LIVALIUF (NCODIESTAD);
create index FK_LIVALIUF_CADFILIA on LIVALIUF (NCODIFILIA);
create index FK_LIVALIUF_CADREGIA on LIVALIUF (NCODIREGIA);
create index FK_LIVALIUF_LIV_CFOP on LIVALIUF (NCODI_CFOP);
create index FK_LIVALIUF_LIV_CFOP1 on LIVALIUF (NCFOPALIUF);
create index FK_LIVALIUF_LIVCOMPN on LIVALIUF (NCODICOMPN);
create index FK_LIVALIUF_LIVCOMPN1 on LIVALIUF (NNUMECOMPN);
create index FK_LIVALIUF_LIVFINAL on LIVALIUF (NCODIFINAL);
create index FK_LIVALIUF_LIVPICOF on LIVALIUF (NNUMESTCOF);
create index FK_LIVALIUF_LIVPICOF1 on LIVALIUF (NNUMESTPIS);
create index FK_LIVALIUF_SEGUSUAR on LIVALIUF (NCODIUSUAR);
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIVALIUF
  add constraint PK_LIVALIUF primary key (NNUMEALIUF)
  using index;
alter table LIVALIUF
  add constraint FK_LIVALIUF_ADMCATEG foreign key (NCODICATEG)
  references ADMCATEG (NCODICATEG);
alter table LIVALIUF
  add constraint FK_LIVALIUF_ADMPRODU foreign key (NCODIPRODU)
  references ADMPRODU (NCODIPRODU);
alter table LIVALIUF
  add constraint FK_LIVALIUF_ADMSBCAT foreign key (NCODISBCAT)
  references ADMSBCAT (NCODISBCAT);
alter table LIVALIUF
  add constraint FK_LIVALIUF_CADEMPRE foreign key (NCODIEMPRE)
  references CADEMPRE (NCODIEMPRE);
alter table LIVALIUF
  add constraint FK_LIVALIUF_CADESTAD foreign key (NCODIESTAD)
  references CADESTAD (NCODIESTAD);
alter table LIVALIUF
  add constraint FK_LIVALIUF_CADFILIA foreign key (NCODIFILIA)
  references CADFILIA (NCODIFILIA);
alter table LIVALIUF
  add constraint FK_LIVALIUF_CADREGIA foreign key (NCODIREGIA)
  references CADREGIA (NCODIREGIA);
alter table LIVALIUF
  add constraint FK_LIVALIUF_LIV_CFOP foreign key (NCODI_CFOP)
  references LIV_CFOP (NCODI_CFOP);
alter table LIVALIUF
  add constraint FK_LIVALIUF_LIV_CFOP1 foreign key (NCFOPALIUF)
  references LIV_CFOP (NCODI_CFOP);
alter table LIVALIUF
  add constraint FK_LIVALIUF_LIVCOMPN foreign key (NCODICOMPN)
  references LIVCOMPN (NCODICOMPN);
alter table LIVALIUF
  add constraint FK_LIVALIUF_LIVCOMPN1 foreign key (NNUMECOMPN)
  references LIVCOMPN (NCODICOMPN);
alter table LIVALIUF
  add constraint FK_LIVALIUF_LIVFINAL foreign key (NCODIFINAL)
  references LIVFINAL (NCODIFINAL);
alter table LIVALIUF
  add constraint FK_LIVALIUF_LIVPICOF foreign key (NNUMESTCOF)
  references LIVPICOF (NCODIPICOF);
alter table LIVALIUF
  add constraint FK_LIVALIUF_LIVPICOF1 foreign key (NNUMESTPIS)
  references LIVPICOF (NCODIPICOF);
alter table LIVALIUF
  add constraint FK_LIVALIUF_SEGUSUAR foreign key (NCODIUSUAR)
  references SEGUSUAR (NCODIUSUAR);