package com.api.fourd.views;

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
@Table(name = "VIEW_SV_CAMPCURPARC", schema = "FIN")
public class ViewSvCampCurParcEntity {

    @Id
    @Column(name = "ID_CAMPCURPARC", nullable = false)
    private Long idCampCurParc;

    @Column(name = "ID_CAMPCUR", nullable = false)
    private Long idCampCur;

    @Column(name = "SEQ_PARC", nullable = false)
    private Integer seqParc;

    @Column(name = "INC_PARC", nullable = false)
    private Integer incParc;

    @Column(name = "TX_DESC", nullable = false)
    private Integer txDesc;
}