-- Create table
create table CADEMPRE
(
  ncodiempre NUMBER not null,
  cnomeempre VARCHAR2(255) not null,
  clogoempre CLOB
);
-- Add comments to the table 
comment on table CADEMPRE
  is 'Empresa';
-- Add comments to the columns 
comment on column CADEMPRE.ncodiempre
  is 'código da empresa';
comment on column CADEMPRE.cnomeempre
  is 'nome da empresa';
comment on column CADEMPRE.clogoempre
  is 'logo da empresa';
-- Create/Recreate primary, unique and foreign key constraints 
alter table CADEMPRE
  add constraint PK_CADEMPRE primary key (NCODIEMPRE)
  using index;
  
insert into cadempre (NCODIEMPRE, CNOMEEMPRE, CLOGOEMPRE)
values (1, 'EVOLUTION SISTEMAS', 'iVBORw0KGgoAAAANSUhEUgAAAJQAAAAoCAYAAAAYNNPaAAAACXBIWXMAAAsTAAALEwEAmpwYAAABNmlDQ1BQaG90b3Nob3AgSUNDIHByb2ZpbGUAAHjarY6xSsNQFEDPi6LiUCsEcXB4kygotupgxqQtRRCs1SHJ1qShSmkSXl7VfoSjWwcXd7');  