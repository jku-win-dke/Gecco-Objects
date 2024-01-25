package com.optimization.data.optimizer.service.dto;

import org.springframework.lang.Nullable;

public class MOOptimizationStatisticsDTO extends OptimizationStatisticsDTO {

    @Nullable
    private double firstTheoreticalFitness;
    @Nullable
    private double secondTheoreticalFitness;
    @Nullable
    private double firstFitnessResult;
    @Nullable
    private double secondFitnessResult;

    @Nullable
    private double balanceRatio;

    @Nullable
    private double[][] estimatedParetoFront;

    @Nullable
    private double[][] optimizedParetoFront;

    public double getFirstTheoreticalFitness() {
        return firstTheoreticalFitness;
    }

    public void setFirstTheoreticalFitness(double firstTheoreticalFitness) {
        this.firstTheoreticalFitness = firstTheoreticalFitness;
    }

    public double getSecondTheoreticalFitness() {
        return secondTheoreticalFitness;
    }

    public void setSecondTheoreticalFitness(double secondTheoreticalFitness) {
        this.secondTheoreticalFitness = secondTheoreticalFitness;
    }

    public double getFirstFitnessResult() {
        return firstFitnessResult;
    }

    public void setFirstFitnessResult(double firstFitnessResult) {
        this.firstFitnessResult = firstFitnessResult;
    }

    public double getSecondFitnessResult() {
        return secondFitnessResult;
    }

    public void setSecondFitnessResult(double secondFitnessResult) {
        this.secondFitnessResult = secondFitnessResult;
    }

    @Nullable
    public double[][] getEstimatedParetoFront() {
        return estimatedParetoFront;
    }

    public void setEstimatedParetoFront(@Nullable double[][] estimatedParetoFront) {
        this.estimatedParetoFront = estimatedParetoFront;
    }

    @Nullable
    public double[][] getOptimizedParetoFront() {
        return optimizedParetoFront;
    }

    public void setOptimizedParetoFront(@Nullable double[][] optimizedParetoFront) {
        this.optimizedParetoFront = optimizedParetoFront;
    }

    public double getBalanceRatio() {
        return balanceRatio;
    }

    public void setBalanceRatio(double balanceRatio) {
        this.balanceRatio = balanceRatio;
    }
}
