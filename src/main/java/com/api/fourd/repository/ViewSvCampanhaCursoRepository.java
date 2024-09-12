package com.api.fourd.repository;

import com.api.fourd.views.ViewSvCampanhaCursoEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewSvCampanhaCursoRepository extends JpaRepository<ViewSvCampanhaCursoEntity, Long> {

    @Query("SELECT cc FROM ViewSvCampanhaCursoEntity cc WHERE cc.codVest = :codVest")
    List<ViewSvCampanhaCursoEntity> findByCodVest(@Param("codVest") Long codVest);

    @Query("SELECT c FROM ViewSvCampanhaCursoEntity c WHERE c.codCamp = :codCamp")
    List<ViewSvCampanhaCursoEntity> findByIdCodCamp(@Param("codCamp") Long codCamp);

    @Override
    <S extends ViewSvCampanhaCursoEntity> S save(S entity);
}