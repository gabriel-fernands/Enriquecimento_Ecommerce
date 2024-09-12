package com.api.fourd.application;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Data
@ToString
public class IntegrationEvent {
    private Long id;
    private String sourceTable;
    private String eventType;
    private Long sourceKey;
    private String complement;
    private LocalDate insertedAt;
    private Boolean processed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSourceTable() {
        return sourceTable;
    }

    public void setSourceTable(String sourceTable) {
        this.sourceTable = sourceTable;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Long getSourceKey() {
        return sourceKey;
    }

    public void setSourceKey(Long sourceKey) {
        this.sourceKey = sourceKey;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public LocalDate getInsertedAt() {
        return insertedAt;
    }

    public void setInsertedAt(LocalDate insertedAt) {
        this.insertedAt = insertedAt;
    }

    public Boolean getProcessed() {
        return processed;
    }

    public void setProcessed(Boolean processed) {
        this.processed = processed;
    }
}

