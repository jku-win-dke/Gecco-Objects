package com.optimization.data.controller.service.dto;

import java.util.ArrayList;
import java.util.List;

public class RejectedSolutionListDTO {
	private String airlineId = null;
	private String regulationId = null;
	private String optimizationId = null;
	private List<RejectedSolutionDTO> rejectedSolutions = null;

	public RejectedSolutionListDTO() {
		
	}

	public List<RejectedSolutionDTO> getRejectedSolutions() {
		return rejectedSolutions;
	}

	public void setRejectedSolutions(List<RejectedSolutionDTO> rejectedSolutions) {
		this.rejectedSolutions = rejectedSolutions;
	}
	
	public void addRejectedSolution(RejectedSolutionDTO rejectedSolution) {
		if (this.rejectedSolutions == null) {
			this.rejectedSolutions = new ArrayList<>();
		}
		this.rejectedSolutions.add(rejectedSolution);
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

	@Override
	public String toString() {
		return "RejectedSolutionListDTO [airlineId=" + airlineId + ", regulationId=" + regulationId + ", optimizationId="
				+ optimizationId + ", rejectedSolutions=" + rejectedSolutions + "]";
	}
}
