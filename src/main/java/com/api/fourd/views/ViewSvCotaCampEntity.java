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
@Table(name = "VIEW_SV_COTA_CAMP", schema = "VES")
public class ViewSvCotaCampEntity {
//Campanha Cota

    @Id
    @Column(name = "ID_SV_COTA_CAMP", nullable = false)
    private Long idSvcotacamp;

    @Column(name = "COD_CAMP")
    private Long codCamp;

    @Column(name = "ANO_VEST")
    private Integer anoVest;

    @Column(name = "SEM_VEST")
    private Integer semVest;

    @Column(name = "QTDE_COTAS")
    private Long qtdeCotas;

    @Column(name = "OBSERVAC")
    private String observac;

    @Column(name = "DATA_CAD")
    private Date dataCad;

    @Column(name = "NOME_USU")
    private String nomeUsu;

    @Column(name = "SIT_PARAM")
    private Integer sitParam;

}
