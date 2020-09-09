-- Create table
create table LIV_CFOP
(
  ncodi_cfop NUMBER not null,
  ccodi_cfop VARCHAR2(4) not null,
  cdesc_cfop VARCHAR2(4000) not null,
  ctipo_cfop VARCHAR2(15) not null
);
-- Add comments to the table 
comment on table LIV_CFOP
  is 'Natureza de Operação CFOP';
-- Add comments to the columns 
comment on column LIV_CFOP.ncodi_cfop
  is 'código da natureza de operaçao';
comment on column LIV_CFOP.ccodi_cfop
  is 'código literal da natureza de operaçao';
comment on column LIV_CFOP.cdesc_cfop
  is 'descrição da natureza de operaçao';
comment on column LIV_CFOP.ctipo_cfop
  is 'tipo da natureza de operaçao(SAIDA/ENTRADA)';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIV_CFOP
  add constraint PK_LIV_CFOP primary key (NCODI_CFOP)
  using index;
alter table LIV_CFOP
  add constraint UK_LIV_CFOP unique (CCODI_CFOP)
  using index;
  
insert into LIV_CFOP (NCODI_CFOP, CCODI_CFOP, CDESC_CFOP, CTIPO_CFOP)
values (1, '5102', 'Venda Merc. Adquirida ou Recebida de Terceiros', 'SAÍDA');

insert into LIV_CFOP (NCODI_CFOP, CCODI_CFOP, CDESC_CFOP, CTIPO_CFOP)
values (2, '5405', 'Venda Merc. Adquir. Rec. Terc. C/Merc. Suj. Subst. Tribut', 'SAÍDA');

insert into LIV_CFOP (NCODI_CFOP, CCODI_CFOP, CDESC_CFOP, CTIPO_CFOP)
values (3, '1403', 'Compra P/Comerc. Em Oper. Sujeita ao Regime Subst. Tributária', 'ENTRADA');

insert into LIV_CFOP (NCODI_CFOP, CCODI_CFOP, CDESC_CFOP, CTIPO_CFOP)
values (4, '5656', 'Venda de combustível ou lubrificante adquirido ou recebido de terceiros destinado a consumidor ou usuário final', 'SAÍDA');  