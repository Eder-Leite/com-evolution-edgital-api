-- Create table
create table LIVPLMOV
(
  ncodiplmov NUMBER not null,
  ncodimovim NUMBER not null,
  ncodiprede NUMBER not null,
  npercplmov NUMBER(19,10) default 0 not null,
  nvaloplmov NUMBER(19,2) default 0 not null,
  cprinplmov VARCHAR2(15) default 'SIM' not null
);
-- Add comments to the table 
comment on table LIVPLMOV
  is 'Pré Lançamento da Movimentação';
-- Add comments to the columns 
comment on column LIVPLMOV.ncodiplmov
  is 'código do pré lançamento da movimentação';
comment on column LIVPLMOV.ncodimovim
  is 'código do movimento';
comment on column LIVPLMOV.ncodiprede
  is 'código do plano de receita ou despesa';
comment on column LIVPLMOV.npercplmov
  is 'percentual do pré lançamento da movimentação';
comment on column LIVPLMOV.nvaloplmov
  is 'valor do pré lançamento da movimentação';
comment on column LIVPLMOV.cprinplmov
  is 'principal(SIM/NÃO) pré lançamento da movimentação';
-- Create/Recreate indexes 
create index FK_LIVPLMOV_LIVMOVIM on LIVPLMOV (NCODIMOVIM);
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIVPLMOV
  add constraint PK_LIVPLMOV primary key (NCODIPLMOV)
  using index;
alter table LIVPLMOV
  add constraint UK_LIVPLMOV unique (NCODIMOVIM, NCODIPREDE)
  using index;
alter table LIVPLMOV
  add constraint FK_LIVPLMOV_LIVMOVIM foreign key (NCODIMOVIM)
  references LIVMOVIM (NCODIMOVIM);
  
insert into LIVPLMOV (NCODIPLMOV, NCODIMOVIM, NCODIPREDE, NPERCPLMOV, NVALOPLMOV, CPRINPLMOV)
values (1, 1, 5, 100.0000000000, 108.00, 'SIM');  