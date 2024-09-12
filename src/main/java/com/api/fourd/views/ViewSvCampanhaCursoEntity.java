package com.api.fourd.views;

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
@Table(name = "VIEW_SV_CAMPANHA_CURSO", schema = "VES")
public class ViewSvCampanhaCursoEntity {
//Campanha Curso

    @Id
    @Column(name = "ID_CAMPCUR")
    private Long idCampCur;

    @Column(name = "ID_CADCUR")
    private Long idCadCur;

    @Column(name = "COD_CAMP")
    private Long codCamp;

    @Column(name = "COD_VEST")
    private Long codVest;

    @Column(name = "COD_CURS")
    private String codCurs;

    @Column(name = "SIT_CADA")
    private Integer sitCada;

    @Column(name = "TX_DESC")
    private Double txDesc;

    @Column(name = "VL_MATRIC")
    private Double vlMatric;

    @Column(name = "DATA_CAD")
    private Date dataCad;

    @Column(name = "NOME_USU_CAD")
    private String nomeUsuCad;

    @Column(name = "DATA_MOD")
    private Date dataMod;

    @Column(name = "NOME_USU_MOD")
    private String nomeUsuMod;

    @Column(name = "TX_DESC_SEG")
    private Double txDescSeg;

    @Column(name = "DES_CURS")
    private String desCurs;

    @Column(name = "COD_GRUP")
    private Integer codGrup;

    @Column(name = "INS_SIST")
    private Integer insSist;

    @Column(name = "CUR_SIST")
    private Integer curSist;

    @Column(name = "HAB_SIST")
    private Integer habSist;

    @Column(name = "PER_SIST")
    private Integer perSist;

    @Column(name = "LIB_VAGA")
    private Integer libVaga;

    @Column(name = "VER_APTD")
    private String verAptd;

    @Column(name = "PER_APRO")
    private Integer perApro;

    @Column(name = "CURS_BLO")
    private String cursBlo;

    @Column(name = "CURS_BOL")
    private String cursBol;

    @Column(name = "VAL_INSC")
    private Double valInsc;

    @Column(name = "TXD_CONV")
    private Double txdConv;

    @Column(name = "CONS_VAL")
    private Integer consVal;

    @Column(name = "TXD_PGANT")
    private Double txdPgant;

    @Column(name = "QTD_VAGA")
    private Integer qtdVaga;

    @Column(name = "SIT_CUR")
    private Integer sitCur;

    public Long getIdCampCur() {
        return idCampCur;
    }

    public Long getIdCadCur() {
        return idCadCur;
    }

    public Long getCodCamp() {
        return codCamp;
    }

    public Long getCodVest() {
        return codVest;
    }

    public String getCodCurs() {
        return codCurs;
    }

    public Integer getSitCada() {
        return sitCada;
    }

    public Double getTxDesc() {
        return txDesc;
    }

    public Double getVlMatric() {
        return vlMatric;
    }

    public Date getDataCad() {
        return dataCad;
    }

    public String getNomeUsuCad() {
        return nomeUsuCad;
    }

    public Date getDataMod() {
        return dataMod;
    }

    public String getNomeUsuMod() {
        return nomeUsuMod;
    }

    public Double getTxDescSeg() {
        return txDescSeg;
    }

    public String getDesCurs() {
        return desCurs;
    }

    public Integer getCodGrup() {
        return codGrup;
    }

    public Integer getInsSist() {
        return insSist;
    }

    public Integer getCurSist() {
        return curSist;
    }

    public Integer getHabSist() {
        return habSist;
    }

    public Integer getPerSist() {
        return perSist;
    }

    public Integer getLibVaga() {
        return libVaga;
    }

    public String getVerAptd() {
        return verAptd;
    }

    public Integer getPerApro() {
        return perApro;
    }

    public String getCursBlo() {
        return cursBlo;
    }

    public String getCursBol() {
        return cursBol;
    }

    public Double getValInsc() {
        return valInsc;
    }

    public Double getTxdConv() {
        return txdConv;
    }

    public Integer getConsVal() {
        return consVal;
    }

    public Double getTxdPgant() {
        return txdPgant;
    }

    public Integer getQtdVaga() {
        return qtdVaga;
    }

    public Integer getSitCur() {
        return sitCur;
    }
}