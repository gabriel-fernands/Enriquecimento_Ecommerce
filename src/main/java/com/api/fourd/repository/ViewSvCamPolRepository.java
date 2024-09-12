package com.api.fourd.repository;

import com.api.fourd.views.ViewSvCamPolEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewSvCamPolRepository extends JpaRepository<ViewSvCamPolEntity, Long> {

    @Query("SELECT sv FROM ViewSvCamPolEntity sv WHERE sv.codCamp = :codCamp")
    List<ViewSvCamPolEntity> findByCodCamp(@Param("codCamp") Long codCamp);

    @Override
    <S extends ViewSvCamPolEntity> S save(S entity);
}