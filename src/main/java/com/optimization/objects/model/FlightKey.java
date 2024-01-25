package com.optimization.objects.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FlightKey {

	private String aircraftId = null;
	private String aerodromeOfDeparture = null;
	private boolean nonICAOAerodromeOfDeparture = false;
	private boolean airFiled = false;
	private String aerodromeOfDestination = null;
	private boolean nonICAOAerodromeOfDestination = false;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime estimatedOffBlockTime = null;
	
	public FlightKey() {
		
	}
	
	public FlightKey(String aircraftId, String aerodromeOfDeparture, boolean nonICAOAerodromeOfDeparture,
			boolean airFiled, String aerodromeOfDestination, boolean nonICAOAerodromeOfDestination,
			LocalDateTime estimatedOffBlockTime) {
		super();
		this.aircraftId = aircraftId;
		this.aerodromeOfDeparture = aerodromeOfDeparture;
		this.nonICAOAerodromeOfDeparture = nonICAOAerodromeOfDeparture;
		this.airFiled = airFiled;
		this.aerodromeOfDestination = aerodromeOfDestination;
		this.nonICAOAerodromeOfDestination = nonICAOAerodromeOfDestination;
		this.estimatedOffBlockTime = estimatedOffBlockTime;
	}

	public String getAircraftId() {
		return aircraftId;
	}

	public void setAircraftId(String aircraftId) {
		this.aircraftId = aircraftId;
	}

	public String getAerodromeOfDeparture() {
		return aerodromeOfDeparture;
	}

	public void setAerodromeOfDeparture(String aerodromeOfDeparture) {
		this.aerodromeOfDeparture = aerodromeOfDeparture;
	}

	public boolean isNonICAOAerodromeOfDeparture() {
		return nonICAOAerodromeOfDeparture;
	}

	public void setNonICAOAerodromeOfDeparture(boolean nonICAOAerodromeOfDeparture) {
		this.nonICAOAerodromeOfDeparture = nonICAOAerodromeOfDeparture;
	}

	public boolean isAirFiled() {
		return airFiled;
	}

	public void setAirFiled(boolean airFiled) {
		this.airFiled = airFiled;
	}

	public String getAerodromeOfDestination() {
		return aerodromeOfDestination;
	}

	public void setAerodromeOfDestination(String aerodromeOfDestination) {
		this.aerodromeOfDestination = aerodromeOfDestination;
	}

	public boolean isNonICAOAerodromeOfDestination() {
		return nonICAOAerodromeOfDestination;
	}

	public void setNonICAOAerodromeOfDestination(boolean nonICAOAerodromeOfDestination) {
		this.nonICAOAerodromeOfDestination = nonICAOAerodromeOfDestination;
	}

	public LocalDateTime getEstimatedOffBlockTime() {
		return estimatedOffBlockTime;
	}

	public void setEstimatedOffBlockTime(LocalDateTime estimatedOffBlockTime) {
		this.estimatedOffBlockTime = estimatedOffBlockTime;
	}

	@Override
	public String toString() {
		return "FlightKey [" + (aircraftId != null ? "aircraftId=" + aircraftId + ", " : "")
				+ (aerodromeOfDeparture != null ? "aerodromeOfDeparture=" + aerodromeOfDeparture + ", " : "")
				+ "nonICAOAerodromeOfDeparture=" + nonICAOAerodromeOfDeparture + ", airFiled=" + airFiled + ", "
				+ (aerodromeOfDestination != null ? "aerodromeOfDestination=" + aerodromeOfDestination + ", " : "")
				+ "nonICAOAerodromeOfDestination=" + nonICAOAerodromeOfDestination + ", "
				+ (estimatedOffBlockTime != null ? "estimatedOffBlockTime=" + estimatedOffBlockTime : "") + "]";
	}

}
