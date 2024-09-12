package com.api.fourd.repository;

import com.api.fourd.domein.CotaCampEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CotaCampRepository extends JpaRepository<CotaCampEntity, Long> {

    @Override
    <S extends CotaCampEntity> S save(S entity);
}