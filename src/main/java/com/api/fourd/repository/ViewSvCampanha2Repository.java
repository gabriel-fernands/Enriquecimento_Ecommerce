package com.api.fourd.repository;

import com.api.fourd.views.ViewSvCampanha2Entity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ViewSvCampanha2Repository extends JpaRepository<ViewSvCampanha2Entity, Long> {

    @Query("SELECT sv FROM ViewSvCampanha2Entity sv WHERE sv.codCamp = :codCamp")
    List<ViewSvCampanha2Entity> findByCodCamp(@Param("codCamp") Long codCamp);

    @Override
    <S extends ViewSvCampanha2Entity> S save(S entity);
}