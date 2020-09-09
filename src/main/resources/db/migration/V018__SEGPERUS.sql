-- Create table
create table SEGPERUS
(
  ncodiusuar NUMBER not null,
  ncodipermi NUMBER not null
);
-- Add comments to the table 
comment on table SEGPERUS
  is 'Perfil do Usuário';
-- Add comments to the columns 
comment on column SEGPERUS.ncodiusuar
  is 'código do usuário';
comment on column SEGPERUS.ncodipermi
  is 'código da permissão usuário';
-- Create/Recreate indexes 
create index FK_SEGPERUS_SEGPERMI on SEGPERUS (NCODIPERMI);
create index FK_SEGPERUS_SEGUSUAR on SEGPERUS (NCODIUSUAR);
-- Create/Recreate primary, unique and foreign key constraints 
alter table SEGPERUS
  add constraint FK_SEGPERUS_SEGPERMI foreign key (NCODIPERMI)
  references SEGPERMI (NCODIPERMI);
alter table SEGPERUS
  add constraint FK_SEGPERUS_SEGUSUAR foreign key (NCODIUSUAR)
  references SEGUSUAR (NCODIUSUAR);

insert into SEGPERUS (NCODIUSUAR, NCODIPERMI)
values (1, 1);

insert into SEGPERUS (NCODIUSUAR, NCODIPERMI)
values (1, 2);

insert into SEGPERUS (NCODIUSUAR, NCODIPERMI)
values (1, 3);
