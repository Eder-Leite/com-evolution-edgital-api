-- Create table
create table SEGACESU
(
  ncodiacesu NUMBER not null,
  ncodiusuar NUMBER not null,
  ddataacesu DATE default SYSDATE not null
);
-- Add comments to the table 
comment on table SEGACESU
  is 'Acesso do Usuário';
-- Add comments to the columns 
comment on column SEGACESU.ncodiacesu
  is 'código do acesso do usuário';
comment on column SEGACESU.ncodiusuar
  is 'código do usuário';
comment on column SEGACESU.ddataacesu
  is 'data de acesso do usuário';
-- Create/Recreate indexes 
create index FK_SEGACESU_SEGUSUAR on SEGACESU (NCODIUSUAR);
-- Create/Recreate primary, unique and foreign key constraints 
alter table SEGACESU
  add constraint PK_SEGACESU primary key (NCODIACESU)
  using index;
alter table SEGACESU
  add constraint FK_SEGACESU_SEGUSUAR foreign key (NCODIUSUAR)
  references SEGUSUAR (NCODIUSUAR);
