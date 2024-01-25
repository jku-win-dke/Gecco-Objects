package com.optimization.data.controller.service.dto;

public class RegulationNotificationDTO {
	private String airlineId = null;
	private String airportId = null;
    private String regulationId = null;

    public RegulationNotificationDTO() {

    }

    public RegulationNotificationDTO(String airportId, String regulationId, String airlineId) {
        this.airportId = airportId;
        this.regulationId = regulationId;
        this.airlineId = airlineId;
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

    public String getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(String userId) {
        this.airlineId = userId;
    }

    @Override
    public String toString() {
        return "RegulationNotificationDTO{" +
                "airportId='" + airportId + '\'' +
                ", regulationId='" + regulationId + '\'' +
                ", airlineId='" + airlineId + '\'' +
                '}';
    }
}
