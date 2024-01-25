package com.optimization.data.controller.service.dto;

import java.util.ArrayList;
import java.util.List;

public class SolutionDTO {
    private String regulationId = null; // Optional
    private String optimizationId = null; // Optional
    private String solutionId = null;
    private Integer priority = null;
	private Double fitness = null; // Optional
	private Integer creditChange = 0; // Optional, only for the airspace user which requested the solution

	private List<SolutionFlightDTO> flights = null;
    
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
	
	public Integer getPriority() {
		return priority;
	}
	
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Double getFitness() {
		return fitness;
	}

	public void setFitness(Double fitness) {
		this.fitness = fitness;
	}
	public List<SolutionFlightDTO> getFlights() {
		return flights;
	}
	
	public void setFlights(List<SolutionFlightDTO> flights) {
		this.flights = flights;
	}

	public Integer getCreditChange() {
		return creditChange;
	}

	public void setCreditChange(Integer creditChange) {
		this.creditChange = creditChange;
	}

	public void addFlight(SolutionFlightDTO flight) {
		if (this.flights == null) {
			this.flights = new ArrayList<SolutionFlightDTO>();
		}
		this.flights.add(flight);
	}
	
	@Override
	public String toString() {
		return "SolutionDTO [solutionId="
				+ solutionId + ", priority=" + priority + ", flights=" + flights + "]";
	}
}
