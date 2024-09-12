package com.api.fourd.domein;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CAMPANHA", schema = "VES")
public class CampanhaEntity {

    @Id
    @Column(name = "ID_SV_CAMPANHA2")
    private Integer idSvCampanha2;

    @Column(name = "COD_CAMP")
    private Long codCamp;

    @Column(name = "DESCRICA")
    private String descriCa;

    @Column(name = "TIPO_ENS")
    private Integer tipoEns;

    @Column(name = "TXD_MATR")
    private Double txdMatr;

    @Column(name = "TXD_MATR_PS")
    private Double txdMatrPs;

    @Column(name = "VAL_MATR")
    private Double valMatr;

    @Column(name = "VAL_MATR_PS")
    private Double valMatrPs;

    @Column(name = "DTA_IVAL")
    private Date dtaIval;

    @Column(name = "DTA_FVAL")
    private Date dtaFval;

    @Column(name = "INC_EX_ALUN")
    private Integer incExAlun;

    @Column(name = "INC_BOL_PAG")
    private Integer incBolPag;

    @Column(name = "TXD_MEND")
    private Double txdMend;

    @Column(name = "TXD_MENN")
    private Double txdMenn;

    @Column(name = "TXD_MENS_PS")
    private Double txdMensPs;

    @Column(name = "OBSERVAC")
    private String observac;

    @Column(name = "ANO_VEST")
    private Integer anoVest;

    @Column(name = "SEM_VEST")
    private Integer semVest;

    @Column(name = "TIP_CAMP")
    private Integer tipCamp;

    @Column(name = "TIP_DESC")
    private Integer tipDesc;

    @Column(name = "COD_SDES")
    private Integer codSdes;

    @Column(name = "DSC_FIN_CUR")
    private Integer dscFinCur;

    @Column(name = "COD_AREA")
    private Integer codArea;

    @Column(name = "NOME_USU")
    private String nomeUsu;

    @Column(name = "TX_DESC_AC")
    private Double txDescAc;

    @Column(name = "TOT_PARC_AC")
    private Integer totParcAc;

    @Column(name = "AREA_ALUN")
    private Integer areaAlun;

    @Column(name = "ALUN_CAL")
    private Integer alunCal;

    @Column(name = "COD_CAMP_INSTEXT")
    private Long codCampInstext;

    @Column(name = "PRG_PAR_CUR")
    private Integer prgParCur;

    @Column(name = "TOTAL_PARC_PC")
    private Integer totalParcPc;
}
