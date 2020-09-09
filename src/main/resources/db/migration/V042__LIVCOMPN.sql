-- Create table
create table LIVCOMPN
(
  ncodicompn NUMBER not null,
  ncodiempre NUMBER not null,
  ncodi_cfop NUMBER not null,
  nnumecompn NUMBER not null,
  cdesccompn VARCHAR2(255) not null,
  cmovfcompn VARCHAR2(10) DEFAULT 'SIM' not null,
  cprvicompn VARCHAR2(15),
  cstatcompn VARCHAR2(15) DEFAULT 'ATIVO' not null
);
-- Add comments to the table 
comment on table LIVCOMPN
  is 'Complemento de Natureza - CFOP';
-- Add comments to the columns 
comment on column LIVCOMPN.ncodicompn
  is 'código do complemento de natureza de operação';
comment on column LIVCOMPN.ncodiempre
  is 'código da empresa';
comment on column LIVCOMPN.ncodi_cfop
  is 'código da natureza de operaçao';
comment on column LIVCOMPN.nnumecompn
  is 'número do complemento de natureza de operação';
comment on column LIVCOMPN.cdesccompn
  is 'descrição do complemento de natureza de operação';
comment on column LIVCOMPN.cmovfcompn
  is 'gera movimento financeiro(SIM/NÃO) do complemento de natureza de operação';
comment on column LIVCOMPN.cprvicompn
  is 'a (PRAZO/VISTA) do complemento de natureza de operação';  
comment on column LIVCOMPN.cstatcompn
  is 'status do complemento de natureza de operação';
-- Create/Recreate indexes 
create index FK_LIVCOMPN_CADEMPRE on LIVCOMPN (NCODIEMPRE);
create index FK_LIVCOMPN_LIV_CFOP on LIVCOMPN (NCODI_CFOP);
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIVCOMPN
  add constraint PK_LIVCOMPN primary key (NCODICOMPN)
  using index;
alter table LIVCOMPN
  add constraint UK_LIVCOMPN unique (NCODIEMPRE, NCODI_CFOP, NNUMECOMPN)
  using index;
alter table LIVCOMPN
  add constraint FK_LIVCOMPN_CADEMPRE foreign key (NCODIEMPRE)
  references CADEMPRE (NCODIEMPRE);
alter table LIVCOMPN
  add constraint FK_LIVCOMPN_LIV_CFOP foreign key (NCODI_CFOP)
  references LIV_CFOP (NCODI_CFOP);
  
insert into LIVCOMPN (NCODICOMPN, NCODIEMPRE, NCODI_CFOP, NNUMECOMPN, CDESCCOMPN, CMOVFCOMPN, CPRVICOMPN, CSTATCOMPN)
values (1, 1, 1, 1, 'VENDA A VISTA', 'SIM', 'VISTA', 'ATIVO');

insert into LIVCOMPN (NCODICOMPN, NCODIEMPRE, NCODI_CFOP, NNUMECOMPN, CDESCCOMPN, CMOVFCOMPN, CPRVICOMPN, CSTATCOMPN)
values (2, 1, 1, 2, 'VENDA A PRAZO', 'SIM', 'PRAZO', 'ATIVO');

insert into LIVCOMPN (NCODICOMPN, NCODIEMPRE, NCODI_CFOP, NNUMECOMPN, CDESCCOMPN, CMOVFCOMPN, CPRVICOMPN, CSTATCOMPN)
values (3, 1, 3, 1, 'COMPRA A VISTA', 'SIM', 'VISTA', 'ATIVO');

insert into LIVCOMPN (NCODICOMPN, NCODIEMPRE, NCODI_CFOP, NNUMECOMPN, CDESCCOMPN, CMOVFCOMPN, CPRVICOMPN, CSTATCOMPN)
values (4, 1, 3, 2, 'COMPRA A PRAZO', 'SIM', 'PRAZO', 'ATIVO');
  