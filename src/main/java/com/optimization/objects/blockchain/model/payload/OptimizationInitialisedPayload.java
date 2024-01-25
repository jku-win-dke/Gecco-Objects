package com.optimization.objects.blockchain.model.payload;

import com.optimization.objects.blockchain.api.MessagePayload;

public class OptimizationInitialisedPayload implements MessagePayload {

    private String optimizationFramework;
    private String fitnessMethod;

    public OptimizationInitialisedPayload() {

    }

    public String getOptimizationFramework() {
        return optimizationFramework;
    }

    public void setOptimizationFramework(String optimizationFramework) {
        this.optimizationFramework = optimizationFramework;
    }

    public String getFitnessMethod() {
        return fitnessMethod;
    }

    public void setFitnessMethod(String fitnessMethod) {
        this.fitnessMethod = fitnessMethod;
    }
}
