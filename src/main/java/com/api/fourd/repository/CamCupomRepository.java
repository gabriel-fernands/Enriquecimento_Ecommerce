package com.api.fourd.repository;

import com.api.fourd.domein.CamCupomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamCupomRepository extends JpaRepository<CamCupomEntity, Long> {

    @Override
    <S extends CamCupomEntity> S save(S entity);
}