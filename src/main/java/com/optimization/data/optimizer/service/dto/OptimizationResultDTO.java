package com.optimization.data.optimizer.service.dto;

import org.springframework.lang.Nullable;

import java.time.LocalDateTime;
import java.util.UUID;


public class OptimizationResultDTO {
    private UUID optId;
    private String[] optimizedFlightSequence; // a sequence of flight identifiers
    private Integer[] optimizedFlightSequenceIndexes; // the flight sequence as index positions
    private LocalDateTime[] slots;

    /** Basic Statistics **/

    @Nullable
    private Double fitness = null;
    @Nullable
    private Double secondFitness = null;

    public OptimizationResultDTO(UUID optId, String[] optimizedFlightSequence, LocalDateTime[] slots) {
        this.optId = optId;
        this.optimizedFlightSequence = optimizedFlightSequence;
        this.slots = slots;
    }

    public OptimizationResultDTO(UUID optId, String[] optimizedFlightSequence, LocalDateTime[] slots, Integer[] optimizedFlightSequenceIndexes) {
        this.optId = optId;
        this.optimizedFlightSequence = optimizedFlightSequence;
        this.slots = slots;
        this.optimizedFlightSequenceIndexes = optimizedFlightSequenceIndexes;
    }

    public OptimizationResultDTO() {
        // for fasterxml jackson
    }

    public LocalDateTime[] getSlots() {
        return slots;
    }

    public void setSlots(LocalDateTime[] slots) {
        this.slots = slots;
    }

    public Double getFitness() {
        return fitness;
    }

    public void setFitness(Double fitness) {
        this.fitness = fitness;
    }

    @Nullable
    public Double getSecondFitness() {
        return secondFitness;
    }

    public void setSecondFitness(@Nullable Double secondFitness) {
        this.secondFitness = secondFitness;
    }

    public UUID getOptId() {
        return optId;
    }

    public void setOptId(UUID optId) {
        this.optId = optId;
    }

    public String[] getOptimizedFlightSequence() {
        return optimizedFlightSequence;
    }

    public void setOptimizedFlightSequence(String[] optimizedFlightSequence) {
        this.optimizedFlightSequence = optimizedFlightSequence;
    }

    public Integer[] getOptimizedFlightSequenceIndexes() {
        return optimizedFlightSequenceIndexes;
    }

    public void setOptimizedFlightSequenceIndexes(Integer[] optimizedFlightSequenceIndexes) {
        this.optimizedFlightSequenceIndexes = optimizedFlightSequenceIndexes;
    }
}
