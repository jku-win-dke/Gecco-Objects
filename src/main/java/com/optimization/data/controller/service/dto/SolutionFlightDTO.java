package com.optimization.data.controller.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class SolutionFlightDTO {
	private String flightId = null;

	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime slotTime = null;

	public SolutionFlightDTO() {
		
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public LocalDateTime getSlotTime() {
		return slotTime;
	}

	public void setSlotTime(LocalDateTime slotTime) {
		this.slotTime = slotTime;
	}

	@Override
	public String toString() {
		return "SolutionFlight [" + (flightId != null ? "flightId=" + flightId + ", " : "")
				+ (slotTime != null ? "slotTime=" + slotTime : "") + "]";
	}
}
