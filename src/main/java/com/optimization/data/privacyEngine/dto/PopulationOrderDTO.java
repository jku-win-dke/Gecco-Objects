package com.optimization.data.privacyEngine.dto;

public class PopulationOrderDTO {
    private int maximum;
    private int[] order;

    public PopulationOrderDTO() {

    }

    public PopulationOrderDTO(int maximum, int[] order) {
        super();
        this.maximum = maximum;
        this.order = order;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int[] getOrder() {
        return order;
    }

    public void setOrder(int[] order) {
        this.order = order;
    }
}
