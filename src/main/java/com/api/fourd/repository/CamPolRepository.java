package com.api.fourd.repository;

import com.api.fourd.domein.CamPolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamPolRepository extends JpaRepository<CamPolEntity, Long> {

    @Override
    <S extends CamPolEntity> S save(S entity);
}