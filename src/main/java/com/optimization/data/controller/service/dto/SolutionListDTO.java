package com.optimization.data.controller.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SolutionListDTO {
    private String regulationId = null;
    private String optimizationId = null;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime currentServerTime = null;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime rejectUntil = null;

    private List<SolutionDTO> solutions = null;

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

    public LocalDateTime getCurrentServerTime() {
        return currentServerTime;
    }

    public void setCurrentServerTime(LocalDateTime currentServerTime) {
        this.currentServerTime = currentServerTime;
    }

    public LocalDateTime getRejectUntil() {
        return rejectUntil;
    }

    public void setRejectUntil(LocalDateTime rejectUntil) {
        this.rejectUntil = rejectUntil;
    }

    public List<SolutionDTO> getSolutions() {
        return solutions;
    }

    public void setSolutions(List<SolutionDTO> solutions) {
        this.solutions = solutions;
    }

    public void addSolution(SolutionDTO solution) {
        if (this.solutions == null) {
            this.solutions = new ArrayList<>();
        }
        this.solutions.add(solution);
    }
}
