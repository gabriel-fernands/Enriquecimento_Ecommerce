package com.api.fourd.repository;

import com.api.fourd.views.ViewSvCampEtpCotaEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewSvCampEtpRepository extends JpaRepository<ViewSvCampEtpCotaEntity, Long> {

    @Query("SELECT sv FROM ViewSvCampEtpCotaEntity sv WHERE sv.codVest = :codCamp")
    List<ViewSvCampEtpCotaEntity> findByCodCamp(@Param("codCamp") Long codCamp);

    @Override
    <S extends ViewSvCampEtpCotaEntity> S save(S entity);
}