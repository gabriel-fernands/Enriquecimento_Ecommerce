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
@Table(name = "CAMPETP", schema = "VES")
public class CampEtpEntity {

    @Id
    @Column(name = "ID_CAMPETP", nullable = false)
    private Long idCampetp;

    @Column(name = "COD_CAMP")
    private Long codCamp;

    @Column(name = "COD_VEST")
    private Long codVest;

    @Column(name = "SEQ_VEST")
    private Integer seqVest;

    @Column(name = "DTI_APROV")
    private Date dtiAprov;

    @Column(name = "DTF_APROV")
    private Date dtfAprov;

    @Column(name = "SIT_CADA")
    private Integer sitCada;

    @Column(name = "DESCRICAO")
    private String descricao;
}