package com.optimization.data.privacyEngine.dto;

public class AboveIndividualsDTO {
    private Integer highest;
    private Integer[] indices;
    private Boolean best;

    public AboveIndividualsDTO(){

    }

    public Integer getHighest() {
        return highest;
    }

    public void setHighest(Integer highest) {
        this.highest = highest;
    }

    public Integer[] getIndices() {
        return indices;
    }

    public void setIndices(Integer[] indices) {
        this.indices = indices;
    }

    public Boolean getBest() {
        return best;
    }

    public void setBest(Boolean best) {
        this.best = best;
    }
}
