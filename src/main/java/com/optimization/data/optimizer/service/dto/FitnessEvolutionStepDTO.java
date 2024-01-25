package com.optimization.data.optimizer.service.dto;

public class FitnessEvolutionStepDTO<SetType> {
    private int generation;
    private SetType[] evaluatedPopulation;
    private SetType[] estimatedPopulation;

    public FitnessEvolutionStepDTO() {

    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public SetType[] getEvaluatedPopulation() {
        return evaluatedPopulation;
    }

    public void setEvaluatedPopulation(SetType[] evaluatedPopulation) {
        this.evaluatedPopulation = evaluatedPopulation;
    }

    public SetType[] getEstimatedPopulation() {
        return estimatedPopulation;
    }

    public void setEstimatedPopulation(SetType[] estimatedPopulation) {
        this.estimatedPopulation = estimatedPopulation;
    }
}
