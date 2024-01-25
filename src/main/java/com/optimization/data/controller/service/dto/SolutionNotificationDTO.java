package com.optimization.data.controller.service.dto;

public class SolutionNotificationDTO {
	private String optimizationId = null;
	private String regulationId = null;
	private String airportId = null;
	private String airlineId = null;
	private SolutionStatusEnum solutionStatus = null;
	
	public SolutionNotificationDTO() {
		
	}
	
	public SolutionNotificationDTO(String optimizationId, String regulationId, String airportId, String airlineId,
			SolutionStatusEnum solutionStatus) {
		this.optimizationId = optimizationId;
		this.regulationId = regulationId;
		this.airportId = airportId;
		this.airlineId = airlineId;
		this.solutionStatus = solutionStatus;
	}

	public String getOptimizationId() {
		return optimizationId;
	}
	
	public void setOptimizationId(String optimizationId) {
		this.optimizationId = optimizationId;
	}
	
	public String getRegulationId() {
		return regulationId;
	}
	
	public void setRegulationId(String regulationId) {
		this.regulationId = regulationId;
	}
	
	public String getAirportId() {
		return airportId;
	}
	
	public void setAirportId(String airportId) {
		this.airportId = airportId;
	}
	
	public String getAirlineId() {
		return airlineId;
	}
	
	public void setAirlineId(String airlineId) {
		this.airlineId = airlineId;
	}
	
	public SolutionStatusEnum getSolutionStatus() {
		return solutionStatus;
	}
	
	public void setSolutionStatus(SolutionStatusEnum solutionStatus) {
		this.solutionStatus = solutionStatus;
	}
	
	@Override
	public String toString() {
		return "SolutionNotificationDTO [" + (optimizationId != null ? "optimizationId=" + optimizationId + ", " : "")
				+ (regulationId != null ? "regulationId=" + regulationId + ", " : "")
				+ (airportId != null ? "airportId=" + airportId + ", " : "")
				+ (airlineId != null ? "airlineId=" + airlineId + ", " : "")
				+ (solutionStatus != null ? "solutionStatus=" + solutionStatus : "") + "]";
	}
}
