  -- Create table
create table CADREGIA
(
  ncodiregia NUMBER not null,
  cdescregia VARCHAR2(60) not null
);
-- Add comments to the table 
comment on table CADREGIA
  is 'Região';
-- Add comments to the columns 
comment on column CADREGIA.ncodiregia
  is 'código da região';
comment on column CADREGIA.cdescregia
  is 'descrição da região';
-- Create/Recreate primary, unique and foreign key constraints 
alter table CADREGIA
  add constraint PK_CADREGIA primary key (NCODIREGIA)
  using index;

insert into CADREGIA (NCODIREGIA, CDESCREGIA)
values (1, 'CENTRO OESTE');

insert into CADREGIA (NCODIREGIA, CDESCREGIA)
values (2, 'NORDESTE');

insert into CADREGIA (NCODIREGIA, CDESCREGIA)
values (3, 'NORTE');

insert into CADREGIA (NCODIREGIA, CDESCREGIA)
values (4, 'SUDESTE');

insert into CADREGIA (NCODIREGIA, CDESCREGIA)
values (5, 'SUL');