package com.api.fourd.application;

import lombok.Getter;
import lombok.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class CampDataEnrichmentConfig {

    @Value( "${ingest.event-type}")
    private String eventType;

}