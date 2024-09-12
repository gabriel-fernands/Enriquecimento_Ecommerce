package com.api.fourd.repository;

import com.api.fourd.domein.CampCurParcEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampCurParcRepository extends JpaRepository<CampCurParcEntity, Long> {

    @Override
    <S extends CampCurParcEntity> S save(S entity);

}