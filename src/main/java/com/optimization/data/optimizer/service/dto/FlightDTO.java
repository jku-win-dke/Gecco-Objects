package com.optimization.data.optimizer.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.lang.Nullable;

import java.time.LocalDateTime;

public class FlightDTO {
    private String flightId;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime scheduledTime;

    @Nullable
    private int[] weightMap; // List of weights for slots; only used in mode NON_PRIVACY_PRESERVING

    @Nullable
    private int[] secondWeightMap; // List of weights for slots; only used in mode NON_PRIVACY_PRESERVING

    @Nullable
    private MarginsDTO margins; // The margins of the flight; only used in mode NON_PRIVACY_PRESERVING

    @Nullable
    private LocalDateTime timeNotAfter;

    public FlightDTO(String flightId, LocalDateTime scheduledTime, int[] weightMap, int[] secondWeightMap) {
        this(flightId, scheduledTime, weightMap);
        this.secondWeightMap = secondWeightMap;
    }

    public FlightDTO(String flightId, LocalDateTime scheduledTime, int[] weightMap) {
        this.flightId = flightId;
        this.scheduledTime = scheduledTime;
        this.weightMap = weightMap;
    }

    public FlightDTO(String flightId, LocalDateTime scheduledTime) {
        this.flightId = flightId;
        this.scheduledTime = scheduledTime;
    }

    public FlightDTO() { }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(LocalDateTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public int[] getWeightMap() {
        return weightMap;
    }

    public void setWeightMap(int[] weightMap) {
        this.weightMap = weightMap;
    }

    @Nullable
    public LocalDateTime getTimeNotAfter() {
        return timeNotAfter;
    }

    public void setTimeNotAfter(@Nullable LocalDateTime timeNotAfter) {
        this.timeNotAfter = timeNotAfter;
    }

    @Nullable
    public MarginsDTO getMargins() {

        return margins;
    }

    public void setMargins(@Nullable MarginsDTO margins) {
        this.margins = margins;
    }

    @Nullable
    public int[] getSecondWeightMap() {
        return secondWeightMap;
    }

    public void setSecondWeightMap(@Nullable int[] secondWeightMap) {
        this.secondWeightMap = secondWeightMap;
    }
}
