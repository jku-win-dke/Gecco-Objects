package com.optimization.data.controller.service.dto;

import java.util.ArrayList;
import java.util.List;

public class WeightMapDTO {
	private String regulationId = null; // optional
	private String optimizationId = null; // optional
	private String airlineId = null; // optional
	private List<WeightMapFlightDTO> flights = null;
	
	public WeightMapDTO() {
		
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

	public List<WeightMapFlightDTO> getFlights() {
		return flights;
	}

	public void setFlights(List<WeightMapFlightDTO> flights) {
		this.flights = flights;
	}
	
	public void addFlight(WeightMapFlightDTO flight) {
		if (this.flights == null) {
			this.flights = new ArrayList<>();
		}
		this.flights.add(flight);
	}

	public String getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(String airlineId) {
		this.airlineId = airlineId;
	}

	@Override
	public String toString() {
		return "WeightMapDTO [" + (regulationId != null ? "regulationId=" + regulationId + ", " : "")
				+ (optimizationId != null ? "optimizationId=" + optimizationId + ", " : "")
				+ (airlineId != null ? "airlineId=" + airlineId + ", " : "") + (flights != null ? "flights=" + flights : "")
				+ "]";
	}
}
