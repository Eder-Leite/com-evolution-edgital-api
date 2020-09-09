-- Create table
create table LIVTRIBU
(
  ncoditribu NUMBER not null,
  ccoditribu VARCHAR2(4) not null,
  cdesctribu VARCHAR2(255) not null
);
-- Add comments to the table 
comment on table LIVTRIBU
  is 'Tributação Fiscal';
-- Add comments to the columns 
comment on column LIVTRIBU.ncoditribu
  is 'código da tributação fiscal';
comment on column LIVTRIBU.ccoditribu
  is 'código literal da tributação fiscal';
comment on column LIVTRIBU.cdesctribu
  is 'descrição da tributação fiscal';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIVTRIBU
  add constraint PK_LIVTRIBU primary key (NCODITRIBU)
  using index;
alter table LIVTRIBU
  add constraint UK_LIVTRIBU unique (CCODITRIBU)
  using index;
  
insert into LIVTRIBU (NCODITRIBU, CCODITRIBU, CDESCTRIBU)
values (1, '00', 'Tributada Integralmente');

insert into LIVTRIBU (NCODITRIBU, CCODITRIBU, CDESCTRIBU)
values (2, '10', 'Tributada E Com Cobrança Do Icms Por Substituição Tributária');

insert into LIVTRIBU (NCODITRIBU, CCODITRIBU, CDESCTRIBU)
values (3, '20', 'Com Reducao De Base De Calculo');

insert into LIVTRIBU (NCODITRIBU, CCODITRIBU, CDESCTRIBU)
values (4, '40', 'Isento');

insert into LIVTRIBU (NCODITRIBU, CCODITRIBU, CDESCTRIBU)
values (5, '41', 'Não Tributada');

insert into LIVTRIBU (NCODITRIBU, CCODITRIBU, CDESCTRIBU)
values (6, '50', 'Suspensão');

insert into LIVTRIBU (NCODITRIBU, CCODITRIBU, CDESCTRIBU)
values (7, '51', 'Diferimento');

insert into LIVTRIBU (NCODITRIBU, CCODITRIBU, CDESCTRIBU)
values (8, '60', 'Icms Cobrado Anteriormente Por Substitucao Tributaria');

insert into LIVTRIBU (NCODITRIBU, CCODITRIBU, CDESCTRIBU)
values (9, '90', 'Outras'); 