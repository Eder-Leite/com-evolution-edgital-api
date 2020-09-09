-- Create table
create table CAD_PAIS
(
  ncodi_pais NUMBER not null,
  ccodi_pais VARCHAR2(10) not null,
  cnome_pais VARCHAR2(255) not null,
  csigl_pais VARCHAR2(10) not null
);
-- Add comments to the table 
comment on table CAD_PAIS
  is 'Pais';
-- Add comments to the columns 
comment on column CAD_PAIS.ncodi_pais
  is 'código do pais';
comment on column CAD_PAIS.ccodi_pais
  is 'código literal do pais';
comment on column CAD_PAIS.cnome_pais
  is 'nome do pais';
comment on column CAD_PAIS.csigl_pais
  is 'sigla do pais';
-- Create/Recreate primary, unique and foreign key constraints 
alter table CAD_PAIS
  add constraint PK_CAD_PAIS primary key (NCODI_PAIS)
  using index;
alter table CAD_PAIS
  add constraint UK_CAD_PAIS unique (CCODI_PAIS)
  using index;

insert into CAD_PAIS (NCODI_PAIS, CCODI_PAIS, CNOME_PAIS, CSIGL_PAIS)
values (1, '1058', 'BRASIL', 'BR');