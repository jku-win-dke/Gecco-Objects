package com.optimization.objects.blockchain.model.payload;

import com.optimization.objects.blockchain.api.MessagePayload;

public class NMFConnectionEstablishedPayload implements MessagePayload {

    private String nmfHost;

    public NMFConnectionEstablishedPayload() {

    }

    public String getNmfHost() {
        return nmfHost;
    }

    public void setNmfHost(String nmfHost) {
        this.nmfHost = nmfHost;
    }
}
