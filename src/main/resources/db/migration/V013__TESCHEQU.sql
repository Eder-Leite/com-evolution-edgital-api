CREATE SEQUENCE TES_STESCHEQU NOCACHE;
-- Create table
create table TESCHEQU
(
  ncodichequ NUMBER not null,
  ncoditalao NUMBER not null,
  nnumechequ NUMBER not null,
  nvalochequ NUMBER(19,2),
  ddatechequ DATE,
  ddatmchequ DATE,
  cnomichequ VARCHAR2(255),
  csituchequ VARCHAR2(15) default 'ATIVO' not null
);
-- Add comments to the table 
comment on table TESCHEQU
  is 'Cheque por Talão Financeiro';
-- Add comments to the columns 
comment on column TESCHEQU.ncodichequ
  is 'código do cheque';
comment on column TESCHEQU.ncoditalao
  is 'código do talão';
comment on column TESCHEQU.nnumechequ
  is 'número do cheque';
comment on column TESCHEQU.nvalochequ
  is 'valor do cheque';
comment on column TESCHEQU.ddatechequ
  is 'data de emissão do cheque';
comment on column TESCHEQU.ddatmchequ
  is 'data do movimento do cheque';
comment on column TESCHEQU.cnomichequ
  is 'nominal do cheque';
comment on column TESCHEQU.csituchequ
  is 'situação do cheque(ATIVO/CANCELADO/EMITIDO)';
-- Create/Recreate indexes 
create index FK_TESCHEQU_TESTALAO on TESCHEQU (NCODITALAO);
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESCHEQU
  add constraint PK_TESCHEQU primary key (NCODICHEQU)
  using index;
alter table TESCHEQU
  add constraint FK_TESCHEQU_TESTALAO foreign key (NCODITALAO)
  references TESTALAO (NCODITALAO);
  
CREATE OR REPLACE TRIGGER TES_TTESTALAO
  AFTER INSERT ON TESTALAO
  FOR EACH ROW
BEGIN

  FOR X IN :NEW.NNUMITALAO .. :NEW.NNUMFTALAO LOOP
  
    INSERT INTO TESCHEQU
      (NCODICHEQU, NCODITALAO, NNUMECHEQU)
    VALUES
      (TES_STESCHEQU.NEXTVAL, :NEW.NCODITALAO, X);
  
  END LOOP;

END TES_TTESTALAO;
/

insert into TESTALAO (NCODITALAO, NCODICTFIN, NCODIFILIA, NNUMITALAO, NNUMFTALAO, CSTATTALAO)
values (1, 1, 1, 1, 10000, 'ATIVO');