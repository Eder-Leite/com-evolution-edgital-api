-- Create table
create table TESLANCM
(
  ncodilancm NUMBER not null,
  ncodifilia NUMBER not null,
  ncodigeral NUMBER not null,
  ncodimodel NUMBER not null,
  ncodiusuar NUMBER not null,
  cdoculancm VARCHAR2(25) not null,
  ddatmlancm DATE not null,
  ddatalancm DATE default SYSDATE not null,
  cdesclancm VARCHAR2(255) not null,
  ctipolancm VARCHAR2(15) not null,
  nvalolancm NUMBER(19,2) default 0 not null,
  csitulancm VARCHAR2(15) default 'ABERTO' not null
);
-- Add comments to the table 
comment on table TESLANCM
  is 'Lançamento Manual Financeiro';
-- Add comments to the columns 
comment on column TESLANCM.ncodilancm
  is 'código do lançamento manual financeiro';
comment on column TESLANCM.ncodifilia
  is 'código da filial da empresa';
comment on column TESLANCM.ncodigeral
  is 'código do cadastro geral';
comment on column TESLANCM.ncodimodel
  is 'código do modelo fiscal';
comment on column TESLANCM.ncodiusuar
  is 'código do usuário';
comment on column TESLANCM.cdoculancm
  is 'documento do lançamento manual financeiro';
comment on column TESLANCM.ddatmlancm
  is 'data do movimento do lançamento manual financeiro';
comment on column TESLANCM.ddatalancm
  is 'data de cadastro do lançamento manual financeiro';
comment on column TESLANCM.cdesclancm
  is 'descrição do lançamento manual financeiro';
comment on column TESLANCM.ctipolancm
  is 'tipo(DÉBITO/CRÉDITO) do lançamento manual financeiro';
comment on column TESLANCM.nvalolancm
  is 'valor do lançamento manual financeiro';
comment on column TESLANCM.csitulancm
  is 'situação do lançamento manual financeiro(ABERTO/FECHADO)';  
-- Create/Recreate indexes 
create index FK_TESLANCM_CADFILIA on TESLANCM (NCODIFILIA);
create index FK_TESLANCM_CADGERAL on TESLANCM (NCODIGERAL);
create index FK_TESLANCM_LIVMODEL on TESLANCM (NCODIMODEL);
create index FK_TESLANCM_SEGUSUAR on TESLANCM (NCODIUSUAR);
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESLANCM
  add constraint PK_TESLANCM primary key (NCODILANCM)
  using index;
alter table TESLANCM
  add constraint FK_TESLANCM_CADFILIA foreign key (NCODIFILIA)
  references CADFILIA (NCODIFILIA);
alter table TESLANCM
  add constraint FK_TESLANCM_CADGERAL foreign key (NCODIGERAL)
  references CADGERAL (NCODIGERAL);
alter table TESLANCM
  add constraint FK_TESLANCM_LIVMODEL foreign key (NCODIMODEL)
  references LIVMODEL (NCODIMODEL);
alter table TESLANCM
  add constraint FK_TESLANCM_SEGUSUAR foreign key (NCODIUSUAR)
  references SEGUSUAR (NCODIUSUAR);
  
CREATE OR REPLACE TRIGGER TES_TTESLANCM_BIUD
  BEFORE INSERT OR UPDATE OR DELETE ON TESLANCM
  FOR EACH ROW
BEGIN
  IF (INSERTING OR UPDATING) THEN
    :NEW.DDATMLANCM := TO_CHAR(:NEW.DDATMLANCM, 'DD/MM/YYYY');
  END IF;
END TES_TTESLANCM_BIUD;
/  