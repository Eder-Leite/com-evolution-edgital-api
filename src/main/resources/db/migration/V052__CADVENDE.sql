-- Create table
create table CADVENDE
(
  ncodivende NUMBER not null,
  ncodiempre NUMBER,
  cncpfvende VARCHAR2(14),
  cnomevende VARCHAR2(255),
  cstatvende VARCHAR2(15)
);
-- Add comments to the table 
comment on table CADVENDE
  is 'Cadastro de Vendedores';
-- Add comments to the columns 
comment on column CADVENDE.ncodivende
  is 'código do vendedor';
comment on column CADVENDE.ncodiempre
  is 'código da empresa';
comment on column CADVENDE.cncpfvende
  is 'número do cpf do vendedor';
comment on column CADVENDE.cnomevende
  is 'nome do vendedor';
comment on column CADVENDE.cstatvende
  is 'status do vendedor(ATIVO/INATIVO)';
-- Create/Recreate indexes 
create index FK_CADVENDE_CADEMPRE on CADVENDE (NCODIEMPRE);
-- Create/Recreate primary, unique and foreign key constraints 
alter table CADVENDE
  add constraint PK_CADVENDE primary key (NCODIVENDE)
  using index;
alter table CADVENDE
  add constraint UK_CADVENDE unique (CNCPFVENDE)
  using index;
alter table CADVENDE
  add constraint FK_CADVENDE_CADEMPRE foreign key (NCODIEMPRE)
  references CADEMPRE (NCODIEMPRE);