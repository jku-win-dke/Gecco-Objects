package com.optimization.objects.model;

import com.optimization.objects.model.aus.AusPrefFlightList;

import com.optimization.data.controller.service.dto.FlightListDTO;

public class FlightListPrefDTO {
	private FlightListDTO flightList;
	private AusPrefFlightList ausPrefList;
	

	public FlightListPrefDTO() {
		
	}
	
	public FlightListPrefDTO(FlightListDTO flightList, AusPrefFlightList ausPrefList) {
		this.flightList = flightList;
		this.ausPrefList = ausPrefList;
	}

	public FlightListDTO getFlightList() {
		return flightList;
	}

	public void setFlightList(FlightListDTO flightList) {
		this.flightList = flightList;
	}

	public AusPrefFlightList getAusPrefList() {
		return ausPrefList;
	}

	public void setAusPrefList(AusPrefFlightList ausPrefList) {
		this.ausPrefList = ausPrefList;
	}
}
