-- Create table
create table LIVPAMOV
(
  ncodipamov NUMBER not null,
  ncodimovim NUMBER not null,
  nnumepamov NUMBER not null,
  nvalopamov NUMBER(19,2) default 0 not null,
  ddvenpamov DATE not null,
  ddatapamov DATE default SYSDATE not null
);
-- Add comments to the table 
comment on table LIVPAMOV
  is 'Parcela Financeira da Movimentação';
-- Add comments to the columns 
comment on column LIVPAMOV.ncodipamov
  is 'código da parcela financeira da movimentação';
comment on column LIVPAMOV.ncodimovim
  is 'código do movimento';
comment on column LIVPAMOV.nnumepamov
  is 'número da parcela financeira da movimentação';
comment on column LIVPAMOV.nvalopamov
  is 'código da parcela financeira da movimentação';
comment on column LIVPAMOV.ddvenpamov
  is 'data de vencimento da parcela financeira da movimentação';
comment on column LIVPAMOV.ddatapamov
  is 'data de cadastro da parcela financeira da movimentação';
-- Create/Recreate indexes 
create index FK_LIVPAMOV_LIVMOVIM on LIVPAMOV (NCODIMOVIM);
-- Create/Recreate primary, unique and foreign key constraints 
alter table LIVPAMOV
  add constraint PK_LIVPAMOV primary key (NCODIPAMOV)
  using index;
alter table LIVPAMOV
  add constraint UK_LIVPAMOV unique (NCODIMOVIM, NNUMEPAMOV)
  using index;  
alter table LIVPAMOV
  add constraint FK_LIVPAMOV_LIVMOVIM foreign key (NCODIMOVIM)
  references LIVMOVIM (NCODIMOVIM);
  
  
insert into LIVMOVIM (NCODIMOVIM, NCODIFILIA, NCODIGERAL, NCODIENDER, NCODIFINAL, NCODIMODEL, NCODISERIE, NINDPMOVIM, NCONFMOVIM, NDOCUMOVIM, CSITUMOVIM, CHAVEMOVIM, DDATAMOVIM, DENSAMOVIM, DDTCAMOVIM, NVBCIMOVIM, NVICMMOVIM, NVICDMOVIM, NFCPIMOVIM, NICMIMOVIM, NICMRMOVIM, NVFCPMOVIM, NVBSTMOVIM, NVLSTMOVIM, NFCPSMOVIM, NFCPRMOVIM, NVTOPMOVIM, NVFREMOVIM, NVSEGMOVIM, NVDESMOVIM, NVLIIMOVIM, NVIPIMOVIM, NIPIDMOVIM, NVPISMOVIM, NVCOFMOVIM, NVOUTMOVIM, NIRRFMOVIM, NINSSMOVIM, NVISSMOVIM, NCSLLMOVIM, NTOTAMOVIM, NTTRIMOVIM, CFISCMOVIM, CICOMMOVIM, COBSEMOVIM)
values (1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'ABERTO', null, to_date('02-10-2019', 'dd-mm-yyyy'), to_date('02-10-2019', 'dd-mm-yyyy'), to_date('02-10-2019 18:28:02', 'dd-mm-yyyy hh24:mi:ss'), 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, null, null, null);

---------

insert into LIVITMOV (NCODIITMOV, NCODIMOVIM, NCODIPRODU, NCODI_CFOP, NCODICOMPN, NCODIORIGE, NCODITRIBU, NCODIUNIDA, CCPROITMOV, CDPROITMOV, NQUATITMOV, NVLRUITMOV, NVLRCITMOV, NAICMITMOV, NRICMITMOV, NVBCIITMOV, NVICMITMOV, NVICDITMOV, NFCPIITMOV, NICMIITMOV, NICMRITMOV, NVFCPITMOV, NAISTITMOV, NRISTITMOV, NVBSTITMOV, NVLSTITMOV, NFCPSITMOV, NFCPRITMOV, NBISAITMOV, NVISAITMOV, NVTOPITMOV, NVFREITMOV, NVSEGITMOV, NVDESITMOV, NVLIIITMOV, NCODI_CIPI, NCODIALIPI, NAIPIITMOV, NRIPIITMOV, NBIPIITMOV, NVIPIITMOV, NIPIDITMOV, NCODICSPIS, NAPISITMOV, NRPISITMOV, NBPISITMOV, NVPISITMOV, NCODICSCOF, NACOFITMOV, NRCOFITMOV, NBCOFITMOV, NVCOFITMOV, NVOUTITMOV, NAIRRITMOV, NBIRRITMOV, NIRRFITMOV, NAINSITMOV, NBINSITMOV, NINSSITMOV, NAISSITMOV, NBISSITMOV, NVISSITMOV, NACSLITMOV, NBCSLITMOV, NCSLLITMOV, NTTRIITMOV, CINFAITMOV)
values (1, 1, 1, 3, 1, 1, 1, 1, null, null, 1.000, 0.0000000000, 0.0000000000, 0.0000, 0.0000, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.0000, 0.0000, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, null, null, 0.0000, 0.0000, 0.00, 0.00, 0.00, null, 0.0000, 0.0000, 0.00, 0.00, null, 0.0000, 0.00, 0.00, 0.00, 0.00, 0.0000, 0.00, 0.00, 0.0000, 0.00, 0.00, 0.0000, 0.00, 0.00, 0.0000, 0.00, 0.00, 0.00, null);

--------

insert into LIVPAMOV (NCODIPAMOV, NCODIMOVIM, NNUMEPAMOV, NVALOPAMOV, DDVENPAMOV, DDATAPAMOV)
values (1, 1, 1, 20.00, to_date('29-08-2019', 'dd-mm-yyyy'), to_date('29-08-2019 11:56:26', 'dd-mm-yyyy hh24:mi:ss'));

insert into LIVPAMOV (NCODIPAMOV, NCODIMOVIM, NNUMEPAMOV, NVALOPAMOV, DDVENPAMOV, DDATAPAMOV)
values (2, 1, 2, 20.00, to_date('30-08-2019', 'dd-mm-yyyy'), to_date('29-08-2019 11:56:26', 'dd-mm-yyyy hh24:mi:ss'));

insert into LIVPAMOV (NCODIPAMOV, NCODIMOVIM, NNUMEPAMOV, NVALOPAMOV, DDVENPAMOV, DDATAPAMOV)
values (3, 1, 3, 68.00, to_date('31-08-2019', 'dd-mm-yyyy'), to_date('29-08-2019 11:56:26', 'dd-mm-yyyy hh24:mi:ss'));

--------

  