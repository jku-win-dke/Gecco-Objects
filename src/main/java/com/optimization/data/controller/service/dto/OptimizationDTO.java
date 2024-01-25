package com.optimization.data.controller.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class OptimizationDTO {
    private String regulationId = null;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime requestReceptionTime = null;
    private String requestId = null; // id of the request to the NMF which the optimization is based upon

    private String optimizationId = null;
    private OptimizationStateEnum state = null;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime currentServerTime = null;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime cutOffTime = null;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime nextOptimizationRun = null;

    public LocalDateTime getRequestReceptionTime() {
        return requestReceptionTime;
    }

    public void setRequestReceptionTime(LocalDateTime requestReceptionTime) {
        this.requestReceptionTime = requestReceptionTime;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRegulationId() {
        return regulationId;
    }

    public void setRegulationId(String regulationId) {
        this.regulationId = regulationId;
    }

    public String getOptimizationId() {
        return optimizationId;
    }

    public void setOptimizationId(String optimizationId) {
        this.optimizationId = optimizationId;
    }

    public OptimizationStateEnum getState() {
        return state;
    }

    public void setState(OptimizationStateEnum state) {
        this.state = state;
    }

    public LocalDateTime getCurrentServerTime() {
        return currentServerTime;
    }

    public void setCurrentServerTime(LocalDateTime currentServerTime) {
        this.currentServerTime = currentServerTime;
    }

    public LocalDateTime getCutOffTime() {
        return cutOffTime;
    }

    public void setCutOffTime(LocalDateTime cutOffTime) {
        this.cutOffTime = cutOffTime;
    }

    public LocalDateTime getNextOptimizationRun() {
        return nextOptimizationRun;
    }

    public void setNextOptimizationRun(LocalDateTime nextOptimizationRun) {
        this.nextOptimizationRun = nextOptimizationRun;
    }

    @Override
    public String toString() {
        return "OptimizationDTO{" +
                "requestReceptionTime=" + requestReceptionTime +
                ", requestId='" + requestId + '\'' +
                ", regulationId='" + regulationId + '\'' +
                ", optimizationId='" + optimizationId + '\'' +
                ", state='" + state + '\'' +
                ", currentServerTime=" + currentServerTime +
                ", cutOffTime=" + cutOffTime +
                ", nextOptimizationRun=" + nextOptimizationRun +
                '}';
    }
}
