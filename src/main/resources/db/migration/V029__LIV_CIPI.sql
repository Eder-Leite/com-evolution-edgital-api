-- Create table
create table LIV_CIPI
(
  ncodi_cipi NUMBER not null,
  ccodi_cipi VARCHAR2(4) not null,
  cdesc_cipi VARCHAR2(255) not null
);
-- Add comments to the table 
comment on table LIV_CIPI
  is 'Código IPI';
-- Add comments to the columns 
comment on column LIV_CIPI.ncodi_cipi
  is 'código IPI';
comment on column LIV_CIPI.ccodi_cipi
  is 'código literal IPI';
comment on column LIV_CIPI.cdesc_cipi
  is 'descrição IPI';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIV_CIPI
  add constraint PK_LIV_CIPI primary key (NCODI_CIPI)
  using index;
alter table LIV_CIPI
  add constraint UK_LIV_CIPI unique (CCODI_CIPI)
  using index;
  
insert into LIV_CIPI (NCODI_CIPI, CCODI_CIPI, CDESC_CIPI)
values (1, '01', 'Entrada tributada com alíquota zero');

insert into LIV_CIPI (NCODI_CIPI, CCODI_CIPI, CDESC_CIPI)
values (2, '02', 'Entrada isenta');

insert into LIV_CIPI (NCODI_CIPI, CCODI_CIPI, CDESC_CIPI)
values (3, '03', 'Entrada não-tributada');

insert into LIV_CIPI (NCODI_CIPI, CCODI_CIPI, CDESC_CIPI)
values (4, '04', 'Entrada imune');

insert into LIV_CIPI (NCODI_CIPI, CCODI_CIPI, CDESC_CIPI)
values (5, '05', 'Entrada com suspensão');

insert into LIV_CIPI (NCODI_CIPI, CCODI_CIPI, CDESC_CIPI)
values (6, '51', 'Saída tributada com alíquota zero');

insert into LIV_CIPI (NCODI_CIPI, CCODI_CIPI, CDESC_CIPI)
values (7, '52', 'Saída isenta');

insert into LIV_CIPI (NCODI_CIPI, CCODI_CIPI, CDESC_CIPI)
values (8, '53', 'Saída não-tributada');

insert into LIV_CIPI (NCODI_CIPI, CCODI_CIPI, CDESC_CIPI)
values (9, '54', 'Saída imune');

insert into LIV_CIPI (NCODI_CIPI, CCODI_CIPI, CDESC_CIPI)
values (10, '55', 'Saída com suspensão');
  