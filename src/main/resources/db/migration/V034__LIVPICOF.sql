-- Create table
create table LIVPICOF
(
  ncodipicof NUMBER not null,
  ccodipicof VARCHAR2(4) not null,
  cdescpicof VARCHAR2(255) not null
);
-- Add comments to the table 
comment on table LIVPICOF
  is 'PIS e COFINS';
-- Add comments to the columns 
comment on column LIVPICOF.ncodipicof
  is 'código PIS e COFINS';
comment on column LIVPICOF.ccodipicof
  is 'código literal PIS e COFINS';
comment on column LIVPICOF.cdescpicof
  is 'descriçao PIS e COFINS';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIVPICOF
  add constraint PK_LIVPICOF primary key (NCODIPICOF)
  using index;
alter table LIVPICOF
  add constraint UK_LIVPICOF unique (CCODIPICOF)
  using index;
  
insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (1, '01', 'Operação Tributável com Alíquota Básica');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (2, '02', 'Operação Tributável com Alíquota Diferenciada');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (3, '03', 'Operação Tributável com Alíquota por Unidade de Medida de Produto');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (4, '04', 'Operação Tributável Monofásica - Revenda a Alíquota Zero');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (5, '05', 'Operação Tributável por Substituição Tributária');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (6, '06', 'Operação Tributável a Alíquota Zero');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (7, '07', 'Operação Isenta da Contribuição');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (8, '08', 'Operação sem Incidência da Contribuição');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (9, '09', 'Operação com Suspensão da Contribuição');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (10, '49', 'Outras Operações de Saída');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (11, '50', 'Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (12, '51', 'Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (13, '52', 'Operação com Direito a Crédito - Vinculada Exclusivamente a Receita de Exportação');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (14, '53', 'Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (15, '54', 'Operação com Direito a Crédito - Vinculada a Receitas Tributadas no Mercado Interno e de Exportação');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (16, '55', 'Operação com Direito a Crédito - Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (17, '56', 'Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (18, '60', 'Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (19, '61', 'Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (20, '62', 'Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (21, '63', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (22, '64', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (23, '65', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (24, '66', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (25, '67', 'Crédito Presumido - Outras Operações');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (26, '70', 'Operação de Aquisição sem Direito a Crédito');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (27, '71', 'Operação de Aquisição com Isenção');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (28, '72', 'Operação de Aquisição com Suspensão');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (29, '73', 'Operação de Aquisição a Alíquota Zero');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (30, '74', 'Operação de Aquisição sem Incidência da Contribuição');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (31, '75', 'Operação de Aquisição por Substituição Tributária');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (32, '98', 'Outras Operações de Entrada');

insert into LIVPICOF (NCODIPICOF, CCODIPICOF, CDESCPICOF)
values (33, '99', 'Outras Operações');  