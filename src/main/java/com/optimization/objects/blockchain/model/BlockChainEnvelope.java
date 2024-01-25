package com.optimization.objects.blockchain.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optimization.objects.blockchain.api.MessagePayload;

public class BlockChainEnvelope {
	
	private EventType eventType;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime timestamp = null;
	
	private String airspaceUserId;
	private String airportId;
	
	private String regulationId;
	private String regulationType;
	
	private String optimizationSessionId;
	
	private MessagePayload payload;

	public BlockChainEnvelope() {
		
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getAirspaceUserId() {
		return airspaceUserId;
	}

	public void setAirspaceUserId(String airspaceUserId) {
		this.airspaceUserId = airspaceUserId;
	}

	public String getAirportId() {
		return airportId;
	}

	public void setAirportId(String airportId) {
		this.airportId = airportId;
	}

	public String getRegulationId() {
		return regulationId;
	}

	public void setRegulationId(String regulationId) {
		this.regulationId = regulationId;
	}

	public String getRegulationType() {
		return regulationType;
	}

	public void setRegulationType(String regulationType) {
		this.regulationType = regulationType;
	}

	public String getOptimizationSessionId() {
		return optimizationSessionId;
	}

	public void setOptimizationSessionId(String optimizationSessionId) {
		this.optimizationSessionId = optimizationSessionId;
	}

	@JsonProperty
	public String getPayload() {
		String payloadStr = "";
		try {
			if (payload != null) {
				payloadStr = new ObjectMapper().writeValueAsString(payload);
			}
		} catch (JsonProcessingException e) {
			payloadStr = "";
		}
		return payloadStr;
	}
	
	public MessagePayload getPayloadObj() {
		return this.payload;
	
	}

	public void setPayload(MessagePayload payload) {
		this.payload = payload;
	}
}
