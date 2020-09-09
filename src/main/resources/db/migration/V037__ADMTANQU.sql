-- Create table
create table ADMTANQU
(
  ncoditanqu NUMBER not null,
  ncodifilia NUMBER not null,
  ncodiprodu NUMBER not null,
  nnumetanqu NUMBER not null,
  cdesctanqu VARCHAR2(255) not null,
  ncapatanqu NUMBER(19,3) default 0 not null,
  cstattanqu VARCHAR2(15) default 'ATIVO' not null,
  ddatatanqu DATE default SYSDATE not null
);
-- Add comments to the table 
comment on table ADMTANQU
  is 'Tanque de Combustível';
-- Add comments to the columns 
comment on column ADMTANQU.ncoditanqu
  is 'código do tanque de combustivel';
comment on column ADMTANQU.ncodifilia
  is 'código da filial';
comment on column ADMTANQU.ncodiprodu
  is 'código do produto';
comment on column ADMTANQU.nnumetanqu
  is 'número do tanque de combustivel';
comment on column ADMTANQU.cdesctanqu
  is 'descrição do tanque de combustivel';
comment on column ADMTANQU.ncapatanqu
  is 'capacidade do tanque de combustivel';
comment on column ADMTANQU.cstattanqu
  is 'status do tanque de combustivel';
comment on column ADMTANQU.ddatatanqu
  is 'data de cadastro do tanque de combustivel';
-- Create/Recreate indexes 
create index FK_ADMTANQU_ADMPRODU on ADMTANQU (NCODIPRODU);
create index FK_ADMTANQU_CADFILIA on ADMTANQU (NCODIFILIA);
-- Create/Recreate primary, unique and foreign key constraints 
alter table ADMTANQU
  add constraint PK_ADMTANQU primary key (NCODITANQU)
  using index;
alter table ADMTANQU
  add constraint FK_ADMTANQU_ADMPRODU foreign key (NCODIPRODU)
  references ADMPRODU (NCODIPRODU);
alter table ADMTANQU
  add constraint FK_ADMTANQU_CADFILIA foreign key (NCODIFILIA)
  references CADFILIA (NCODIFILIA);
  
insert into ADMTANQU (NCODITANQU, NCODIFILIA, NCODIPRODU, NNUMETANQU, CDESCTANQU, NCAPATANQU, CSTATTANQU, DDATATANQU)
values (1, 1, 1, 1, 'TANQUE 01 - 15 MIL LITROS - ETANOL HIDRATADO COMUM', 15000.000, 'ATIVO', to_date('26-08-2019 20:46:06', 'dd-mm-yyyy hh24:mi:ss'));
  