-- Create table
create table LIVITMOV
(
  ncodiitmov NUMBER not null,
  ncodimovim NUMBER not null,
  ncodiprodu NUMBER not null,
  ncodi_cfop NUMBER not null,
  ncodicompn NUMBER not null,
  ncodiorige NUMBER not null,
  ncoditribu NUMBER not null,
  ncodiunida NUMBER not null,
  ccproitmov VARCHAR2(60),
  cdproitmov VARCHAR2(120),
  ccestmovim VARCHAR2(10),
  cncm_movim VARCHAR2(10),
  canp_movim VARCHAR2(12),
  cajusmovim VARCHAR2(10),
  nquatitmov NUMBER(19,3) default 1 not null,
  nvlruitmov NUMBER(19,10) default 0 not null,
  nvlrcitmov NUMBER(19,10) default 0 not null,
  naicmitmov NUMBER(7,4) default 0 not null,
  nricmitmov NUMBER(7,4) default 0 not null,
  nvbciitmov NUMBER(19,2) default 0 not null,
  nvicmitmov NUMBER(19,2) default 0 not null,
  nvicditmov NUMBER(19,2) default 0 not null,
  nfcpiitmov NUMBER(19,2) default 0 not null,
  nicmiitmov NUMBER(19,2) default 0 not null,
  nicmritmov NUMBER(19,2) default 0 not null,
  nvfcpitmov NUMBER(19,2) default 0 not null,
  naistitmov NUMBER(7,4) default 0 not null,
  nristitmov NUMBER(7,4) default 0 not null,
  nvbstitmov NUMBER(19,2) default 0 not null,
  nvlstitmov NUMBER(19,2) default 0 not null,
  nfcpsitmov NUMBER(19,2) default 0 not null,
  nfcpritmov NUMBER(19,2) default 0 not null,
  nbisaitmov NUMBER(19,2) default 0 not null,
  nvisaitmov NUMBER(19,2) default 0 not null,
  nvtopitmov NUMBER(19,2) default 0 not null,
  nvfreitmov NUMBER(19,2) default 0 not null,
  nvsegitmov NUMBER(19,2) default 0 not null,
  nvdesitmov NUMBER(19,2) default 0 not null,
  nvliiitmov NUMBER(19,2) default 0 not null,
  ncodi_cipi NUMBER,
  ncodialipi NUMBER,
  naipiitmov NUMBER(7,4) default 0 not null,
  nripiitmov NUMBER(7,4) default 0 not null,
  nbipiitmov NUMBER(19,2) default 0 not null,
  nvipiitmov NUMBER(19,2) default 0 not null,
  nipiditmov NUMBER(19,2) default 0 not null,
  ncodicspis NUMBER,
  napisitmov NUMBER(7,4) default 0 not null,
  nrpisitmov NUMBER(7,4) default 0 not null,
  nbpisitmov NUMBER(19,2) default 0 not null,
  nvpisitmov NUMBER(19,2) default 0 not null,
  ncodicscof NUMBER,
  nacofitmov NUMBER(7,4) default 0 not null,
  nrcofitmov NUMBER(19,2) default 0 not null,
  nbcofitmov NUMBER(19,2) default 0 not null,
  nvcofitmov NUMBER(19,2) default 0 not null,
  nvoutitmov NUMBER(19,2) default 0 not null,
  nairritmov NUMBER(7,4) default 0 not null,
  nbirritmov NUMBER(19,2) default 0 not null,
  nirrfitmov NUMBER(19,2) default 0 not null,
  nainsitmov NUMBER(7,4) default 0 not null,
  nbinsitmov NUMBER(19,2) default 0 not null,
  ninssitmov NUMBER(19,2) default 0 not null,
  naissitmov NUMBER(7,4) default 0 not null,
  nbissitmov NUMBER(19,2) default 0 not null,
  nvissitmov NUMBER(19,2) default 0 not null,
  nacslitmov NUMBER(7,4) default 0 not null,
  nbcslitmov NUMBER(19,2) default 0 not null,
  ncsllitmov NUMBER(19,2) default 0 not null,
  nttriitmov NUMBER(19,2) default 0 not null,
  cinfaitmov VARCHAR2(500)
);
-- Add comments to the table 
comment on table LIVITMOV
  is 'Itens de Movimentação';
-- Add comments to the columns 
comment on column LIVITMOV.ncodiitmov
  is 'código do item do movimento';
comment on column LIVITMOV.ncodimovim
  is 'código do movimento';
comment on column LIVITMOV.ncodiprodu
  is 'código do produto';
comment on column LIVITMOV.ncodi_cfop
  is 'código da natureza de operação';
comment on column LIVITMOV.ncodicompn
  is 'código do complemento de natureza de operação';
comment on column LIVITMOV.ncodiorige
  is 'código da origem de produto';
comment on column LIVITMOV.ncoditribu
  is 'código da tributação fiscal';
comment on column LIVITMOV.ncodiunida
  is 'código da unidade de medida';
comment on column LIVITMOV.ccproitmov
  is 'código do produto do item do movimento';
comment on column LIVITMOV.cdproitmov
  is 'descrição do produto do item do movimento';  
comment on column LIVITMOV.ccestmovim
  is 'código cest do item do movimento';   
comment on column LIVITMOV.cncm_movim
  is 'código ncm do item do movimento'; 
comment on column LIVITMOV.canp_movim
  is 'código anp do item do movimento';  
comment on column LIVITMOV.cajusmovim
  is 'código ajuste de icms do item do movimento';    
comment on column LIVITMOV.nquatitmov
  is 'quantidade do produto/serviço do item do movimento';
comment on column LIVITMOV.nvlruitmov
  is 'valor unitário do produto/serviço do item do movimento';
comment on column LIVITMOV.nvlrcitmov
  is 'valor de custo do produto/serviço do item do movimento';
comment on column LIVITMOV.naicmitmov
  is 'aliquota de icms do produto/serviço do item do movimento';
comment on column LIVITMOV.nricmitmov
  is 'aliquota de reduçao do icms do  produto/serviço do item do movimento';
comment on column LIVITMOV.nvbciitmov
  is 'base de calculo do icms do produto/serviço do item do movimento';
comment on column LIVITMOV.nvicmitmov
  is 'valor do icms do produto/serviço do item do movimento';
comment on column LIVITMOV.nvicditmov
  is 'valor do icms desonerado do produto/serviço do item do movimento';
comment on column LIVITMOV.nfcpiitmov
  is 'valor do ICMS relativo Fundo de Combate à Pobreza (FCP) da UF de destino do item movimento';
comment on column LIVITMOV.nicmiitmov
  is 'valor do ICMS Interestadual para a UF de destino do item movimento';
comment on column LIVITMOV.nicmritmov
  is 'valor do ICMS Interestadual para a UF do remetente do item movimento';  
comment on column LIVITMOV.nvfcpitmov
  is 'valor de FCP produto/serviço do item do movimento';
comment on column LIVITMOV.naistitmov
  is 'aliquota do icms ST do produto/serviço do item do movimento';
comment on column LIVITMOV.nristitmov
  is 'aliquota de redução do icms ST do produto/serviço do item do movimento';
comment on column LIVITMOV.nvbstitmov
  is 'base calculo do icms ST do produto/serviço do item do movimento';
comment on column LIVITMOV.nvlstitmov
  is 'valor do icms ST do produto/serviço do item do movimento';
comment on column LIVITMOV.nfcpsitmov
  is 'valor do FCP do icms ST do produto/serviço do item do movimento';
comment on column LIVITMOV.nfcpritmov
  is 'valor do FCP do icms ST retido anteriormente do produto/serviço do item do movimento';
comment on column LIVITMOV.nbisaitmov
  is 'base icms ST retido anteriormente do produto/serviço do item do movimento';
comment on column LIVITMOV.nvisaitmov
  is 'valor icms ST retido anteriormente do produto/serviço do item do movimento';  
comment on column LIVITMOV.nvtopitmov
  is 'valor total do produto/serviço do item do movimento';
comment on column LIVITMOV.nvfreitmov
  is 'valor de frete do produto/serviço do item do movimento';
comment on column LIVITMOV.nvsegitmov
  is 'valor de seguro do produto/serviço do item do movimento';
comment on column LIVITMOV.nvdesitmov
  is 'valor de desconto do produto/serviço do item do movimento';
comment on column LIVITMOV.nvliiitmov
  is 'valor de imposto importado do produto/serviço do item do movimento';
comment on column LIVITMOV.ncodi_cipi
  is 'código IPI';
comment on column LIVITMOV.ncodialipi
  is 'código Aliquota de IPI';
comment on column LIVITMOV.naipiitmov
  is 'aliquota de IPI do produto/serviço do item do movimento';
comment on column LIVITMOV.nripiitmov
  is 'aliquota de redução de IPI do produto/serviço do item do movimento';
comment on column LIVITMOV.nbipiitmov
  is 'base de calculo de IPI do produto/serviço do item do movimento';
comment on column LIVITMOV.nvipiitmov
  is 'valor de IPI do produto/serviço do item do movimento';
comment on column LIVITMOV.nipiditmov
  is 'valor de IPI devolvido do produto/serviço do item do movimento';
comment on column LIVITMOV.ncodicspis
  is 'código PIS';
comment on column LIVITMOV.napisitmov
  is 'aliquota PIS do produto/serviço do item do movimento';
comment on column LIVITMOV.nrpisitmov
  is 'aliquota redução PIS do produto/serviço do item do movimento';
comment on column LIVITMOV.nbpisitmov
  is 'base de calculo PIS do produto/serviço do item do movimento';
comment on column LIVITMOV.nvpisitmov
  is 'valor de PIS do produto/serviço do item do movimento';
comment on column LIVITMOV.ncodicscof
  is 'código COFINS';
comment on column LIVITMOV.nacofitmov
  is 'aliquota COFINS do produto/serviço do item do movimento';
comment on column LIVITMOV.nrcofitmov
  is 'aliquota redução COFINS do produto/serviço do item do movimento';
comment on column LIVITMOV.nbcofitmov
  is 'base de calculo COFINS do produto/serviço do item do movimento';
comment on column LIVITMOV.nvcofitmov
  is 'valor de COFINS do produto/serviço do item do movimento';
comment on column LIVITMOV.nvoutitmov
  is 'outras despesas do produto/serviço do item do movimento';
comment on column LIVITMOV.nairritmov
  is 'aliquota IRRF do produto/serviço do item do movimento';
comment on column LIVITMOV.nbirritmov
  is 'base de calculo IRRF do produto/serviço do item do movimento';
comment on column LIVITMOV.nirrfitmov
  is 'valor IRRF do produto/serviço do item do movimento';
comment on column LIVITMOV.nainsitmov
  is 'aliquota INSS do produto/serviço do item do movimento';
comment on column LIVITMOV.nbinsitmov
  is 'base de calculo INSS do produto/serviço do item do movimento';
comment on column LIVITMOV.ninssitmov
  is 'valor de INSS do produto/serviço do item do movimento';
comment on column LIVITMOV.naissitmov
  is 'aliquota de ISS do produto/serviço do item do movimento';
comment on column LIVITMOV.nbissitmov
  is 'base de calculo de ISS do produto/serviço do item do movimento';
comment on column LIVITMOV.nvissitmov
  is 'valor de ISS do produto/serviço do item do movimento';
comment on column LIVITMOV.nacslitmov
  is 'aliquota de CSLL do produto/serviço do item do movimento';
comment on column LIVITMOV.nbcslitmov
  is 'base de calculo de CSLL do produto/serviço do item do movimento';
comment on column LIVITMOV.ncsllitmov
  is 'valor de CSLL do produto/serviço do item do movimento';
comment on column LIVITMOV.nttriitmov
  is 'valor total de tributos do produto/serviço do item do movimento';
comment on column LIVITMOV.cinfaitmov
  is 'informação adicional do produto/serviço do item do movimento';
-- Create/Recreate indexes 
create index FK_LIVITMOV_LIVMOVIM on LIVITMOV (NCODIMOVIM);
create index FK_LIVITMOV_ADMPRODU on LIVITMOV (NCODIPRODU);
create index FK_LIVITMOV_LIVALIPI on LIVITMOV (NCODIALIPI);
create index FK_LIVITMOV_LIV_CFOP on LIVITMOV (NCODI_CFOP);
create index FK_LIVITMOV_LIV_CIPI on LIVITMOV (NCODI_CIPI);
create index FK_LIVITMOV_LIVCOMPN on LIVITMOV (NCODICOMPN);
create index FK_LIVITMOV_LIVORIGE on LIVITMOV (NCODIORIGE);
create index FK_LIVITMOV_LIVPICOF on LIVITMOV (NCODICSPIS);
create index FK_LIVITMOV_LIVPICOF2 on LIVITMOV (NCODICSCOF);
create index FK_LIVITMOV_LIVTRIBU on LIVITMOV (NCODITRIBU);
create index FK_LIVITMOV_LIVUNIDA on LIVITMOV (NCODIUNIDA);  
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIVITMOV
  add constraint PK_LIVITMOV primary key (NCODIITMOV)
  using index;
alter table LIVITMOV
  add constraint FK_LIVITMOV_LIVMOVIM foreign key (NCODIMOVIM)
  references LIVMOVIM (NCODIMOVIM);
alter table LIVITMOV
  add constraint FK_LIVITMOV_ADMPRODU foreign key (NCODIPRODU)
  references ADMPRODU (NCODIPRODU);
alter table LIVITMOV
  add constraint FK_LIVITMOV_LIVALIPI foreign key (NCODIALIPI)
  references LIVALIPI (NCODIALIPI);
alter table LIVITMOV
  add constraint FK_LIVITMOV_LIV_CFOP foreign key (NCODI_CFOP)
  references LIV_CFOP (NCODI_CFOP);
alter table LIVITMOV
  add constraint FK_LIVITMOV_LIV_CIPI foreign key (NCODI_CIPI)
  references LIV_CIPI (NCODI_CIPI);
alter table LIVITMOV
  add constraint FK_LIVITMOV_LIVCOMPN foreign key (NCODICOMPN)
  references LIVCOMPN (NCODICOMPN);
alter table LIVITMOV
  add constraint FK_LIVITMOV_LIVORIGE foreign key (NCODIORIGE)
  references LIVORIGE (NCODIORIGE);
alter table LIVITMOV
  add constraint FK_LIVITMOV_LIVPICOF foreign key (NCODICSPIS)
  references LIVPICOF (NCODIPICOF);
alter table LIVITMOV
  add constraint FK_LIVITMOV_LIVPICOF2 foreign key (NCODICSCOF)
  references LIVPICOF (NCODIPICOF);
alter table LIVITMOV
  add constraint FK_LIVITMOV_LIVTRIBU foreign key (NCODITRIBU)
  references LIVTRIBU (NCODITRIBU);
alter table LIVITMOV
  add constraint FK_LIVITMOV_LIVUNIDA foreign key (NCODIUNIDA)
  references LIVUNIDA (NCODIUNIDA);