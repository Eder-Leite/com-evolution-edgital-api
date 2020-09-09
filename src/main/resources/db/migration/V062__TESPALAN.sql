-- Create table
create table TESPALAN
(
  ncodipalan NUMBER not null,
  ncodilancm NUMBER not null,
  nvalopalan NUMBER(19,2) default 0 not null,
  ddvenpalan DATE not null
);
-- Add comments to the table 
comment on table TESPALAN
  is 'Parcela do Lançamento Manual Financeiro';
-- Add comments to the columns 
comment on column TESPALAN.ncodipalan
  is 'código da parcela do lançamento manual financeiro';
comment on column TESPALAN.ncodilancm
  is 'código do lançamento manual financeiro';
comment on column TESPALAN.nvalopalan
  is 'valor da parcela do lançamento manual financeiro';
comment on column TESPALAN.ddvenpalan
  is 'data de vencimento da parcela do lançamento manual financeiro';
-- Create/Recreate indexes 
create index FK_TESPALAN_TESLANCM on TESPALAN (NCODILANCM);
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESPALAN
  add constraint PK_TESPALAN primary key (NCODIPALAN)
  using index;
alter table TESPALAN
  add constraint FK_TESPALAN_TESLANCM foreign key (NCODILANCM)
  references TESLANCM (NCODILANCM);
  
CREATE OR REPLACE TRIGGER TES_TTESPALAN_BIUD
  BEFORE INSERT OR UPDATE OR DELETE ON TESPALAN
  FOR EACH ROW
BEGIN
  IF (INSERTING OR UPDATING) THEN
    :NEW.DDVENPALAN := TO_CHAR(:NEW.DDVENPALAN, 'DD/MM/YYYY');
  END IF;
END TES_TTESPALAN_BIUD;
/  