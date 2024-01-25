package com.optimization.data.nmf.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlightsDTO {

	@JacksonXmlProperty(localName = "flight")
    private FlightDTO flight;

	public FlightDTO getFlight() {
		return flight;
	}

	public void setFlight(FlightDTO flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "FlightsDTO [" + (flight != null ? "flight=" + flight : "") + "]";
	}
}
