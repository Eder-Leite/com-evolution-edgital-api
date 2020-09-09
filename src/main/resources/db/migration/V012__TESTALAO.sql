-- Create table
create table TESTALAO
(
  ncoditalao NUMBER not null,
  ncodictfin NUMBER not null,
  ncodifilia NUMBER not null,
  nnumitalao NUMBER not null,
  nnumftalao NUMBER not null,
  cstattalao VARCHAR2(15) default 'ATIVO' not null
);
-- Add comments to the table 
comment on table TESTALAO
  is 'Talonário para Emissao de Cheque por Conta Financeira';
-- Add comments to the columns 
comment on column TESTALAO.ncoditalao
  is 'código do talão';
comment on column TESTALAO.ncodictfin
  is 'código da conta financeira';
comment on column TESTALAO.ncodifilia
  is 'código da filial';
comment on column TESTALAO.nnumitalao
  is 'número inicial do talão';
comment on column TESTALAO.nnumftalao
  is 'número final do talão';
comment on column TESTALAO.cstattalao
  is 'status do talão(ATIVO/INATIVO)';
-- Create/Recreate indexes 
create index FK_TESCTFIN_CADFILIA on TESTALAO (NCODIFILIA);
create index FK_TESTALAO_TESCTFIN on TESTALAO (NCODICTFIN);
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESTALAO
  add constraint PK_TESTALAO primary key (NCODITALAO)
  using index;
alter table TESTALAO
  add constraint FK_TESTALAO_CADFILIA foreign key (NCODIFILIA)
  references CADFILIA (NCODIFILIA);
alter table TESTALAO
  add constraint FK_TESTALAO_TESCTFIN foreign key (NCODICTFIN)
  references TESCTFIN (NCODICTFIN);
  
  CREATE OR REPLACE TRIGGER TES_TTESTALAO_BIUD
  BEFORE INSERT OR UPDATE OR DELETE ON TESTALAO
  FOR EACH ROW
BEGIN
  IF (DELETING) THEN
    DELETE FROM TESCHEQU A WHERE A.NCODITALAO = :OLD.NCODITALAO;
  END IF;

END TES_TTESTALAO_BIUD;
 /