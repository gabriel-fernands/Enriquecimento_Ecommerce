DATA.SQL
CREATE SCHEMA IF NOT EXISTS ACD;
CREATE SCHEMA IF NOT EXISTS VES;
CREATE SCHEMA IF NOT EXISTS INTERNET;

CREATE TABLE VES.SV_ETAPA2
(
    COD_VEST INT NOT NULL,
    SEQ_VEST INT NOT NULL,
    DES_ETAPA VARCHAR(50) DEFAULT '<<NOVA ETAPA>>',
    COD_TIPO INT,
    NR_QUEST INT DEFAULT 0,
    VL_INSCR DECIMAL(7,2) DEFAULT 0,
    DT_INI_INS DATE,
    DT_FIN_INSW DATE,
    DT_FIN_INSP DATE,
    DT_VMATR DATE,
    DT_PGTAN DATE,
    COND_ALT VARCHAR(1) DEFAULT 'S',
    SIT_VEST INT,
    CONS_VAL INT DEFAULT 0,
    TRI_INGR INT,
    COD_CAMP INT,
    NR_TITUL VARCHAR(10),
    ID_ETAPA2 INT,
    DT_FIN_CAD DATE,
    PRIMARY KEY (COD_VEST, SEQ_VEST)
);