
CREATE TABLE VES.SV_PSELET
(	COD_VEST NUMBER(6,0),
     COD_EMPR NUMBER(3,0),
     ANO_VEST NUMBER(4,0),
     SEM_VEST NUMBER(1,0),
     NR_MFILM NUMBER(8,0),
     CARTORIO VARCHAR2(100 ),
     END_CART VARCHAR2(100 ),
     TMIN_PRO DATE,
     TMAX_PRO DATE,
     TRI_VEST NUMBER(1,0),
     DES_VEST VARCHAR2(30 ),
     SIT_INSCR NUMBER(1,0),
     SIT_MATR NUMBER(1,0),
     NR_INSCR NUMBER(5,0),
     DESC_FEIR NUMBER(2,0),
     TXT_COMP VARCHAR2(500 ),
     COD_IES_PD VARCHAR2(50 ),
     EXIBE_PORTAL NUMBER(1,0) DEFAULT 0,
     DTA_MODIFICACAO_PARAM DATE,
     USUARIO_ALT VARCHAR2(100 )
);


GRANT DELETE ON VES.SV_PSELET TO sa;
GRANT INSERT ON VES.SV_PSELET TO sa;
GRANT SELECT ON VES.SV_PSELET TO sa;
GRANT UPDATE ON VES.SV_PSELET TO sa;
CREATE UNIQUE INDEX ACD.PK_CADPOL ON ACD.CADPOL (ID_POLO) ;;
--------------------------------------------------------
--  DDL for Index PK_EMPRES
--------------------------------------------------------

CREATE UNIQUE INDEX ACD.PK_EMPRES ON ACD.EMPRES (COD_EMPR) ;;
--------------------------------------------------------
--  DDL for Index PK_PAIS
--------------------------------------------------------

CREATE UNIQUE INDEX ACD.PK_PAIS ON ACD.PAIS (COD_PAIS) ;;
--------------------------------------------------------
--  DDL for Index PK_REGIONAL_COM
--------------------------------------------------------

CREATE UNIQUE INDEX ACD.PK_REGIONAL_COM ON ACD.REGIONAL_COM (ID_REGIONAL_COM) ;;
--------------------------------------------------------
--  DDL for Index PK_SAFRA_POLO_REDE
--------------------------------------------------------

CREATE UNIQUE INDEX ACD.PK_SAFRA_POLO_REDE ON ACD.SAFRA_POLO_REDE (ID_SAFRA_POLO_REDE) ;;
--------------------------------------------------------
--  DDL for Index PK_ST_POL_PROC_ALTERACAO
--------------------------------------------------------

CREATE UNIQUE INDEX ACD.PK_ST_POL_PROC_ALTERACAO ON ACD.ST_POL_PROC_ALTERACAO (ID_ST_POL_PROC_ALT) ;;
--------------------------------------------------------
--  DDL for Index PK_ID_SV_CAMPCUR
--------------------------------------------------------

CREATE UNIQUE INDEX VES.PK_ID_SV_CAMPCUR ON VES.SV_CAMPCUR (ID) ;;
--------------------------------------------------------
--  DDL for Index PK_SV_CADCUR
--------------------------------------------------------

CREATE UNIQUE INDEX VES.PK_SV_CADCUR ON VES.SV_CADCUR (COD_VEST, COD_CURS) ;;
--------------------------------------------------------
--  DDL for Index PK_SV_CAMPANHA2
--------------------------------------------------------

CREATE UNIQUE INDEX VES.PK_SV_CAMPANHA2 ON VES.SV_CAMPANHA2 (COD_CAMP) ;;
--------------------------------------------------------
--  DDL for Index PK_SV_CAMPETP
--------------------------------------------------------

CREATE UNIQUE INDEX VES.PK_SV_CAMPETP ON VES.SV_CAMPETP (ID_CAMPETP) ;;
--------------------------------------------------------
--  DDL for Index PK_SV_CONVENIO
--------------------------------------------------------

CREATE UNIQUE INDEX VES.PK_SV_CONVENIO ON VES.SV_CONVENIO (ID_CONVENIO) ;;
--------------------------------------------------------
--  DDL for Index PK_SV_COTA_CAMP
--------------------------------------------------------

CREATE UNIQUE INDEX VES.PK_SV_COTA_CAMP ON VES.SV_COTA_CAMP (ID_SV_COTA_CAMP) ;;
--------------------------------------------------------
--  DDL for Index PK_SV_PSELET
--------------------------------------------------------

CREATE UNIQUE INDEX VES.PK_SV_PSELET ON VES.SV_PSELET (COD_VEST) ;;
--------------------------------------------------------
--  DDL for Index SV_CAMPCUPOM_PK
--------------------------------------------------------

CREATE UNIQUE INDEX VES.SV_CAMPCUPOM_PK ON VES.SV_CAMCUPOM (COD_CAMP, ID_CUPOM) ;;
--------------------------------------------------------
--  DDL for Index SV_CAMPOL_PK
--------------------------------------------------------

CREATE UNIQUE INDEX VES.SV_CAMPOL_PK ON VES.SV_CAMPOL (ID_POLO, COD_VEST, COD_CURS, COD_CAMP) ;;
--------------------------------------------------------
--  DDL for Index UK_SV_CAMPANHA2
--------------------------------------------------------

CREATE UNIQUE INDEX VES.UK_SV_CAMPANHA2 ON VES.SV_CAMPANHA2 (ID_SV_CAMPANHA2) ;;
--------------------------------------------------------
--  DDL for Index UK_SV_CAMPCURS
--------------------------------------------------------

CREATE UNIQUE INDEX VES.UK_SV_CAMPCURS ON VES.SV_CAMPCUR (COD_CAMP, COD_VEST, COD_CURS) ;;
--------------------------------------------------------
--  DDL for Index UNIQUE_SV_COTA_CAMP
--------------------------------------------------------

CREATE UNIQUE INDEX VES.UNIQUE_SV_COTA_CAMP ON VES.SV_COTA_CAMP (COD_CAMP, ANO_VEST, SEM_VEST) ;;

--------------------------------------------------------
--  DDL for Function LOGMNR$COL_GG_TABF_PUBLIC
--------------------------------------------------------

-----
--------------------------------------------------------
--  Constraints for Table CADPOL
--------------------------------------------------------


-- VES.SV_CONVEMP definition