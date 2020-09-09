-- Create table
create table ADMALMOX
(
  ncodialmox NUMBER not null,
  ncodifilia NUMBER not null,
  ccodialmox VARCHAR2(10) not null,
  cdescalmox VARCHAR2(255) not null
);
-- Add comments to the table 
comment on table ADMALMOX
  is 'Almoxarifado';
-- Add comments to the columns 
comment on column ADMALMOX.ncodialmox
  is 'código do almoxarifado';
comment on column ADMALMOX.ncodifilia
  is 'código da filial';
comment on column ADMALMOX.ccodialmox
  is 'código literal do almoxarifado';
comment on column ADMALMOX.cdescalmox
  is 'descrição do almoxarifado';
-- Create/Recreate indexes 
create index FK_ADMALMOX_CADFILIA on ADMALMOX (NCODIFILIA);
-- Create/Recreate primary, unique and foreign key constraints 
alter table ADMALMOX
  add constraint PK_ADMALMOX primary key (NCODIALMOX)
  using index;
alter table ADMALMOX
  add constraint FK_ADMALMOX_CADFILIA foreign key (NCODIFILIA)
  references CADFILIA (NCODIFILIA);
  
insert into ADMALMOX (NCODIALMOX, NCODIFILIA, CCODIALMOX, CDESCALMOX)
values (1, 1, '01', 'ASTORGA');  