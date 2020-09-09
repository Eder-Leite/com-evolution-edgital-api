-- Create table
create table CADGERAL
(
  ncodigeral NUMBER not null,
  ncodiempre NUMBER not null,
  ctipogeral VARCHAR2(50) default 'NORMAL' not null,
  ctppegeral VARCHAR2(15) not null,
  cnmrzgeral VARCHAR2(255) not null,
  cnmfageral VARCHAR2(255),
  cnuccgeral VARCHAR2(18),
  cierggeral VARCHAR2(18),
  ctel1geral VARCHAR2(14),
  ctel2geral VARCHAR2(14),
  ccel1geral VARCHAR2(14),
  ccel2geral VARCHAR2(14),
  nlimcgeral NUMBER(19,2) default 0,
  cemaigeral VARCHAR2(4000),
  cexmlgeral VARCHAR2(4000),
  cfotogeral CLOB,
  cidiegeral VARCHAR2(1) default '9',
  ddatageral DATE default SYSDATE,
  cstatgeral VARCHAR2(15) default 'ATIVO' not null
);
-- Add comments to the table 
comment on table CADGERAL
  is 'Cadastro Geral';
-- Add comments to the columns 
comment on column CADGERAL.ncodigeral
  is 'código do cadastro geral';
comment on column CADGERAL.ncodiempre
  is 'código da empresa';
comment on column CADGERAL.ctipogeral
  is 'tipo de cadastro(CLIENTE/FILIAL/FORNECEDOR/FUNCIONÁIO/MATRIZ)';
comment on column CADGERAL.ctppegeral
  is 'tipo de pessoa(FÍSICA/JURIDÍCA) cadastro';
comment on column CADGERAL.cnmrzgeral
  is 'nome razão social cadastro';
comment on column CADGERAL.cnmfageral
  is 'nome fantasia cadastro';
comment on column CADGERAL.cnuccgeral
  is 'número CNPJ/CPF cadastro';
comment on column CADGERAL.cierggeral
  is 'inscrição estadual/RG cadastro';
comment on column CADGERAL.ctel1geral
  is 'telefone principal cadastro';
comment on column CADGERAL.ctel2geral
  is 'telefone 2 cadastro';
comment on column CADGERAL.ccel1geral
  is 'celular principal do cadastro';
comment on column CADGERAL.ccel2geral
  is 'celular 2 do cadastro';
comment on column CADGERAL.cemaigeral
  is 'email do cadastro';
comment on column CADGERAL.nlimcgeral
  is 'limite de crédito do cadastro';  
comment on column CADGERAL.cexmlgeral
  is 'email para envio de xml do cadastro';
comment on column CADGERAL.cfotogeral
  is 'foto do cadastro';
comment on column CADGERAL.cidiegeral
  is 'indicador de inscrição estadual(1,2,9)';
comment on column CADGERAL.ddatageral
  is 'data de cadastro';
comment on column CADGERAL.cstatgeral
  is 'status do cadastro';
-- Create/Recreate indexes 
create index FK_CADGERAL_CADEMPRE on CADGERAL (NCODIEMPRE);
-- Create/Recreate primary, unique and foreign key constraints 
alter table CADGERAL
  add constraint PK_CADGERAL primary key (NCODIGERAL)
  using index;
alter table CADGERAL
  add constraint FK_CADGERAL_CADEMPRE foreign key (NCODIEMPRE)
  references CADEMPRE (NCODIEMPRE);
  
CREATE OR REPLACE TRIGGER CAD_TCADGERAL_BIUD
  BEFORE INSERT OR UPDATE OR DELETE ON CADGERAL
  FOR EACH ROW
BEGIN
  IF (INSERTING OR UPDATING) THEN
    IF (:NEW.CTPPEGERAL = 'FÍSICA') THEN
      :NEW.CIDIEGERAL := '9';
    ELSIF (:NEW.CTPPEGERAL = 'JURÍDICA') THEN
      IF (TRIM(:NEW.CIERGGERAL) IS NOT NULL) THEN
        :NEW.CIDIEGERAL := '1';
      ELSE
        :NEW.CIDIEGERAL := '2';
      END IF;
    END IF;
  END IF;
END CAD_TCADGERAL_BIUD;
/  
  
insert into CADGERAL (NCODIGERAL, NCODIEMPRE, CTIPOGERAL, CTPPEGERAL, CNMRZGERAL, CNMFAGERAL, CNUCCGERAL, CIERGGERAL, CTEL1GERAL, CTEL2GERAL, CCEL1GERAL, CCEL2GERAL, CEMAIGERAL, CEXMLGERAL, CFOTOGERAL, CIDIEGERAL, DDATAGERAL, CSTATGERAL)
values (1, 1, 'MATRIZ', 'JURÍDICA', 'EVOLUTION SISTEMAS LTDA', 'EVOLUTION SISTEMAS', '03345641000176', '123456789', '4432348100', '4432348159', '44999973923', '44999999999', 'EDER@EVOLUTIONSISTEMAS.COM.BR', 'EDER@EVOLUTIONSISTEMAS.COM.BR', NULL, '9', to_date('20-08-2019 18:55:51', 'dd-mm-yyyy hh24:mi:ss'), 'ATIVO');
  