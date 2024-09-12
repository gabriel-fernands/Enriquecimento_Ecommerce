package com.api.fourd.repository;

import com.api.fourd.application.IntegrationEvent;

import java.util.List;

public interface DataEnrichmentProcess {
    List<Object> enrichmentProcess(IntegrationEvent event);
}
