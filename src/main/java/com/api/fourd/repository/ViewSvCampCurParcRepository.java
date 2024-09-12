package com.api.fourd.repository;

import com.api.fourd.views.ViewSvCampCurParcEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewSvCampCurParcRepository extends JpaRepository<ViewSvCampCurParcEntity, Long> {

    @Query("SELECT c FROM ViewSvCampCurParcEntity c WHERE c.id = :idCampCur")
    List<ViewSvCampCurParcEntity> findByIdCampCur(@Param("idCampCur") Long idCampCur);
    @Override
    <S extends ViewSvCampCurParcEntity> S save(S entity);

}
