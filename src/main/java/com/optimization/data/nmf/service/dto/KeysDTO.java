package com.optimization.data.nmf.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeysDTO {

	@JacksonXmlProperty(localName="aircraftId")
	private String aircraftId;
	
	@JacksonXmlProperty(localName="aerodromeOfDeparture")
	private String aerodromeOfDeparture;
	
	@JacksonXmlProperty(localName="nonICAOAerodromeOfDeparture")
	private Boolean nonICAOAerodromeOfDeparture;
	
	@JacksonXmlProperty(localName="airFiled")
	private Boolean airFiled;
	
	@JacksonXmlProperty(localName="aerodromeOfDestination")
	private String aerodromeOfDestination;
	
	@JacksonXmlProperty(localName="nonICAOAerodromeOfDestination")
	private Boolean nonICAOAerodromeOfDestination;
	
	@JacksonXmlProperty(localName="estimatedOffBlockTime")
	private LocalDateTimeToMinOrSecDTO estimatedOffBlockTime;

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

	public Boolean getNonICAOAerodromeOfDeparture() {
		return nonICAOAerodromeOfDeparture;
	}

	public void setNonICAOAerodromeOfDeparture(Boolean nonICAOAerodromeOfDeparture) {
		this.nonICAOAerodromeOfDeparture = nonICAOAerodromeOfDeparture;
	}

	public Boolean getAirFiled() {
		return airFiled;
	}

	public void setAirFiled(Boolean airFiled) {
		this.airFiled = airFiled;
	}

	public String getAerodromeOfDestination() {
		return aerodromeOfDestination;
	}

	public void setAerodromeOfDestination(String aerodromeOfDestination) {
		this.aerodromeOfDestination = aerodromeOfDestination;
	}

	public Boolean getNonICAOAerodromeOfDestination() {
		return nonICAOAerodromeOfDestination;
	}

	public void setNonICAOAerodromeOfDestination(Boolean nonICAOAerodromeOfDestination) {
		this.nonICAOAerodromeOfDestination = nonICAOAerodromeOfDestination;
	}

	public LocalDateTimeToMinOrSecDTO getEstimatedOffBlockTime() {
		return estimatedOffBlockTime;
	}

	public void setEstimatedOffBlockTime(LocalDateTimeToMinOrSecDTO estimatedOffBlockTime) {
		this.estimatedOffBlockTime = estimatedOffBlockTime;
	}

	@Override
	public String toString() {
		return "KeysDTO [" + (aircraftId != null ? "aircraftId=" + aircraftId + ", " : "")
				+ (aerodromeOfDeparture != null ? "aerodromeOfDeparture=" + aerodromeOfDeparture + ", " : "")
				+ (nonICAOAerodromeOfDeparture != null
						? "nonICAOAerodromeOfDeparture=" + nonICAOAerodromeOfDeparture + ", "
						: "")
				+ (airFiled != null ? "airFiled=" + airFiled + ", " : "")
				+ (aerodromeOfDestination != null ? "aerodromeOfDestination=" + aerodromeOfDestination + ", " : "")
				+ (nonICAOAerodromeOfDestination != null
						? "nonICAOAerodromeOfDestination=" + nonICAOAerodromeOfDestination + ", "
						: "")
				+ (estimatedOffBlockTime != null ? "estimatedOffBlockTime=" + estimatedOffBlockTime : "") + "]";
	}
}
