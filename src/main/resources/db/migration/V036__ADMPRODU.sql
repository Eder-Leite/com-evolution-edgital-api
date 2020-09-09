-- Create table
create table ADMPRODU
(
  ncodiprodu NUMBER not null,
  ncodiusuar NUMBER not null,
  ncodiorige NUMBER not null,
  ncodisbcat NUMBER not null,
  ncodiunida NUMBER not null,
  ncodialncm NUMBER,
  ncodi_cest NUMBER,
  ncodicoanp NUMBER,
  ncodialipi NUMBER,
  ccodiprodu VARCHAR2(10) not null,
  cdescprodu VARCHAR2(255) not null,
  ccbarprodu VARCHAR2(15),
  ncustprodu NUMBER(19,6) default 0 not null,
  ncusrprodu NUMBER(19,6) default 0 not null,
  nvendprodu NUMBER(19,3) default 0 not null,
  cfotoprodu CLOB,
  ccfcpprodu VARCHAR2(10) default 'NÃO' not null,
  ccombprodu VARCHAR2(10) default 'NÃO' not null,
  ccencprodu VARCHAR2(10) default 'NÃO' not null,
  cimpoprodu VARCHAR2(10) default 'NÃO' not null,
  cstatprodu VARCHAR2(15) default 'ATIVO' not null
);
-- Add comments to the table 
comment on table ADMPRODU
  is 'Produto';
-- Add comments to the columns 
comment on column ADMPRODU.ncodiprodu
  is 'código do produto';
comment on column ADMPRODU.ncodiusuar
  is 'código do usuário';
comment on column ADMPRODU.ncodiorige
  is 'código da origem do produto';  
comment on column ADMPRODU.ncodisbcat
  is 'código da subcategoria de produto';
comment on column ADMPRODU.ncodiunida
  is 'código da unidade de medida';
comment on column ADMPRODU.ncodialncm
  is 'código aliquota NCM';
comment on column ADMPRODU.ncodi_cest
  is 'código do CEST';
comment on column ADMPRODU.ncodicoanp
  is 'código da ANP';
comment on column ADMPRODU.ncodialipi
  is 'código aliquota IPI';  
comment on column ADMPRODU.ccodiprodu
  is 'código literal do produto';
comment on column ADMPRODU.cdescprodu
  is 'descrição do produto';
comment on column ADMPRODU.ccbarprodu
  is 'código de barra do produto';
comment on column ADMPRODU.ncustprodu
  is 'valor de custo do produto';
comment on column ADMPRODU.ncusrprodu
  is 'valor de custo real do produto';
comment on column ADMPRODU.nvendprodu
  is 'valor de renda do produto';  
comment on column ADMPRODU.cfotoprodu
  is 'imagem do produto';
comment on column ADMPRODU.ccfcpprodu
  is 'se calcula FCP no produto(SIM/NÃO)';
comment on column ADMPRODU.ccombprodu
  is 'se produto é combustivel(SIM/NÃO)';
comment on column ADMPRODU.ccencprodu
  is 'se produto calcula encerrante(SIM/NÃO)';
comment on column ADMPRODU.cimpoprodu
  is 'se produto é importado(SIM/NÃO)';  
comment on column ADMPRODU.cstatprodu
  is 'status do produto(ATIVO/INATIVO)';  
-- Create/Recreate indexes 
create index FK_ADMPRODU_LIVALNCM on ADMPRODU (NCODIALNCM);
create index FK_ADMPRODU_LIV_CEST on ADMPRODU (NCODI_CEST);
create index FK_ADMPRODU_LIVCOANP on ADMPRODU (NCODICOANP);
create index FK_ADMPRODU_ADMSBCAT on ADMPRODU (NCODISBCAT);
create index FK_ADMPRODU_LIVUNIDA on ADMPRODU (NCODIUNIDA);
create index FK_ADMPRODU_LIVALIPI on ADMPRODU (NCODIALIPI);
create index FK_ADMPRODU_LIVORIGE on ADMPRODU (NCODIORIGE);
create index FK_ADMPRODU_SEGUSUAR on ADMPRODU (NCODIUSUAR);
-- Create/Recreate primary, unique and foreign key constraints 
alter table ADMPRODU
  add constraint PK_ADMPRODU primary key (NCODIPRODU)
  using index;
alter table ADMPRODU
  add constraint UK_ADMPRODU unique (CCODIPRODU)
  using index;
alter table ADMPRODU
  add constraint FK_ADMPRODU_LIVALNCM foreign key (NCODIALNCM)
  references LIVALNCM (NCODIALNCM);
alter table ADMPRODU
  add constraint FK_ADMPRODU_LIV_CEST foreign key (NCODI_CEST)
  references LIV_CEST (NCODI_CEST);
alter table ADMPRODU
  add constraint FK_ADMPRODU_LIVCOANP foreign key (NCODICOANP)
  references LIVCOANP (NCODICOANP);
alter table ADMPRODU
  add constraint FK_ADMPRODU_ADMSBCAT foreign key (NCODISBCAT)
  references ADMSBCAT (NCODISBCAT);
alter table ADMPRODU
  add constraint FK_ADMPRODU_LIVUNIDA foreign key (NCODIUNIDA)
  references LIVUNIDA (NCODIUNIDA);
alter table ADMPRODU
  add constraint FK_ADMPRODU_LIVALIPI foreign key (NCODIALIPI)
  references LIVALIPI (NCODIALIPI);
alter table ADMPRODU
  add constraint FK_ADMPRODU_LIVORIGE foreign key (NCODIORIGE)
  references LIVORIGE (NCODIORIGE);
alter table ADMPRODU
  add constraint FK_ADMPRODU_SEGUSUAR foreign key (NCODIUSUAR)
  references SEGUSUAR (NCODIUSUAR);
  
CREATE OR REPLACE FUNCTION ADM_FGERA_CODIGO_PRODUTO(P_SUBCATEGORIA NUMBER)
  RETURN NUMBER AS
BEGIN

  FOR PRODUTO IN (SELECT *
                    FROM (SELECT TO_NUMBER(NVL(MAX(A.CCODIPRODU), 0)) CODIGO
                            FROM ADMPRODU A
                           WHERE A.NCODISBCAT = P_SUBCATEGORIA)
                   WHERE CODIGO > 0) LOOP
  
    RETURN PRODUTO.CODIGO + 1;
  END LOOP;

  FOR PRODUTO IN (SELECT TO_NUMBER(A.CCODISBCAT || '000001') CODIGO
                    FROM ADMSBCAT A
                   WHERE A.NCODISBCAT = P_SUBCATEGORIA) LOOP
  
    RETURN PRODUTO.CODIGO;
  
  END LOOP;

END ADM_FGERA_CODIGO_PRODUTO;
/

CREATE OR REPLACE TRIGGER TRG_TADMPRODU_BI
  BEFORE INSERT ON ADMPRODU
  FOR EACH ROW
BEGIN
  IF (:NEW.CCODIPRODU IS NULL) THEN
    :NEW.CCODIPRODU := ADM_FGERA_CODIGO_PRODUTO(:NEW.NCODISBCAT);
  END IF;
END TRG_TADMPRODU_BI;
/
  
insert into ADMPRODU (NCODIPRODU, NCODIUSUAR, NCODIORIGE, NCODISBCAT, NCODIUNIDA, NCODIALNCM, NCODI_CEST, NCODICOANP, CCODIPRODU, CDESCPRODU, CCBARPRODU, CFOTOPRODU, CCFCPPRODU, CCOMBPRODU, CCENCPRODU, CSTATPRODU)
values (1, 1, 1, 1, 38, null, null, null, '1001000001', 'ETANOL HIDRATADO COMUM', null, null, 'NÃO', 'SIM', 'SIM', 'ATIVO');  