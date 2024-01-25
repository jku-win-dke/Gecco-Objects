package com.optimization.data.nmf.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class BodyDTO {
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JacksonXmlProperty(localName = "FlightListByAerodromeReply")
	private FlightListByAerodromeReplyDTO flightListByAerodromeReply;

	public FlightListByAerodromeReplyDTO getFlightListByAerodromeReply() {
		return flightListByAerodromeReply;
	}

	public void setFlightListByAerodromeReply(FlightListByAerodromeReplyDTO flightListByAerodromeReply) {
		this.flightListByAerodromeReply = flightListByAerodromeReply;
	}

	@Override
	public String toString() {
		return "BodyDTO ["
				+ (flightListByAerodromeReply != null ? "flightListByAerodromeReply=" + flightListByAerodromeReply : "")
				+ "]";
	}
}
