package com.optimization.data.controller.service.dto;

public class RejectedSolutionDTO {
	private String airlineId = null; // Optional
	private String regulationId = null; // Optional
	private String optimizationId = null; // Optional
	private String solutionId = null;

	public RejectedSolutionDTO() {

	}

	public String getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(String airlineId) {
		this.airlineId = airlineId;
	}

	public String getRegulationId() {
		return regulationId;
	}

	public void setRegulationId(String regulationId) {
		this.regulationId = regulationId;
	}

	public String getOptimizationId() {
		return optimizationId;
	}

	public void setOptimizationId(String optimizationId) {
		this.optimizationId = optimizationId;
	}

	public String getSolutionId() {
		return solutionId;
	}

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

	@Override
	public String toString() {
		return "RejectedSolutionDTO{" +
				"solutionId='" + solutionId + '\'' +
				'}';
	}
}
