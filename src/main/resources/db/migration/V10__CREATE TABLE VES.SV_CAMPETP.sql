
CREATE TABLE VES.SV_CAMPETP
(	ID_CAMPETP NUMBER(5,0),
     COD_CAMP NUMBER(5,0),
     COD_VEST NUMBER(3,0),
     SEQ_VEST NUMBER(2,0),
     DTI_APROV DATE,
     DTF_APROV DATE,
     SIT_CADA NUMBER(1,0)
) ;
GRANT DELETE ON VES.SV_CAMPETP TO sa;
GRANT INSERT ON VES.SV_CAMPETP TO sa;
GRANT SELECT ON VES.SV_CAMPETP TO sa;
GRANT UPDATE ON VES.SV_CAMPETP TO sa;