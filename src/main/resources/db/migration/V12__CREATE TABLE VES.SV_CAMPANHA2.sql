
CREATE TABLE VES.SV_CAMPANHA2
(	COD_CAMP NUMBER(5,0),
     DESCRICA VARCHAR2(150 ),
     TIPO_ENS NUMBER(2,0),
     TXD_MATR NUMBER(5,2),
     TXD_MATR_PS NUMBER(5,2),
     VAL_MATR NUMBER(9,2),
     VAL_MATR_PS NUMBER(9,2),
     DTA_IVAL DATE,
     DTA_FVAL DATE,
     INC_EX_ALUN NUMBER(1,0),
     INC_BOL_PAG NUMBER(1,0),
     TXD_MEND NUMBER(5,2),
     TXD_MENN NUMBER(5,2),
     TXD_MENS_PS NUMBER(5,2),
     OBSERVAC VARCHAR2(200 ),
     ANO_VEST NUMBER(4,0),
     SEM_VEST NUMBER(1,0),
     TIP_CAMP NUMBER(2,0),
     TIP_DESC NUMBER(3,0),
     COD_SDES NUMBER(3,0),
     DSC_FIN_CUR NUMBER(1,0),
     COD_AREA NUMBER,
     NOME_USU VARCHAR2(30 ),
     TX_DESC_AC NUMBER(5,2),
     TOT_PARC_AC NUMBER(3,0),
     AREA_ALUN NUMBER(2,0),
     ALUN_CAL NUMBER(2,0),
     COD_CAMP_INSTEXT NUMBER(5,0),
     ID_SV_CAMPANHA2 NUMBER(5,0),
     PRG_PAR_CUR NUMBER(2,0),
     TOTAL_PARC_PC NUMBER
) ;
GRANT DELETE ON VES.SV_CAMPANHA2 TO sa;
GRANT INSERT ON VES.SV_CAMPANHA2 TO sa;
GRANT SELECT ON VES.SV_CAMPANHA2 TO sa;
GRANT UPDATE ON VES.SV_CAMPANHA2 TO sa;