package com.api.fourd.repository;

import com.api.fourd.domein.CampEtpEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampEtpRepository extends JpaRepository<CampEtpEntity, Long> {

    @Override
    <S extends CampEtpEntity> S save(S entity);
}