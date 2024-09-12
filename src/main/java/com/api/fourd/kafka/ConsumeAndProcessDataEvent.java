package com.api.fourd.kafka;

import com.api.fourd.application.CampDataEnrichmentConfig;
import com.api.fourd.application.IntegrationEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ConsumeAndProcessDataEvent {

    private CampDataEnrichmentConfig ingestConfig;
    private  StartCampDataEnrichment startCampDataEnrichment;

    @KafkaListener(topics = "${spring.kafka.topic}")
    public void consume(IntegrationEvent event) {
        log.info("Received integration event: {}", event);

        try {
            // Check if the eventType is "CAM", if not ignore the event
            if (ingestConfig.getEventType().equals(event.getEventType())) {
                startCampDataEnrichment.startCampDataEnrichment(String.valueOf(event));
                // Log the enrichment start
                log.info("Data enrichment started: {}", event);
            }
        } catch (Exception e) {
            log.error("Failed to process integration event: ", e);
        }
    }
}