package com.optimization.objects.model.aus;

import java.util.List;

public class AusPrefFlightList {
	private String requestId = null;
	private String airlineId = null;
	private String optimizationSession = null;
	private List<PrefFlight> flights = null;
	
	public AusPrefFlightList() {
		
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(String airlineId) {
		this.airlineId = airlineId;
	}

	public String getOptimizationSession() {
		return optimizationSession;
	}

	public void setOptimizationSession(String optimizationSession) {
		this.optimizationSession = optimizationSession;
	}

	public List<PrefFlight> getFlights() {
		return flights;
	}

	public void setFlights(List<PrefFlight> flights) {
		this.flights = flights;
	}

	@Override
	public String toString() {
		return "AusPrefFlightList [" + (requestId != null ? "requestId=" + requestId + ", " : "")
				+ (airlineId != null ? "airlineId=" + airlineId + ", " : "")
				+ (optimizationSession != null ? "optimizationSession=" + optimizationSession + ", " : "")
				+ (flights != null ? "flights=" + flights : "") + "]";
	}

}
