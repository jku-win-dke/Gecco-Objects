package com.optimization.data.controller.service.dto;

public class RegulationRegistrationDTO {
    private String airlineId = null;
    private String airportId = null;
    private RegulationTypeEnum regulationType = null;
    private String callbackEndpoint = null;

    public RegulationRegistrationDTO() {

    }

    public RegulationRegistrationDTO(String airlineId,
                                     String airportId,
                                     RegulationTypeEnum regulationType,
                                     String callbackEndpoint) {
        this.airlineId = airlineId;
        this.airportId = airportId;
        this.regulationType = regulationType;
        this.callbackEndpoint = callbackEndpoint;
    }

    public String getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(String airlineId) {
        this.airlineId = airlineId;
    }

    public String getAirportId() {
        return airportId;
    }

    public void setAirportId(String airportId) {
        this.airportId = airportId;
    }

    public RegulationTypeEnum getRegulationType() {
        return regulationType;
    }

    public void setRegulationType(RegulationTypeEnum regulationType) {
        this.regulationType = regulationType;
    }

    public String getCallbackEndpoint() {
        return callbackEndpoint;
    }

    public void setCallbackEndpoint(String callbackEndpoint) {
        this.callbackEndpoint = callbackEndpoint;
    }

	@Override
	public String toString() {
		return "RegulationRegistrationDTO [airlineId=" + airlineId + ", airportId=" + airportId + ", regulationType="
				+ regulationType + ", callbackEndpoint=" + callbackEndpoint + "]";
	}
}
