package com.optimization.data.controller.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class FlightDTO {
	private String flightId = null;

	private FlightKeyDTO keys = null;
	private String aircraftType = null;

	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime calculatedTakeOffTime = null;

	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime estimatedTakeOffTime = null;
	
	private Integer estimatedElapsedTime = null;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime scheduledOffBlockTime = null;

	private String aircraftOperator = null;
	private String operatingAircraftOperator = null;

	private Boolean slotIssued = false;

	private Integer delay = null;
	private String mostPenalisingRegulation = null;
	private String filedRegistrationMark = null;

	private SlotSwapCounterDTO slotSwapCounter = null;

	public FlightDTO() {

	}

	public FlightDTO(String flightId, FlightKeyDTO keys, String aircraftType, LocalDateTime calculatedTakeOffTime,
					 LocalDateTime estimatedTakeOffTime, Integer estimatedElapsedTime, LocalDateTime scheduledOffBlockTime,
					 String aircraftOperator, String operatingAircraftOperator,
					 Boolean slotIssued, Integer delay, String mostPenalisingRegulation, String filedRegistrationMark,
					 SlotSwapCounterDTO slotSwapCounter) {
		super();
		this.flightId = flightId;
		this.keys = keys;
		this.aircraftType = aircraftType;
		this.calculatedTakeOffTime = calculatedTakeOffTime;
		this.estimatedTakeOffTime = estimatedTakeOffTime;
		this.estimatedElapsedTime = estimatedElapsedTime;
		this.scheduledOffBlockTime = scheduledOffBlockTime;
		this.aircraftOperator = aircraftOperator;
		this.operatingAircraftOperator = operatingAircraftOperator;
		this.slotIssued = slotIssued;
		this.delay = delay;
		this.mostPenalisingRegulation = mostPenalisingRegulation;
		this.filedRegistrationMark = filedRegistrationMark;
		this.slotSwapCounter = slotSwapCounter;
	}



	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public FlightKeyDTO getKeys() {
		return keys;
	}

	public void setKeys(FlightKeyDTO keys) {
		this.keys = keys;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public LocalDateTime getCalculatedTakeOffTime() {
		return calculatedTakeOffTime;
	}

	public void setCalculatedTakeOffTime(LocalDateTime calculatedTakeOffTime) {
		this.calculatedTakeOffTime = calculatedTakeOffTime;
	}

	public LocalDateTime getEstimatedTakeOffTime() {
		return estimatedTakeOffTime;
	}

	public void setEstimatedTakeOffTime(LocalDateTime estimatedTakeOffTime) {
		this.estimatedTakeOffTime = estimatedTakeOffTime;
	}
	
	public Integer getEstimatedElapsedTime() {
		return estimatedElapsedTime;
	}

	public void setEstimatedElapsedTime(Integer estimatedElapsedTime) {
		this.estimatedElapsedTime = estimatedElapsedTime;
	}

	public LocalDateTime getScheduledOffBlockTime() {
		return scheduledOffBlockTime;
	}

	public void setScheduledOffBlockTime(LocalDateTime scheduledOffBlockTime) {
		this.scheduledOffBlockTime = scheduledOffBlockTime;
	}

	public String getAircraftOperator() {
		return aircraftOperator;
	}

	public void setAircraftOperator(String aircraftOperator) {
		this.aircraftOperator = aircraftOperator;
	}

	public String getOperatingAircraftOperator() {
		return operatingAircraftOperator;
	}

	public void setOperatingAircraftOperator(String operatingAircraftOperator) {
		this.operatingAircraftOperator = operatingAircraftOperator;
	}

	public Boolean getSlotIssued() {
		return slotIssued;
	}

	public void setSlotIssued(Boolean slotIssued) {
		this.slotIssued = slotIssued;
	}

	public Integer getDelay() {
		return delay;
	}

	public void setDelay(Integer delay) {
		this.delay = delay;
	}

	public String getMostPenalisingRegulation() {
		return mostPenalisingRegulation;
	}

	public void setMostPenalisingRegulation(String mostPenalisingRegulation) {
		this.mostPenalisingRegulation = mostPenalisingRegulation;
	}

	public String getFiledRegistrationMark() {
		return filedRegistrationMark;
	}

	public void setFiledRegistrationMark(String filedRegistrationMark) {
		this.filedRegistrationMark = filedRegistrationMark;
	}

	public SlotSwapCounterDTO getSlotSwapCounter() {
		return slotSwapCounter;
	}

	public void setSlotSwapCounter(SlotSwapCounterDTO slotSwapCounter) {
		this.slotSwapCounter = slotSwapCounter;
	}

	@Override
	public String toString() {
		return "Flight [" + (flightId != null ? "flightId=" + flightId + ", " : "")
				+ (keys != null ? "keys=" + keys + ", " : "")
				+ (aircraftType != null ? "aircraftType=" + aircraftType + ", " : "")
				+ (calculatedTakeOffTime != null ? "calculatedTakeOffTime=" + calculatedTakeOffTime + ", " : "")
				+ (estimatedTakeOffTime != null ? "estimatedTakeOffTime=" + estimatedTakeOffTime + ", " : "")
				+ (aircraftOperator != null ? "aircraftOperator=" + aircraftOperator + ", " : "")
				+ (operatingAircraftOperator != null ? "operatingAircraftOperator=" + operatingAircraftOperator + ", "
						: "")
				+ (slotIssued != null ? "slotIssued=" + slotIssued + ", " : "")
				+ (delay != null ? "delay=" + delay + ", " : "")
				+ (mostPenalisingRegulation != null ? "mostPenalisingRegulation=" + mostPenalisingRegulation + ", "
						: "")
				+ (filedRegistrationMark != null ? "filedRegistrationMark=" + filedRegistrationMark + ", " : "")
				+ (slotSwapCounter != null ? "slotSwapCounter=" + slotSwapCounter : "") + "]";
	}

}
