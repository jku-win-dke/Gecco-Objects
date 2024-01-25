package com.optimization.data.optimizer.service.dto;

import java.time.Duration;
import java.time.LocalDateTime;

import org.springframework.lang.Nullable;

public class OptimizationStatisticsDTO {
    private String optId;

    // the instant when information about the optimization was retrieved
    private LocalDateTime requestTime;

    private OptimizationStatusEnum status;

    private LocalDateTime timeCreated;

    @Nullable
    private LocalDateTime timeStarted;

    @Nullable
    private LocalDateTime timeAborted;

    @Nullable
    private LocalDateTime timeFinished;

    private Duration duration;

    private double initialFitness;
    private double resultFitness;
    @Nullable
    private double theoreticalMaximumFitness;
    private int iterations;

    @Nullable
    private FitnessEvolutionStepDTO[] fitnessEvolution;

    public String getOptId() {
        return optId;
    }

    public void setOptId(String optId) {
        this.optId = optId;
    }

    public LocalDateTime getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(LocalDateTime requestTime) {
        this.requestTime = requestTime;
    }

    public OptimizationStatusEnum getStatus() {
        return status;
    }

    public void setStatus(OptimizationStatusEnum status) {
        this.status = status;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public LocalDateTime getTimeStarted() {
        return timeStarted;
    }

    public void setTimeStarted(LocalDateTime timeStarted) {
        this.timeStarted = timeStarted;
    }

    public LocalDateTime getTimeAborted() {
        return timeAborted;
    }

    public void setTimeAborted(LocalDateTime timeAborted) {
        this.timeAborted = timeAborted;
    }

    public LocalDateTime getTimeFinished() {
        return timeFinished;
    }

    public void setTimeFinished(LocalDateTime timeFinished) {
        this.timeFinished = timeFinished;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public double getInitialFitness() {
        return initialFitness;
    }

    public void setInitialFitness(double initialFitness) {
        this.initialFitness = initialFitness;
    }

    public double getResultFitness() {
        return resultFitness;
    }

    public void setResultFitness(double resultFitness) {
        this.resultFitness = resultFitness;
    }

    public int getIterations() {
        return iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }

    public FitnessEvolutionStepDTO[] getFitnessEvolution() {
        return fitnessEvolution;
    }

    public void setFitnessEvolution(FitnessEvolutionStepDTO[] fitnessEvolution) {
        this.fitnessEvolution = fitnessEvolution;
    }

    public double getTheoreticalMaximumFitness() {
        return theoreticalMaximumFitness;
    }

    public void setTheoreticalMaximumFitness(double theoreticalMaximumFitness) {
        this.theoreticalMaximumFitness = theoreticalMaximumFitness;
    }
}