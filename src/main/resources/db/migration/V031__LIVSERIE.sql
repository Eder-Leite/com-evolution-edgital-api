-- Create table
create table LIVSERIE
(
  ncodiserie NUMBER not null,
  ccodiserie VARCHAR2(10) not null,
  cdescserie VARCHAR2(255) not null
);
-- Add comments to the table 
comment on table LIVSERIE
  is 'Serie de Documentos Fiscais';
-- Add comments to the columns 
comment on column LIVSERIE.ncodiserie
  is 'código da serie de documento fiscal';
comment on column LIVSERIE.ccodiserie
  is 'código literal da serie de documento fiscal';
comment on column LIVSERIE.cdescserie
  is 'descrição da serie de documento fiscal';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIVSERIE
  add constraint PK_LIVSERIE primary key (NCODISERIE)
  using index;
alter table LIVSERIE
  add constraint UK_LIVSERIE unique (CCODISERIE)
  using index;
  
insert into LIVSERIE (NCODISERIE, CCODISERIE, CDESCSERIE)
values (1, '001', 'SERIE 001');
  