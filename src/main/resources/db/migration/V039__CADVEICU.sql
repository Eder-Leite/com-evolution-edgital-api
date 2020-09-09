-- Create table
create table CADVEICU
(
  ncodiveicu NUMBER not null,
  ncodigeral NUMBER not null,
  cdescveicu VARCHAR2(255) not null,
  cpropveicu VARCHAR2(25) default 'PRÓPRIO' not null,
  ctipoveicu VARCHAR2(25) default 'VEÍCULO' not null,
  ctproveicu VARCHAR2(25) default '06' not null,
  ctpcaveicu VARCHAR2(25) default '00' not null,
  cplacveicu VARCHAR2(10) not null,
  canttveicu VARCHAR2(25),
  ntaraveicu NUMBER default 0 not null,
  cstatveicu VARCHAR2(15) default 'ATIVO'
);
-- Add comments to the table 
comment on table CADVEICU
  is 'Veiculo por Pessoa';
-- Add comments to the columns 
comment on column CADVEICU.ncodiveicu
  is 'código do veiculo';
comment on column CADVEICU.ncodigeral
  is 'código do cadastro geral';
comment on column CADVEICU.cdescveicu
  is 'decrição do veiculo';
comment on column CADVEICU.cpropveicu
  is 'proprietário do veiculo(PRÓPRIO/TERCEIRO)';  
comment on column CADVEICU.ctipoveicu
  is 'tipo do veiculo'; 
comment on column CADVEICU.ctproveicu
  is 'tipo de rodo do veiculo';
comment on column CADVEICU.ctpcaveicu
  is 'tipo de carroceria do veiculo';  
comment on column CADVEICU.cplacveicu
  is 'placa do veiculo';
comment on column CADVEICU.canttveicu
  is 'código ANTT do veiculo';
comment on column CADVEICU.ntaraveicu
  is 'tara do veiculo';  
comment on column CADVEICU.cstatveicu
  is 'status do veiculo(ATIVO/INATIVO)';
-- Create/Recreate indexes 
create index FK_CADVEICU_CADGERAL on CADVEICU (NCODIGERAL);
-- Create/Recreate primary, unique and foreign key constraints 
alter table CADVEICU
  add constraint PK_CADVEICU primary key (NCODIVEICU)
  using index;
alter table CADVEICU
  add constraint FK_CADVEICU_CADGERAL foreign key (NCODIGERAL)
  references CADGERAL (NCODIGERAL);