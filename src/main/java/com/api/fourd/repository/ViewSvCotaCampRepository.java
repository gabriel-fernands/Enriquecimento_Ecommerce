package com.api.fourd.repository;

import com.api.fourd.views.ViewSvCotaCampEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewSvCotaCampRepository extends JpaRepository<ViewSvCotaCampEntity, Long> {

    @Query("SELECT sv FROM ViewSvCotaCampEntity sv WHERE sv.codCamp = :codCamp")
    List<ViewSvCotaCampEntity> findByCodCamp(@Param("codCamp") Long codCamp);

    @Override
    <S extends ViewSvCotaCampEntity> S save(S entity);
}