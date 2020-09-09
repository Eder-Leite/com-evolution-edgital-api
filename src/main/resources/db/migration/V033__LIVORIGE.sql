-- Create table
create table LIVORIGE
(
  ncodiorige NUMBER not null,
  ccodiorige VARCHAR2(4) not null,
  cdescorige VARCHAR2(255) not null
);
-- Add comments to the table 
comment on table LIVORIGE
  is 'Origem de Produto';
-- Add comments to the columns 
comment on column LIVORIGE.ncodiorige
  is 'código da origem de produto';
comment on column LIVORIGE.ccodiorige
  is 'código literal da origem de produto';
comment on column LIVORIGE.cdescorige
  is 'descrição da origem de produto';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIVORIGE
  add constraint PK_LIVORIGE primary key (NCODIORIGE)
  using index;
alter table LIVORIGE
  add constraint UK_LIVORIGE unique (CCODIORIGE)
  using index;
  
insert into LIVORIGE (NCODIORIGE, CCODIORIGE, CDESCORIGE)
values (1, '0', 'Nacional');

insert into LIVORIGE (NCODIORIGE, CCODIORIGE, CDESCORIGE)
values (2, '1', 'Estrangeira -importacão direta, exceto a indicada no código');

insert into LIVORIGE (NCODIORIGE, CCODIORIGE, CDESCORIGE)
values (3, '2', 'Estrangeira -adquirida no mercado interno, exceto ind. cod. 7');

insert into LIVORIGE (NCODIORIGE, CCODIORIGE, CDESCORIGE)
values (4, '3', 'Nacional, conteúdo  de importação superior a 40% e menor  70%');

insert into LIVORIGE (NCODIORIGE, CCODIORIGE, CDESCORIGE)
values (5, '4', 'Nacional, produção em conformidade c/ Dec. 288/1967');

insert into LIVORIGE (NCODIORIGE, CCODIORIGE, CDESCORIGE)
values (6, '5', 'Nacional, conteúdo de importação inferior ou igual a 40');

insert into LIVORIGE (NCODIORIGE, CCODIORIGE, CDESCORIGE)
values (7, '6', 'Estrangeira -importação direta, sem similar nacional');

insert into LIVORIGE (NCODIORIGE, CCODIORIGE, CDESCORIGE)
values (8, '7', 'Estrangeira -adquirida  mercado interno, sem similar nacional');

insert into LIVORIGE (NCODIORIGE, CCODIORIGE, CDESCORIGE)
values (9, '8', 'Nacional, conteúdo de importação superior a 70%');  