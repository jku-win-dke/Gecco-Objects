package com.optimization.data.nmf.service.dto;

public class AcceptedFlightListDTO {
	private String optimizationId;
	private String solutionId;
	
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
}
