-- Create table
create table LIVALIPI
(
  ncodialipi NUMBER not null,
  cdescalipi VARCHAR2(255) not null,
  npercalipi NUMBER(5,2) not null,
  nvaloalipi NUMBER(7,4) not null
);
-- Add comments to the table 
comment on table LIVALIPI
  is 'Aliquota de IPI';
-- Add comments to the columns 
comment on column LIVALIPI.ncodialipi
  is 'código da aliquota de ipi';
comment on column LIVALIPI.cdescalipi
  is 'descrição da aliquota de ipi';
comment on column LIVALIPI.npercalipi
  is 'percentual da aliquota de ipi';
comment on column LIVALIPI.nvaloalipi
  is 'valor da aliquota de ipi';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIVALIPI
  add constraint PK_LIVALIPI primary key (NCODIALIPI)
  using index;
alter table LIVALIPI
  add constraint UK_LIVALIPI unique (NPERCALIPI)
  using index;
  
  
insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (1, '1% - ALIQUOTA', 1.00, 1.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (2, '2% - ALIQUOTA', 2.00, 2.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (3, '3% - ALIQUOTA', 3.00, 3.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (4, '4% - ALIQUOTA', 4.00, 4.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (5, '5% - ALIQUOTA', 5.00, 5.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (6, '6% - ALIQUOTA', 6.00, 6.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (7, '7% - ALIQUOTA', 7.00, 7.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (8, '8% - ALIQUOTA', 8.00, 8.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (9, '9% - ALIQUOTA', 9.00, 9.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (10, '10% - ALIQUOTA', 10.00, 10.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (11, '11% - ALIQUOTA', 11.00, 11.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (12, '12% - ALIQUOTA', 12.00, 12.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (13, '13% - ALIQUOTA', 13.00, 13.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (14, '14% - ALIQUOTA', 14.00, 14.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (15, '15% - ALIQUOTA', 15.00, 15.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (16, '16% - ALIQUOTA', 16.00, 16.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (17, '17% - ALIQUOTA', 17.00, 17.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (18, '18% - ALIQUOTA', 18.00, 18.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (19, '19% - ALIQUOTA', 19.00, 19.0000);

insert into LIVALIPI (NCODIALIPI, CDESCALIPI, NPERCALIPI, NVALOALIPI)
values (20, '20% - ALIQUOTA', 20.00, 20.0000);
  