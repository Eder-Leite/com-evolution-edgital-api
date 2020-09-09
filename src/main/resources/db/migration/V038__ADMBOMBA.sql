-- Create table
create table ADMBOMBA
(
  ncodibomba NUMBER not null,
  ncoditanqu NUMBER not null,
  nnumebomba NUMBER not null,
  cdescbomba VARCHAR2(255) not null,
  cmodebomba VARCHAR2(255) not null,
  cmarcbomba VARCHAR2(255) not null,
  cseribomba VARCHAR2(255) not null,
  cselobomba VARCHAR2(4000) not null,
  nleitbomba NUMBER(19,3) default 0 not null,
  nleftbomba NUMBER(19,3) default 0 not null,
  cobsvbomba VARCHAR2(4000),
  ddatabomba DATE default SYSDATE not null,
  ddmanbomba DATE default SYSDATE not null,
  cstatbomba VARCHAR2(15) default 'ATIVO' not null
);
-- Add comments to the table 
comment on table ADMBOMBA
  is 'Bomba de Combustível';
-- Add comments to the columns 
comment on column ADMBOMBA.ncodibomba
  is 'código da bomba de combustível';
comment on column ADMBOMBA.ncoditanqu
  is 'código do tanque de combustível';
comment on column ADMBOMBA.nnumebomba
  is 'número da bomba de combustível';
comment on column ADMBOMBA.cdescbomba
  is 'descrição da bomba de combustível';
comment on column ADMBOMBA.cmodebomba
  is 'modelo da bomba de combustível';
comment on column ADMBOMBA.cmarcbomba
  is 'marca da bomba de combustível';
comment on column ADMBOMBA.cseribomba
  is 'série da bomba de combustível';
comment on column ADMBOMBA.cselobomba
  is 'selos da bomba de combustível';
comment on column ADMBOMBA.nleitbomba
  is 'leitura inicial da bomba de combustível';
comment on column ADMBOMBA.nleftbomba
  is 'leitura final da bomba de combustível';
comment on column ADMBOMBA.cobsvbomba
  is 'observação da bomba de combustível';
comment on column ADMBOMBA.ddatabomba
  is 'data de cadastro da bomba de combustível';
comment on column ADMBOMBA.ddmanbomba
  is 'data da ultima manutenção da bomba de combustível';
comment on column ADMBOMBA.cstatbomba
  is 'status da bomba de combustível';
-- Create/Recreate indexes 
create index FK_ADMBOMBA_ADMTANQU on ADMBOMBA (NCODITANQU);
-- Create/Recreate primary, unique and foreign key constraints 
alter table ADMBOMBA
  add constraint PK_ADMBOMBA primary key (NCODIBOMBA)
  using index;
alter table ADMBOMBA
  add constraint FK_ADMBOMBA_ADMTANQU foreign key (NCODITANQU)
  references ADMTANQU (NCODITANQU);
  
insert into ADMBOMBA (NCODIBOMBA, NCODITANQU, NNUMEBOMBA, CDESCBOMBA, CMODEBOMBA, CMARCBOMBA, CSERIBOMBA, CSELOBOMBA, NLEITBOMBA, NLEFTBOMBA, COBSVBOMBA, DDATABOMBA, DDMANBOMBA, CSTATBOMBA)
values (1, 1, 1, 'BOMBA 01 - ETANOL HIDRATADO COMUM', 'NORMAL', 'NORMAL', 'NORMAL', '123456, 234567', 0.000, 0.000, null, to_date('26-08-2019 21:07:41', 'dd-mm-yyyy hh24:mi:ss'), to_date('26-08-2019 21:07:41', 'dd-mm-yyyy hh24:mi:ss'), 'ATIVO');  