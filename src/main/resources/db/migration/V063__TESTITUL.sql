-- Create table
create table TESTITUL
(
  ncodititul NUMBER not null,
  ncodiempre NUMBER not null,
  ncodigeral NUMBER not null,
  ncodiusuar NUMBER not null,
  ncodiprede NUMBER,
  nfat_pedid NUMBER,
  nadm_pedid NUMBER,
  ncodilancm NUMBER,
  ntitptitul NUMBER,
  ctipotitul VARCHAR2(15) not null,
  ddemititul DATE not null,
  ddventitul DATE not null,
  ddatatitul DATE default SYSDATE not null,
  ddliqtitul DATE,
  cdocutitul VARCHAR2(25) not null,
  nparctitul NUMBER default 1 not null,
  nvalotitul NUMBER(19,2) default 0 not null,
  nvpagtitul NUMBER(19,2) default 0 not null,
  nvdestitul NUMBER(19,2) default 0 not null,
  nvjurtitul NUMBER(19,2) default 0 not null,
  ntxjutitul NUMBER(19,10) default 0 not null,
  ntxdetitul NUMBER(19,10) default 0 not null
);
-- Add comments to the table 
comment on table TESTITUL
  is 'Titulos a Receber/Pagar';
-- Add comments to the columns 
comment on column TESTITUL.ncodititul
  is 'código do título financeiro';
comment on column TESTITUL.ncodiempre
  is 'código da empresa';
comment on column TESTITUL.ncodigeral
  is 'código do cadastro geral';
comment on column TESTITUL.ncodiusuar
  is 'código do usuário';
comment on column TESTITUL.ncodiprede
  is 'código do plano de receita ou despesa';  
comment on column TESTITUL.nfat_pedid
  is 'código do pedido do faturamento';
comment on column TESTITUL.nadm_pedid
  is 'código do pedido do adm';  
comment on column TESTITUL.ncodilancm
  is 'código do lançamento manual financeiro';
comment on column TESTITUL.ntitptitul
  is 'título pai do título financeiro';  
comment on column TESTITUL.ctipotitul
  is 'tipo do título financeiro(DÉBITO/CRÉDITO)';
comment on column TESTITUL.ddemititul
  is 'data de emissão do título financeiro';
comment on column TESTITUL.ddventitul
  is 'data de vencimento do título financeiro';
comment on column TESTITUL.ddatatitul
  is 'data lançamento do título financeiro';
comment on column TESTITUL.ddliqtitul
  is 'data de liquidação do título financeiro';
comment on column TESTITUL.cdocutitul
  is 'documento do título financeiro';
comment on column TESTITUL.nparctitul
  is 'número da parcela do título financeiro';
comment on column TESTITUL.nvalotitul
  is 'valor do título financeiro';
comment on column TESTITUL.nvpagtitul
  is 'valor pago do título financeiro';
comment on column TESTITUL.nvdestitul
  is 'valor de desconto do título financeiro';
comment on column TESTITUL.nvjurtitul
  is 'valor de juros do título financeiro';
comment on column TESTITUL.ntxjutitul
  is 'valor de taxa de juros do título financeiro';
comment on column TESTITUL.ntxdetitul
  is 'valor de taxa de desconto do título financeiro';  
-- Create/Recreate indexes 
create index FK_TESTITUL_ADMPEDID on TESTITUL (NADM_PEDID);
create index FK_TESTITUL_FATPEDID on TESTITUL (NFAT_PEDID);
create index FK_TESTITUL_CADEMPRE on TESTITUL (NCODIEMPRE);
create index FK_TESTITUL_CADGERAL on TESTITUL (NCODIGERAL);
create index FK_TESTITUL_SEGUSUAR on TESTITUL (NCODIUSUAR);
create index FK_TESTITUL_TESTITUL on TESTITUL (NTITPTITUL);
create index FK_TESTITUL_TESLANCM on TESTITUL (NCODILANCM);
create index FK_TESTITUL_TESPREDE on TESTITUL (NCODIPREDE);  
-- Create/Recreate primary, unique and foreign key constraints 
alter table TESTITUL
  add constraint PK_TESTITUL primary key (NCODITITUL)
  using index;
alter table TESTITUL
  add constraint FK_TESTITUL_ADMPEDID foreign key (NADM_PEDID)
  references ADMPEDID (NCODIPEDID);
alter table TESTITUL
  add constraint FK_TESTITUL_FATPEDID foreign key (NFAT_PEDID)
  references FATPEDID (NCODIPEDID);  
alter table TESTITUL
  add constraint FK_TESTITUL_CADEMPRE foreign key (NCODIEMPRE)
  references CADEMPRE (NCODIEMPRE);
alter table TESTITUL
  add constraint FK_TESTITUL_CADGERAL foreign key (NCODIGERAL)
  references CADGERAL (NCODIGERAL);
alter table TESTITUL
  add constraint FK_TESTITUL_SEGUSUAR foreign key (NCODIUSUAR)
  references SEGUSUAR (NCODIUSUAR); 
alter table TESTITUL
  add constraint FK_TESTITUL_TESPREDE foreign key (NCODIPREDE)
  references TESPREDE (NCODIPREDE);  
alter table TESTITUL
  add constraint FK_TESTITUL_TESTITUL foreign key (NTITPTITUL)
  references TESTITUL (NCODITITUL);
  
  
CREATE OR REPLACE PROCEDURE TES_PMANIPULA_LANCAMENT_MANUAL(P_ACAO    VARCHAR2,
                                                           P_CODIGO  NUMBER,
                                                           P_EMPRESA NUMBER,
                                                           P_USUARIO NUMBER) AS

  --09/09/2020
  --TES_PMANIPULA_LANCAMENTO_MANUAL

  V_CONTADOR      NUMBER := 0;
  V_TAXA_DESCONTO TESTITUL.NTXDETITUL%TYPE;
  V_TAXA_JUROS    TESTITUL.NTXJUTITUL%TYPE;

BEGIN

  IF (P_ACAO = 'FECHAR') THEN
  
    FOR TAXA IN (SELECT NVL(SUM(DESCONTO), 0) DESCONTO,
                        NVL(SUM(JUROS), 0) JUROS
                   FROM (SELECT (A.NPERCPLLAN * B.NVLIDPREDE / 100) DESCONTO,
                                (A.NPERCPLLAN * B.NVLIJPREDE / 100) JUROS
                           FROM TESPLLAN A, TESPREDE B
                          WHERE A.NCODIPREDE = B.NCODIPREDE
                            AND A.NCODILANCM = P_CODIGO)) LOOP
    
      V_TAXA_JUROS    := TAXA.JUROS;
      V_TAXA_DESCONTO := TAXA.DESCONTO;
    
    END LOOP;
  
    FOR REGISTRO IN (SELECT A.*,
                            (SELECT NVL(SUM(P.NVALOPALAN), 0)
                               FROM TESPALAN P
                              WHERE P.NCODILANCM = A.NCODILANCM) PARCELA,
                            (SELECT NVL(SUM(R.NVALOPLLAN), 0)
                               FROM TESPLLAN R
                              WHERE R.NCODILANCM = A.NCODILANCM) RATEIO
                       FROM TESLANCM A
                      WHERE A.NCODILANCM = P_CODIGO) LOOP
    
      IF (REGISTRO.CSITULANCM = 'FECHADO') THEN
        RAISE_APPLICATION_ERROR(-20001,
                                'ATENÇÃO ESSE REGISTRO JÁ ESTÁ FECHADO!');
      END IF;
    
      IF (REGISTRO.NVALOLANCM <> REGISTRO.PARCELA) THEN
        RAISE_APPLICATION_ERROR(-20001,
                                'ATENÇÃO O VALOR DO LANÇAMENTO DEVE SER IGUAL O VALOR TOTAL DE PARCELAS!');
      END IF;
    
      IF (REGISTRO.NVALOLANCM <> REGISTRO.RATEIO) THEN
        RAISE_APPLICATION_ERROR(-20001,
                                'ATENÇÃO O VALOR DO LANÇAMENTO DEVE SER IGUAL O VALOR TOTAL DO RATEIOS!');
      END IF;
    
      FOR PARCELA IN (SELECT *
                        FROM TESPALAN A
                       WHERE A.NCODILANCM = REGISTRO.NCODILANCM
                       ORDER BY A.DDVENPALAN) LOOP
      
        INSERT INTO TESTITUL
          (NCODITITUL,
           NCODIEMPRE,
           NCODIGERAL,
           NCODIUSUAR,
           NCODILANCM,
           CTIPOTITUL,
           DDEMITITUL,
           DDVENTITUL,
           DDATATITUL,
           CDOCUTITUL,
           NPARCTITUL,
           NVALOTITUL,
           NTXJUTITUL,
           NTXDETITUL)
        VALUES
          (TES_STESTITUL.NEXTVAL,
           P_EMPRESA,
           REGISTRO.NCODIGERAL,
           P_USUARIO,
           REGISTRO.NCODILANCM,
           REGISTRO.CTIPOLANCM,
           REGISTRO.DDATMLANCM,
           PARCELA.DDVENPALAN,
           SYSDATE,
           REGISTRO.CDOCULANCM,
           V_CONTADOR,
           PARCELA.NVALOPALAN,
           V_TAXA_JUROS,
           V_TAXA_DESCONTO);
      
        V_CONTADOR := V_CONTADOR + 1;
      
      END LOOP;
    
      UPDATE TESLANCM A
         SET A.CSITULANCM = 'FECHADO'
       WHERE A.NCODILANCM = REGISTRO.NCODILANCM;
    
    END LOOP;
  
  ELSIF (P_ACAO = 'ABRIR') THEN
  
    FOR REGISTRO IN (SELECT * FROM TESLANCM A WHERE A.NCODILANCM = P_CODIGO) LOOP
    
      IF (REGISTRO.CSITULANCM = 'ABERTO') THEN
        RAISE_APPLICATION_ERROR(-20001,
                                'ATENÇÃO ESSE REGISTRO JÁ ESTÁ ABERTO!');
      END IF;
    
      DELETE TESTITUL A WHERE A.NCODILANCM = REGISTRO.NCODILANCM;
    
      UPDATE TESLANCM A
         SET A.CSITULANCM = 'ABERTO'
       WHERE A.NCODILANCM = REGISTRO.NCODILANCM;
    
    END LOOP;
  
  END IF;

END TES_PMANIPULA_LANCAMENT_MANUAL;
/  
  