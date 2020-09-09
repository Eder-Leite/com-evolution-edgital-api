-- Create table
create table TESPLLAN
(
  ncodipllan NUMBER not null,
  ncodilancm NUMBER not null,
  ncodiprede NUMBER not null,
  npercpllan NUMBER(19,10) default 0 not null,
  nvalopllan NUMBER(19,2) default 0 not null,
  cprinpllan VARCHAR2(15) default 'SIM' not null
);
-- Add comments to the table 
comment on table TESPLLAN
  is 'Pré Lançamento Manual Financeiro';
-- Add comments to the columns 
comment on column TESPLLAN.ncodipllan
  is 'código do pré lançamento manual financeiro';
comment on column TESPLLAN.ncodilancm
  is 'código do lançamento manual financeiro';
comment on column TESPLLAN.ncodiprede
  is 'código do plano de despesa ou receita';
comment on column TESPLLAN.npercpllan
  is 'percentual do pré lançamento manual financeiro';
comment on column TESPLLAN.nvalopllan
  is 'valor do pré lançamento manual financeiro';
comment on column TESPLLAN.cprinpllan
  is 'principal(SIM/NÃO) pré lançamento manual financeiro';
-- Create/Recreate indexes 
create index FK_TESPLLAN_TESLANCM on TESPLLAN (NCODILANCM);
create index FK_TESPLLAN_TESPREDE on TESPLLAN (NCODIPREDE);
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESPLLAN
  add constraint PK_TESPLLAN primary key (NCODIPLLAN)
  using index;
alter table TESPLLAN
  add constraint FK_TESPLLAN_TESLANCM foreign key (NCODILANCM)
  references TESLANCM (NCODILANCM);
alter table TESPLLAN
  add constraint FK_TESPLLAN_TESPREDE foreign key (NCODIPREDE)
  references TESPREDE (NCODIPREDE);
  
CREATE OR REPLACE TRIGGER TES_TTESPLLAN_BIUD
  BEFORE INSERT OR UPDATE OR DELETE ON TESPLLAN
  FOR EACH ROW
BEGIN
  IF (INSERTING OR UPDATING) THEN
    FOR TOTAL IN (SELECT *
                    FROM TESLANCM A
                   WHERE A.NCODILANCM = :NEW.NCODILANCM) LOOP
    
      :NEW.NPERCPLLAN := :NEW.NVALOPLLAN / TOTAL.NVALOLANCM * 100;
    
    END LOOP;
  END IF;
END TES_TTESPLLAN_BIUD;
/  