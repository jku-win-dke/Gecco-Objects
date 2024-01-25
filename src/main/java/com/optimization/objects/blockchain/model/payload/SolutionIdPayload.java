package com.optimization.objects.blockchain.model.payload;

import com.optimization.objects.blockchain.api.MessagePayload;

public class SolutionIdPayload implements MessagePayload {

    private String solutionId;

    public SolutionIdPayload() {

    }

    public String getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(String solutionId) {
        this.solutionId = solutionId;
    }
}
