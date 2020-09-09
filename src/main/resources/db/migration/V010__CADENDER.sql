-- Create table
create table CADENDER
(
  ncodiender NUMBER not null,
  ncodigeral NUMBER not null,
  ncodicidad NUMBER not null,
  cdescender VARCHAR2(255) not null,
  cncepender VARCHAR2(10) not null,
  clogrender VARCHAR2(255) not null,
  cbairender VARCHAR2(255) not null,
  ccompender VARCHAR2(255),
  cnumeender VARCHAR2(20) not null,
  ccnpjender VARCHAR2(18),
  cinseender VARCHAR2(20),
  cidieender VARCHAR2(1) default '9',
  ctipoender VARCHAR2(15) default 'NORMAL',
  ddataender DATE default SYSDATE,
  cstatender VARCHAR2(15) default 'ATIVO'
);
-- Add comments to the table 
comment on table CADENDER
  is 'Endereço do Cadastro Geral';
-- Add comments to the columns 
comment on column CADENDER.ncodiender
  is 'código do endereço';
comment on column CADENDER.ncodigeral
  is 'código do cadastro geral';
comment on column CADENDER.ncodicidad
  is 'código da cidade do endereço';
comment on column CADENDER.cdescender
  is 'descrição endereço';  
comment on column CADENDER.cncepender
  is 'número do cep do endereço';
comment on column CADENDER.clogrender
  is 'logradouro do endereço';
comment on column CADENDER.cbairender
  is 'bairro do endereço';
comment on column CADENDER.ccompender
  is 'complemento do endereço';
comment on column CADENDER.cnumeender
  is 'número do endereço';
comment on column CADENDER.ccnpjender
  is 'campo especifico para CNPJ do endereço';
comment on column CADENDER.cinseender
  is 'campo especifico para Inscrição Estadual/CADPRO do endereço';
comment on column CADENDER.cidieender
  is 'campo especifico para indicador de inscrição estadual(1,2,9) do endereço';
comment on column CADENDER.ctipoender
  is 'tipo de endereço(PRINCIPAL/NORMAL)';
comment on column CADENDER.ddataender
  is 'data de cadastro do endereço';
comment on column CADENDER.cstatender
  is 'status do endereço';
-- Create/Recreate indexes 
create index FK_CADENDER_CADCIDAD on CADENDER (NCODICIDAD);
create index FK_CADENDER_CADGERAL on CADENDER (NCODIGERAL);
-- Create/Recreate primary, unique and foreign key constraints 
alter table CADENDER
  add constraint PK_CADENDER primary key (NCODIENDER)
  using index;
alter table CADENDER
  add constraint FK_CADENDER_CADCIDAD foreign key (NCODICIDAD)
  references CADCIDAD (NCODICIDAD);
alter table CADENDER
  add constraint FK_CADENDER_CADGERAL foreign key (NCODIGERAL)
  references CADGERAL (NCODIGERAL);
  
CREATE OR REPLACE TRIGGER CAD_TCADENDER_BIUD
  BEFORE INSERT OR UPDATE OR DELETE ON CADENDER
  FOR EACH ROW
BEGIN
  IF (INSERTING OR UPDATING) THEN
    IF (TRIM(:NEW.CINSEENDER) IS NOT NULL) THEN
      :NEW.CIDIEENDER := '1';
    ELSE
      :NEW.CIDIEENDER := '9';
    END IF;
  END IF;
END CAD_TCADENDER_BIUD;
/  

insert into CADENDER (NCODIENDER, NCODIGERAL, NCODICIDAD, CDESCENDER, CNCEPENDER, CLOGRENDER, CBAIRENDER, CCOMPENDER, CNUMEENDER, CCNPJENDER, CINSEENDER, CIDIEENDER, CTIPOENDER, DDATAENDER, CSTATENDER)
values (1, 1, 416, 'PRINCIPAL', '86730000', 'RUA JOSE AST', 'JARDIM ALTO DA BOA VISTA', 'CASA 01', '271', null, null, '9', 'PRINCIPAL', to_date('20-08-2019 18:58:36', 'dd-mm-yyyy hh24:mi:ss'), 'ATIVO');
