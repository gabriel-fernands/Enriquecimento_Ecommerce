package com.api.fourd.service;

import com.api.fourd.application.IntegrationEvent;
import com.api.fourd.kafka.StartCampDataEnrichment;
import com.api.fourd.repository.DataEnrichmentProcess;
import com.api.fourd.repository.PersistCampDataEnrichment;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StartCampDataEnrichmentService extends StartCampDataEnrichment {

    private final Logger logger = LoggerFactory.getLogger(StartCampDataEnrichmentService.class);
    private final DataEnrichmentProcess dataEnrichmentProcesses;
    private final PersistCampDataEnrichment persistCampDataEnrichment;
    private final ObjectMapper objectMapper;

    public StartCampDataEnrichmentService(DataEnrichmentProcess dataEnrichmentProcesses, PersistCampDataEnrichment persistCampDataEnrichment, ObjectMapper objectMapper) {
        this.dataEnrichmentProcesses = dataEnrichmentProcesses;
        this.persistCampDataEnrichment = persistCampDataEnrichment;
        this.objectMapper = objectMapper;
    }

    @Override
    public void startCampDataEnrichment(String jsonEvent) {
        logger.info("Starting data enrichment for event: {}", jsonEvent);

        try {
            IntegrationEvent event = objectMapper.readValue(jsonEvent, IntegrationEvent.class);
            List<Object> allEnrichedItems = new ArrayList<>();

            List<Object> enrichedItems = dataEnrichmentProcesses.enrichmentProcess(event);

            allEnrichedItems.addAll(enrichedItems);

            allEnrichedItems.forEach(persistCampDataEnrichment::persistItem);

            logger.info("Finished data enrichment for event type: {}", event.getEventType());
        } catch (JsonProcessingException e) {
            logger.error("Unable to map JSON event to IntegrationEvent object.", e);
        }
    }
}