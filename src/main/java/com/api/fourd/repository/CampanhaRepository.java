package com.api.fourd.repository;

import com.api.fourd.domein.CampanhaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampanhaRepository extends JpaRepository<CampanhaEntity, Long> {

    @Override
    <S extends CampanhaEntity> S save(S entity);
}