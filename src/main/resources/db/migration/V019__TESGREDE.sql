-- Create table
create table TESGREDE
(
  ncodigrede NUMBER not null,
  ncodicarte NUMBER not null,
  cdescgrede VARCHAR2(255) not null
);
-- Add comments to the table 
comment on table TESGREDE
  is 'Grupo de Receita ou Despesa';
-- Add comments to the columns 
comment on column TESGREDE.ncodigrede
  is 'código do grupo de receita ou despesa';
comment on column TESGREDE.ncodicarte
  is 'código da carteira';
comment on column TESGREDE.cdescgrede
  is 'descrição do grupo de receita ou despesa';
-- Create/Recreate indexes 
create index FK_TESGREDE_TESCARTE on TESGREDE (NCODICARTE);
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESGREDE
  add constraint PK_TESGREDE primary key (NCODIGREDE)
  using index;
alter table TESGREDE
  add constraint FK_TESGREDE_TESCARTE foreign key (NCODICARTE)
  references TESCARTE (NCODICARTE);
  
insert into TESGREDE (NCODIGREDE, NCODICARTE, CDESCGREDE)
values (1, 1, 'VENDAS');

insert into TESGREDE (NCODIGREDE, NCODICARTE, CDESCGREDE)
values (2, 2, 'COMPRAS');  