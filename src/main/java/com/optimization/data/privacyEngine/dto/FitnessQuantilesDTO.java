package com.optimization.data.privacyEngine.dto;

public class FitnessQuantilesDTO {
    private int maximum;
    private int[][] fitnessQuantilePopulation;

    public FitnessQuantilesDTO() {

    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int[][] getFitnessQuantilePopulation() {
        return fitnessQuantilePopulation;
    }

    public void setFitnessQuantilePopulation(int[][] fitnessQuantilePopulation) {
        this.fitnessQuantilePopulation = fitnessQuantilePopulation;
    }
}
