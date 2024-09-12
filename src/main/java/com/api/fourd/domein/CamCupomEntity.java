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
@Table(name = "CAMCUPOM", schema = "VES")
public class CamCupomEntity {

    @Id
    @Column(name = "ID_CUPOM", nullable = false)
    private Long idCupom;

    @Column(name = "COD_CAMP")
    private Integer codCamp;

    @Column(name = "NOME_USU")
    private String nomeUsu;

    @Column(name = "DATA_CAD")
    private Date dataCad;

    @Column(name = "COD_VEST")
    private Integer codVest;

    @Column(name = "COD_CUPOM")
    private String codCupom;

    @Column(name = "VAL_DESC")
    private Double valDesc;

    @Column(name = "NOME_CAP")
    private String nomeCap;

    @Column(name = "SITUACAO")
    private Integer situacao;
}
