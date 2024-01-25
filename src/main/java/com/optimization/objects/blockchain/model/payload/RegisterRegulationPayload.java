package com.optimization.objects.blockchain.model.payload;

import com.optimization.objects.blockchain.api.MessagePayload;

public class RegisterRegulationPayload implements MessagePayload {
	
	private String endpoint;

	public RegisterRegulationPayload() {
		
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
}
