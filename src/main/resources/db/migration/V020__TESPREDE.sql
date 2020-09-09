-- Create table
create table TESPREDE
(
  ncodiprede NUMBER not null,
  ncodigrede NUMBER not null,
  cdescprede VARCHAR2(255) not null,
  nvlidprede NUMBER(5,2) default 0 not null,
  nvlijprede NUMBER(5,2) default 0 not null
);
-- Add comments to the table 
comment on table TESPREDE
  is 'Plano de Receita ou Despesa';
-- Add comments to the columns 
comment on column TESPREDE.ncodiprede
  is 'código do plano de receita ou despesa';
comment on column TESPREDE.ncodigrede
  is 'código do grupo de receita ou despesa';
comment on column TESPREDE.cdescprede
  is 'descrição do plano de receita ou despesa';
comment on column TESPREDE.nvlidprede
  is 'valor de indice para taxa de desconto';
comment on column TESPREDE.nvlijprede
  is 'valor de indice para taxa de juros';
-- Create/Recreate indexes 
create index FK_TESPREDE_TESGREDE on TESPREDE (NCODIGREDE);
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESPREDE
  add constraint PK_TESPREDE primary key (NCODIPREDE)
  using index;
alter table TESPREDE
  add constraint FK_TESPREDE_TESGREDE foreign key (NCODIGREDE)
  references TESGREDE (NCODIGREDE);
  
insert into TESPREDE (NCODIPREDE, NCODIGREDE, CDESCPREDE, NVLIDPREDE, NVLIJPREDE)
values (1, 1, 'COMBUSTÍVEIS', 1.00, 2.00);

insert into TESPREDE (NCODIPREDE, NCODIGREDE, CDESCPREDE, NVLIDPREDE, NVLIJPREDE)
values (2, 1, 'PEÇAS E LUBRIFICANTES ', 1.00, 3.00);

insert into TESPREDE (NCODIPREDE, NCODIGREDE, CDESCPREDE, NVLIDPREDE, NVLIJPREDE)
values (3, 1, 'LOJA DE CONVENIÊNCIA', 1.00, 3.00);

insert into TESPREDE (NCODIPREDE, NCODIGREDE, CDESCPREDE, NVLIDPREDE, NVLIJPREDE)
values (4, 1, 'PRESTAÇÃO DE SERVIÇO', 1.00, 3.00);

insert into TESPREDE (NCODIPREDE, NCODIGREDE, CDESCPREDE, NVLIDPREDE, NVLIJPREDE)
values (5, 2, 'COMBUSTÍVEIS', 0.00, 0.00);

insert into TESPREDE (NCODIPREDE, NCODIGREDE, CDESCPREDE, NVLIDPREDE, NVLIJPREDE)
values (6, 2, 'PEÇAS E LUBRIFICANTES ', 0.00, 0.00);

insert into TESPREDE (NCODIPREDE, NCODIGREDE, CDESCPREDE, NVLIDPREDE, NVLIJPREDE)
values (7, 2, 'LOJA DE CONVENIÊNCIA', 0.00, 0.00);

insert into TESPREDE (NCODIPREDE, NCODIGREDE, CDESCPREDE, NVLIDPREDE, NVLIJPREDE)
values (8, 2, 'PRESTACAO DE SERVICO', 0.00, 0.00);
  