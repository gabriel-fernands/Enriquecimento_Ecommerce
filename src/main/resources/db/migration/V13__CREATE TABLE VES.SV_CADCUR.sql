
CREATE TABLE VES.SV_CADCUR
(	COD_VEST NUMBER(6,0),
     COD_CURS VARCHAR2(10 ),
     DES_CURS VARCHAR2(200 ),
     COD_GRUP NUMBER(2,0),
     INS_SIST NUMBER(4,0),
     CUR_SIST NUMBER(5,0),
     HAB_SIST NUMBER(3,0),
     PER_SIST NUMBER(1,0),
     LIB_VAGA NUMBER(1,0),
     VER_APTD VARCHAR2(1 ),
     PER_APRO NUMBER(3,0),
     CURS_BLO VARCHAR2(1 ),
     CURS_BOL VARCHAR2(1 ),
     VAL_INSC NUMBER(9,2),
     TXD_CONV NUMBER(7,4),
     CONS_VAL BOOLEAN DEFAULT TRUE,
     TXD_PGANT NUMBER(7,4),
     QTD_VAGA NUMBER(4,0),
     SIT_CUR BOOLEAN DEFAULT TRUE,
     ID_CADCUR NUMBER(8,0)
);

GRANT DELETE ON VES.SV_CADCUR TO sa;
GRANT INSERT ON VES.SV_CADCUR TO sa;
GRANT SELECT ON VES.SV_CADCUR TO sa;
GRANT UPDATE ON VES.SV_CADCUR TO sa;