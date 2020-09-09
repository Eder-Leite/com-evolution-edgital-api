-- Create table
create table LIVMOVIM
(
  ncodimovim NUMBER not null,
  ncodifilia NUMBER not null,
  ncodigeral NUMBER not null,
  ncodiender NUMBER not null,
  ncodifinal NUMBER not null,
  ncodimodel NUMBER not null,
  ncodiserie NUMBER not null,
  nindpmovim NUMBER not null,
  nconfmovim NUMBER not null,
  cdescmovim VARCHAR2(120),
  cmanumovim VARCHAR2(10) default 'NÃO' not null,
  cemipmovim VARCHAR2(10) default 'NÃO' not null,
  ndocumovim NUMBER not null,
  csitumovim VARCHAR2(15) default 'ABERTO' NOT NULL,
  chavemovim VARCHAR2(44),
  ddatamovim DATE not null,
  densamovim DATE not null,
  ddtcamovim DATE default SYSDATE not null,
  nvbcimovim NUMBER(19,2) default 0 not null,
  nvicmmovim NUMBER(19,2) default 0 not null,
  nvicdmovim NUMBER(19,2) default 0 not null,
  nfcpimovim NUMBER(19,2) default 0 not null,
  nicmimovim NUMBER(19,2) default 0 not null,
  nicmrmovim NUMBER(19,2) default 0 not null,
  nvfcpmovim NUMBER(19,2) default 0 not null,
  nvbstmovim NUMBER(19,2) default 0 not null,
  nvlstmovim NUMBER(19,2) default 0 not null,
  nfcpsmovim NUMBER(19,2) default 0 not null,
  nfcprmovim NUMBER(19,2) default 0 not null,
  nvtopmovim NUMBER(19,2) default 0 not null,
  nvfremovim NUMBER(19,2) default 0 not null,
  nvsegmovim NUMBER(19,2) default 0 not null,
  nvdesmovim NUMBER(19,2) default 0 not null,
  nvliimovim NUMBER(19,2) default 0 not null,
  nvipimovim NUMBER(19,2) default 0 not null,
  nipidmovim NUMBER(19,2) default 0 not null,
  nvpismovim NUMBER(19,2) default 0 not null,
  nvcofmovim NUMBER(19,2) default 0 not null,
  nvoutmovim NUMBER(19,2) default 0 not null,
  nirrfmovim NUMBER(19,2) default 0 not null,
  ninssmovim NUMBER(19,2) default 0 not null,
  nvissmovim NUMBER(19,2) default 0 not null,
  ncsllmovim NUMBER(19,2) default 0 not null,
  ntotamovim NUMBER(19,2) default 0 not null,
  nttrimovim NUMBER(19,2) default 0 not null,
  cfiscmovim VARCHAR2(2000),
  cicommovim VARCHAR2(4000),
  cobsemovim VARCHAR2(4000)
);
-- Add comments to the table 
comment on table LIVMOVIM
  is 'Movimentação';
-- Add comments to the columns 
comment on column LIVMOVIM.ncodimovim
  is 'código do movimento';
comment on column LIVMOVIM.ncodifilia
  is 'código da filial';
comment on column LIVMOVIM.ncodigeral
  is 'código do cadastro geral';
comment on column LIVMOVIM.ncodiender
  is 'código do endereço';
comment on column LIVMOVIM.ncodifinal
  is 'código da finalidade de operação';
comment on column LIVMOVIM.ncodimodel
  is 'código do modelo fiscal';
comment on column LIVMOVIM.ncodiserie
  is 'código da serie fiscal';
comment on column LIVMOVIM.nindpmovim
  is 'indicador de presença(NFe) do movimento';
comment on column LIVMOVIM.nconfmovim
  is 'indicador de consumidor final(NFe) do movimento';  
comment on column LIVMOVIM.cdescmovim
  is 'descrição do movimento';    
comment on column LIVMOVIM.cmanumovim
  is 'lançamento manual do movimento(SIM/NÃO)';
comment on column LIVMOVIM.cemipmovim
  is 'emissão propria do movimento(SIM/NÃO)';  
comment on column LIVMOVIM.ndocumovim
  is 'número do documento fiscal do movimento';
comment on column LIVMOVIM.csitumovim
  is 'situação do movimento(ABERTO/CANCELADO/FECHADO)';  
comment on column LIVMOVIM.chavemovim
  is 'chave do movimento';
comment on column LIVMOVIM.ddatamovim
  is 'data do movimento';
comment on column LIVMOVIM.densamovim
  is 'data de entrada/saida do movimento';
comment on column LIVMOVIM.ddtcamovim
  is 'data de cadastro do movimento';
comment on column LIVMOVIM.nvbcimovim
  is 'valor de base de icms do movimento';
comment on column LIVMOVIM.nvicmmovim
  is 'valor do icms do movimento';
comment on column LIVMOVIM.nvicdmovim
  is 'valor do icms desonerado do movimento';
comment on column LIVMOVIM.nfcpimovim
  is 'valor total do icms relativo fundo de combate à pobreza (FCP) da UF de destino do movimento';
comment on column LIVMOVIM.nicmimovim
  is 'valor total do icms interestadual para a UF de destino do movimento';
comment on column LIVMOVIM.nicmrmovim
  is 'valor total do icms interestadual para a UF do remetente do movimento';  
comment on column LIVMOVIM.nvfcpmovim
  is 'valor de icms FCP do movimento';
comment on column LIVMOVIM.nvbstmovim
  is 'valor de base de icms ST do movimento';
comment on column LIVMOVIM.nvlstmovim
  is 'valor de icms ST do movimento';
comment on column LIVMOVIM.nfcpsmovim
  is 'valor de icms FCP por ST do movimento';
comment on column LIVMOVIM.nfcprmovim
  is 'valor de icms FCP retido anteriormente por ST do movimento';
comment on column LIVMOVIM.nvtopmovim
  is 'valor total dos produtos/serviços do movimento';
comment on column LIVMOVIM.nvfremovim
  is 'valor total de frete do movimento';
comment on column LIVMOVIM.nvsegmovim
  is 'valor total de seguro do movimento';
comment on column LIVMOVIM.nvdesmovim
  is 'valor total de desconto do movimento';
comment on column LIVMOVIM.nvliimovim
  is 'valor total imposto importados do movimento';
comment on column LIVMOVIM.nvipimovim
  is 'valor total de ipi do movimento';
comment on column LIVMOVIM.nipidmovim
  is 'valor total de ipi devolvido do movimento';
comment on column LIVMOVIM.nvpismovim
  is 'valor total de pis do movimento';
comment on column LIVMOVIM.nvcofmovim
  is 'valor total de cofins do movimento';
comment on column LIVMOVIM.nvoutmovim
  is 'valor total outros do movimento';
comment on column LIVMOVIM.nirrfmovim
  is 'valor total de IRRF do movimento';
comment on column LIVMOVIM.ninssmovim
  is 'valor total de INSS do movimento';
comment on column LIVMOVIM.nvissmovim
  is 'valor total de ISS do movimento';
comment on column LIVMOVIM.ncsllmovim
  is 'valor total de CSLL do movimento';
comment on column LIVMOVIM.ntotamovim
  is 'valor total do movimento';
comment on column LIVMOVIM.nttrimovim
  is 'valor total tributos de ISS do movimento';
comment on column LIVMOVIM.cfiscmovim
  is 'informação do fisco do movimento';
comment on column LIVMOVIM.cicommovim
  is 'informação complementares do movimento';
comment on column LIVMOVIM.cobsemovim
  is 'observação do movimento';  
-- Create/Recreate indexes
create index FK_LIVMOVIM_CADFILIA on LIVMOVIM (NCODIFILIA);
create index FK_LIVMOVIM_CADENDER on LIVMOVIM (NCODIENDER);
create index FK_LIVMOVIM_CADGERAL on LIVMOVIM (NCODIGERAL);
create index FK_LIVMOVIM_LIVFINAL on LIVMOVIM (NCODIFINAL);
create index FK_LIVMOVIM_LIVMODEL on LIVMOVIM (NCODIMODEL);
create index FK_LIVMOVIM_LIVSERIE on LIVMOVIM (NCODISERIE);
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIVMOVIM
  add constraint PK_LIVMOVIM primary key (NCODIMOVIM)
  using index;
alter table LIVMOVIM
  add constraint FK_LIVMOVIM_CADFILIA foreign key (NCODIFILIA)
  references CADFILIA (NCODIFILIA);
alter table LIVMOVIM
  add constraint FK_LIVMOVIM_CADENDER foreign key (NCODIENDER)
  references CADENDER (NCODIENDER);
alter table LIVMOVIM
  add constraint FK_LIVMOVIM_CADGERAL foreign key (NCODIGERAL)
  references CADGERAL (NCODIGERAL);
alter table LIVMOVIM
  add constraint FK_LIVMOVIM_LIVFINAL foreign key (NCODIFINAL)
  references LIVFINAL (NCODIFINAL);
alter table LIVMOVIM
  add constraint FK_LIVMOVIM_LIVMODEL foreign key (NCODIMODEL)
  references LIVMODEL (NCODIMODEL);
alter table LIVMOVIM
  add constraint FK_LIVMOVIM_LIVSERIE foreign key (NCODISERIE)
  references LIVSERIE (NCODISERIE);