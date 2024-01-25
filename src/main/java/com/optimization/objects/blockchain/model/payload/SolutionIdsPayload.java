package com.optimization.objects.blockchain.model.payload;

import com.optimization.objects.blockchain.api.MessagePayload;

public class SolutionIdsPayload implements MessagePayload {

    private String[] solutionIds;

    public SolutionIdsPayload() {

    }

    public String[] getSolutionIds() {
        return solutionIds;
    }

    public void setSolutionIds(String[] solutionIds) {
        this.solutionIds = solutionIds;
    }
}
