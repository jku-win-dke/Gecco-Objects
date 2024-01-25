package com.optimization.data.controller.service.dto;

import java.util.List;

public class FlightListDTO {
    private OptimizationDTO optimization;

    private List<SlotDTO> slots = null;
    private List<FlightDTO> flights = null;

    public OptimizationDTO getOptimization() {
        return optimization;
    }

    public void setOptimization(OptimizationDTO optimization) {
        this.optimization = optimization;
    }

    public List<SlotDTO> getSlots() {
        return slots;
    }

    public void setSlots(List<SlotDTO> slots) {
        this.slots = slots;
    }

    public List<FlightDTO> getFlights() {
        return flights;
    }

    public void setFlights(List<FlightDTO> flights) {
        this.flights = flights;
    }
}
