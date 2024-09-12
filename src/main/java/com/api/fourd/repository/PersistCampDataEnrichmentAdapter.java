package com.api.fourd.repository;

import com.api.fourd.domein.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PersistCampDataEnrichmentAdapter implements PersistCampDataEnrichment {

    private final CamCupomRepository camCupomRepository;
    private final CampanhaRepository campanhaRepository;
    private final CampanhaCursoRepository campanhaCursoRepository;
    private final CampEtpRepository campEtpRepository;
    private final CamPolRepository camPolRepository;
    private final CotaCampRepository cotaCampRepository;
    private final CampCurParcRepository campCurParcRepository;

    public PersistCampDataEnrichmentAdapter(CamCupomRepository camCupomRepository, CampanhaRepository campanhaRepository, CampanhaCursoRepository campanhaCursoRepository, CampEtpRepository campEtpRepository, CamPolRepository camPolRepository, CotaCampRepository cotaCampRepository, CampCurParcRepository campCurParcRepository) {
        this.camCupomRepository = camCupomRepository;
        this.campanhaRepository = campanhaRepository;
        this.campanhaCursoRepository = campanhaCursoRepository;
        this.campEtpRepository = campEtpRepository;
        this.camPolRepository = camPolRepository;
        this.cotaCampRepository = cotaCampRepository;
        this.campCurParcRepository = campCurParcRepository;
    }

    @Override
    public void persistItem(Object data) {
        try {
            if (data instanceof CamCupomEntity) {
                camCupomRepository.save((CamCupomEntity) data);
                log.info("CamCupomEntity - Saved Passed");
            } else if (data instanceof CampanhaEntity) {
                log.info("Aqui ------>>>>>> " + ((CampanhaEntity) data).getIdSvCampanha2());
                campanhaRepository.save((CampanhaEntity) data);
                log.info("CampanhaEntity - Saved Passed");
            } else if (data instanceof CampanhaCursoEntity) {
                campanhaCursoRepository.save((CampanhaCursoEntity) data);
                log.info("CampanhaCursoEntity - Saved Passed");
            } else if (data instanceof CampCurParcEntity) {
                campCurParcRepository.save((CampCurParcEntity) data);
                log.info("CampCurParcEntity - Saved Passed");
            } else if (data instanceof CampEtpEntity) {
                campEtpRepository.save((CampEtpEntity) data);
                log.info("CampEtpEntity - Saved Passed");
            } else if (data instanceof CamPolEntity) {
                camPolRepository.save((CamPolEntity) data);
                log.info("CamPolEntity - Saved Passed");
            } else if (data instanceof CotaCampEntity) {
                cotaCampRepository.save((CotaCampEntity) data);
                log.info("CotaCampEntity - Saved Passed");
            } else {
                log.error("Data type not recognized for persistence.");
                return;
            }
            log.info("Data enrichment persistence completed for {}", data.getClass().getSimpleName());
        } catch (DataAccessException e) {
            log.error("An exception occurred during the data persistence.", e);
            throw e;
        }
    }
}