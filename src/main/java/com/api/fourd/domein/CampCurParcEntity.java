package com.api.fourd.domein;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SV_CAMPCURPARC", schema = "VES")
public class CampCurParcEntity {

    @Id
    @Column(name = "ID_CAMPCURPARC")
    private Long idCampCurParc;

    @Column(name = "ID_CAMPCUR")
    private Long idCampCur;

    @Column(name = "SEQ_PARC")
    private Integer seqParc;

    @Column(name = "INC_PARC")
    private Integer incParc;

    @Column(name = "TX_DESC")
    private Integer txDesc;

}