package com.api.fourd.repository;

import com.api.fourd.domein.CampanhaCursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampanhaCursoRepository extends JpaRepository<CampanhaCursoEntity, Long> {

    @Override
    <S extends CampanhaCursoEntity> S save(S entity);
}