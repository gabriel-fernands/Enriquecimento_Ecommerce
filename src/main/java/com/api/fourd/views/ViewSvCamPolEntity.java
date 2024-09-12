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
@Table(name = "VIEW_SV_CAMPOL", schema = "VES")
public class ViewSvCamPolEntity {
//Campanha Polo

    @Id
    @Column(name = "ID_POLO", nullable = false)
    private Long idPolo;

    @Column(name = "COD_VEST")
    private Long codVest;

    @Column(name = "COD_CURS")
    private String codCurs;

    @Column(name = "COD_CAMP")
    private Long codCamp;

    @Column(name = "SIT_CADA")
    private Integer sitCada;
}
