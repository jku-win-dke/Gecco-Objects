package com.optimization.data.nmf.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlightIdDTO {

    @JacksonXmlProperty(localName="id")
    private String flightId;
    
    @JacksonXmlProperty(localName="keys")
    private KeysDTO keys;

	public KeysDTO getKeys() {
		return keys;
	}

	public void setKeys(KeysDTO keys) {
		this.keys = keys;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	@Override
	public String toString() {
		return "FlightIdDTO [" + (flightId != null ? "flightId=" + flightId + ", " : "")
				+ (keys != null ? "keys=" + keys : "") + "]";
	}
}
