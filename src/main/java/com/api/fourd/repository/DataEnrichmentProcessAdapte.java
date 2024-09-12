package com.api.fourd.repository;

import com.api.fourd.application.IntegrationEvent;
import com.api.fourd.domein.*;
import com.api.fourd.dtosMap.EntityToDtoMapper;
import com.api.fourd.views.ViewSvCampCurParcEntity;
import com.api.fourd.views.ViewSvCampanhaCursoEntity;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Component
public abstract class DataEnrichmentProcessAdapter implements DataEnrichmentProcess {
    private static final Logger logger = LoggerFactory.getLogger(DataEnrichmentProcessAdapter.class);


    private final EntityToDtoMapper mapper;
    private final ViewSvCamCupomRepository viewSvCamCupomRepository;
    private final ViewSvCampanha2Repository viewSvCampanha2Repository;
    private final ViewSvCampanhaCursoRepository viewSvCampanhaCursoRepository;
    private final ViewSvCampEtpRepository viewSvCampEtpRepository;
    private final ViewSvCamPolRepository viewSvCamPolRepository;
    private final ViewSvCotaCampRepository viewSvCotaCampRepository;
    private final ViewSvCampCurParcRepository viewSvCampCurParcRepository;

    public DataEnrichmentProcessAdapter(EntityToDtoMapper mapper, ViewSvCamCupomRepository viewSvCamCupomRepository, ViewSvCampanha2Repository viewSvCampanha2Repository, ViewSvCampanhaCursoRepository viewSvCampanhaCursoRepository, ViewSvCampEtpRepository viewSvCampEtpRepository, ViewSvCamPolRepository viewSvCamPolRepository, ViewSvCotaCampRepository viewSvCotaCampRepository, ViewSvCampCurParcRepository viewSvCampCurParcRepository) {
        this.mapper = mapper;
        this.viewSvCamCupomRepository = viewSvCamCupomRepository;
        this.viewSvCampanha2Repository = viewSvCampanha2Repository;
        this.viewSvCampanhaCursoRepository = viewSvCampanhaCursoRepository;
        this.viewSvCampEtpRepository = viewSvCampEtpRepository;
        this.viewSvCamPolRepository = viewSvCamPolRepository;
        this.viewSvCotaCampRepository = viewSvCotaCampRepository;
        this.viewSvCampCurParcRepository = viewSvCampCurParcRepository;
    }

    @Override
    @Transactional
    public List<Object> enrichmentProcess(IntegrationEvent event) {

        List<Object> enrichedItems = new ArrayList<>();

        enrichDataFromRepository(viewSvCamCupomRepository.findByCodCamp(event.getSourceKey()),
                enrichedItems, CamCupomEntity.class);
        logger.info("CamCupomEntity - Passed");
        enrichDataFromRepository(viewSvCampanha2Repository.findByCodCamp(event.getSourceKey()),
                enrichedItems, CampanhaEntity.class);
        logger.info("CampanhaEntity - Passed");

        List<ViewSvCampanhaCursoEntity> campanhaCursoEntities = viewSvCampanhaCursoRepository.findByIdCodCamp(event.getSourceKey());
        if (!campanhaCursoEntities.isEmpty()) {
            List<?> enrichedData = mapper.mapListWithoutIds(campanhaCursoEntities, CampanhaCursoEntity.class);
            enrichedItems.addAll(enrichedData);
            logger.info("CampanhaCursoEntity - Passed");
            logger.info(campanhaCursoEntities.get(0).getIdCampCur().toString());
            for (ViewSvCampanhaCursoEntity campanhaCursoEntity : campanhaCursoEntities) {
                logger.info("FOR CampanhaCursoEntity - Passed");
                logger.info(String.valueOf(campanhaCursoEntity));
                logger.info(campanhaCursoEntity.getIdCampCur().toString());
                Long idCampCur = campanhaCursoEntity.getIdCampCur();
                List<ViewSvCampCurParcEntity> parcelas = viewSvCampCurParcRepository.findByIdCampCur(idCampCur);
                List<CampCurParcEntity> enrichedDataEntity = mapper.mapListWithoutIds(parcelas, CampCurParcEntity.class);
                enrichedItems.addAll(enrichedDataEntity);
                logger.info("CampCurParcEntity - Passed");

            }
        } else {
            logger.info("No data found to enrich for entity {}", CampanhaCursoEntity.class.getSimpleName());
        }

        enrichDataFromRepository(viewSvCampEtpRepository.findByCodCamp(event.getSourceKey()),
                enrichedItems, CampEtpEntity.class);
        logger.info("CampEtpEntity - Passed");
        enrichDataFromRepository(viewSvCamPolRepository.findByCodCamp(event.getSourceKey()),
                enrichedItems, CamPolEntity.class);
        logger.info("CamPolEntity - Passed");
        enrichDataFromRepository(viewSvCotaCampRepository.findByCodCamp(event.getSourceKey()),
                enrichedItems, CotaCampEntity.class);
        logger.info("CotaCampEntity - Passed");


        logger.info("Data enrichment process completed successfully for sourceKey {}", event.getSourceKey());
        return enrichedItems;
    }

    private void enrichDataFromRepository(List<?> repositoryData, List<Object> enrichedItems, Class<?> entityClass) {
        try {
            if (!repositoryData.isEmpty()) {
                List<?> enrichedData = mapper.mapListWithoutIds(repositoryData, entityClass);
                enrichedItems.addAll(enrichedData);
            } else {
                logger.info("No data found to enrich for entity {}", entityClass.getSimpleName());
            }
        } catch (Exception ex) {
            logger.error("Error during data enrichment for entity {}", entityClass.getSimpleName(), ex);
        }
    }
}