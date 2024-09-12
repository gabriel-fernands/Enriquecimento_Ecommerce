package com.api.fourd.repository;

import com.api.fourd.views.ViewSvCamCupomEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewSvCamCupomRepository extends JpaRepository<ViewSvCamCupomEntity, Long> {

    @Query("SELECT s FROM ViewSvCamCupomEntity s WHERE s.codCamp = :codCamp")
    List<ViewSvCamCupomEntity> findByCodCamp(@Param("codCamp") Long codCamp);

    @Override
    <S extends ViewSvCamCupomEntity> S save(S entity);
}