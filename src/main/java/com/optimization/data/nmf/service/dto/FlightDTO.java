package com.optimization.data.nmf.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

// used for EnvelopeDTO
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlightDTO {
	
    @JacksonXmlProperty(localName="flightId")
    private FlightIdDTO flightId;
    
    @JacksonXmlProperty(localName="aircraftType")
    private String aircraftType;
    
    @JacksonXmlProperty(localName="estimatedTakeOffTime")
    private LocalDateTimeToMinOrSecDTO estimatedTakeOffTime;
    
    @JacksonXmlProperty(localName="actualTakeOffTime")
    private LocalDateTimeToMinOrSecDTO actualTakeOffTime;
    
    @JacksonXmlProperty(localName="taxiTime")
    private String taxiTime;
    
    @JacksonXmlProperty(localName="currentlyUsedTaxiTime")
    private String currentlyUsedTaxiTime;
    
    @JacksonXmlProperty(localName="estimatedTimeOfArrival")
    private LocalDateTimeToMinOrSecDTO estimatedTimeOfArrival;
    
    @JacksonXmlProperty(localName="actualTimeOfArrival")
    private LocalDateTimeToMinOrSecDTO actualTimeOfArrival;
    
    @JacksonXmlProperty(localName="lateFiler")
    private Boolean lateFiler;
    
    @JacksonXmlProperty(localName="lateUpdater")
    private Boolean lateUpdater;
    
    @JacksonXmlProperty(localName="readyStatus")
    private ReadyStatusDTO readyStatus;
    
    @JacksonXmlProperty(localName="aircraftOperator")
    private String aircraftOperator;
    
    @JacksonXmlProperty(localName="operatingAircraftOperator")
    private String operatingAircraftOperator;
    
    @JacksonXmlProperty(localName="exemptedFromRegulations")
    private Boolean exemptedFromRegulations;
    
    @JacksonXmlProperty(localName="estimatedElapsedTime")
    private String estimatedElapsedTime;
    
    @JacksonXmlProperty(localName="icaoRoute")
    private String icaoRoute;
    
    @JacksonXmlProperty(localName="departureTolerance")
    private DepartureToleranceDTO departureTolerance;
    
    @JacksonXmlProperty(localName="filedRegistrationMark")
    private String filedRegistrationMark;
    
    @JacksonXmlProperty(localName="isProposalFlight")
    private Boolean isProposalFlight;
    
    @JacksonXmlProperty(localName="hasBeenForced")
    private Boolean hasBeenForced;
    
    @JacksonXmlProperty(localName="ctotLimitReason")
    private String ctotLimitReason;
    
    @JacksonXmlProperty(localName="slotSwapCounter")
    private SlotSwapCounterDTO slotSwapCounter;
    
    @JacksonXmlProperty(localName="aircraftAddress")
    private String aircraftAddress;
    
    @JacksonXmlProperty(localName="calculatedTakeOffTime")
    private LocalDateTimeToMinOrSecDTO calculatedTakeOffTime;
    
    @JacksonXmlProperty(localName="calculatedTimeOfArrival")
    private LocalDateTimeToMinOrSecDTO calculatedTimeOfArrival;
    
    @JacksonXmlProperty(localName="slotIssued")
    private Boolean slotIssued;
    
    @JacksonXmlProperty(localName="delay")
    private String delay;
    
    @JacksonXmlProperty(localName="mostPenalisingRegulation")
    private String mostPenalisingRegulation;
    
    @JacksonXmlProperty(localName="hasOtherRegulations")
    private Boolean hasOtherRegulations;
    
    @JacksonXmlProperty(localName="regulationLocations")
    private RegulationLocationsDTO regulationLocations;

    @JacksonXmlProperty(localName="mostPenalisingRegulationCause")
    private MostPenalisingRegulationCauseDTO mostPenalisingRegulationCause;
    
    @JacksonXmlProperty(localName="delayCharacteristics")
    private String delayCharacteristics;
    
    @JacksonXmlProperty(localName="cdmEstimatedOffBlockTime")
    private LocalDateTimeToMinOrSecDTO cdmEstimatedOffBlockTime;
    
    @JacksonXmlProperty(localName="scheduledOffBlockTime")
    private LocalDateTimeToMinOrSecDTO scheduledOffBlockTime;
    
	public FlightIdDTO getFlightId() {
		return flightId;
	}

	public void setFlightId(FlightIdDTO flightId) {
		this.flightId = flightId;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public LocalDateTimeToMinOrSecDTO getEstimatedTakeOffTime() {
		return estimatedTakeOffTime;
	}

	public void setEstimatedTakeOffTime(LocalDateTimeToMinOrSecDTO estimatedTakeOffTime) {
		this.estimatedTakeOffTime = estimatedTakeOffTime;
	}

	public LocalDateTimeToMinOrSecDTO getActualTakeOffTime() {
		return actualTakeOffTime;
	}

	public void setActualTakeOffTime(LocalDateTimeToMinOrSecDTO actualTakeOffTime) {
		this.actualTakeOffTime = actualTakeOffTime;
	}

	public String getTaxiTime() {
		return taxiTime;
	}

	public void setTaxiTime(String taxiTime) {
		this.taxiTime = taxiTime;
	}

	public String getCurrentlyUsedTaxiTime() {
		return currentlyUsedTaxiTime;
	}

	public void setCurrentlyUsedTaxiTime(String currentlyUsedTaxiTime) {
		this.currentlyUsedTaxiTime = currentlyUsedTaxiTime;
	}

	public LocalDateTimeToMinOrSecDTO getEstimatedTimeOfArrival() {
		return estimatedTimeOfArrival;
	}

	public void setEstimatedTimeOfArrival(LocalDateTimeToMinOrSecDTO estimatedTimeOfArrival) {
		this.estimatedTimeOfArrival = estimatedTimeOfArrival;
	}

	public LocalDateTimeToMinOrSecDTO getActualTimeOfArrival() {
		return actualTimeOfArrival;
	}

	public void setActualTimeOfArrival(LocalDateTimeToMinOrSecDTO actualTimeOfArrival) {
		this.actualTimeOfArrival = actualTimeOfArrival;
	}

	public Boolean getLateFiler() {
		return lateFiler;
	}

	public void setLateFiler(Boolean lateFiler) {
		this.lateFiler = lateFiler;
	}

	public Boolean getLateUpdater() {
		return lateUpdater;
	}

	public void setLateUpdater(Boolean lateUpdater) {
		this.lateUpdater = lateUpdater;
	}
	
	public ReadyStatusDTO getReadyStatus() {
		return readyStatus;
	}

	public void setReadyStatus(ReadyStatusDTO readyStatus) {
		this.readyStatus = readyStatus;
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

	public Boolean getExemptedFromRegulations() {
		return exemptedFromRegulations;
	}

	public void setExemptedFromRegulations(Boolean exemptedFromRegulations) {
		this.exemptedFromRegulations = exemptedFromRegulations;
	}

	public String getEstimatedElapsedTime() {
		return estimatedElapsedTime;
	}

	public void setEstimatedElapsedTime(String estimatedElapsedTime) {
		this.estimatedElapsedTime = estimatedElapsedTime;
	}

	public String getIcaoRoute() {
		return icaoRoute;
	}

	public void setIcaoRoute(String icaoRoute) {
		this.icaoRoute = icaoRoute;
	}

	public DepartureToleranceDTO getDepartureTolerance() {
		return departureTolerance;
	}

	public void setDepartureTolerance(DepartureToleranceDTO departureTolerance) {
		this.departureTolerance = departureTolerance;
	}

	public String getFiledRegistrationMark() {
		return filedRegistrationMark;
	}

	public void setFiledRegistrationMark(String filedRegistrationMark) {
		this.filedRegistrationMark = filedRegistrationMark;
	}

	public Boolean getIsProposalFlight() {
		return isProposalFlight;
	}

	public void setIsProposalFlight(Boolean isProposalFlight) {
		this.isProposalFlight = isProposalFlight;
	}

	public Boolean getHasBeenForced() {
		return hasBeenForced;
	}

	public void setHasBeenForced(Boolean hasBeenForced) {
		this.hasBeenForced = hasBeenForced;
	}

	public String getCtotLimitReason() {
		return ctotLimitReason;
	}

	public void setCtotLimitReason(String ctotLimitReason) {
		this.ctotLimitReason = ctotLimitReason;
	}

	public SlotSwapCounterDTO getSlotSwapCounter() {
		return slotSwapCounter;
	}

	public void setSlotSwapCounter(SlotSwapCounterDTO slotSwapCounter) {
		this.slotSwapCounter = slotSwapCounter;
	}

	public String getAircraftAddress() {
		return aircraftAddress;
	}

	public void setAircraftAddress(String aircraftAddress) {
		this.aircraftAddress = aircraftAddress;
	}

	public LocalDateTimeToMinOrSecDTO getCalculatedTakeOffTime() {
		return calculatedTakeOffTime;
	}

	public void setCalculatedTakeOffTime(LocalDateTimeToMinOrSecDTO calculatedTakeOffTime) {
		this.calculatedTakeOffTime = calculatedTakeOffTime;
	}

	public LocalDateTimeToMinOrSecDTO getCalculatedTimeOfArrival() {
		return calculatedTimeOfArrival;
	}

	public void setCalculatedTimeOfArrival(LocalDateTimeToMinOrSecDTO calculatedTimeOfArrival) {
		this.calculatedTimeOfArrival = calculatedTimeOfArrival;
	}

	public Boolean getSlotIssued() {
		return slotIssued;
	}

	public void setSlotIssued(Boolean slotIssued) {
		this.slotIssued = slotIssued;
	}

	public String getDelay() {
		return delay;
	}

	public void setDelay(String delay) {
		this.delay = delay;
	}
	
	public String getMostPenalisingRegulation() {
		return mostPenalisingRegulation;
	}

	public void setMostPenalisingRegulation(String mostPenalisingRegulation) {
		this.mostPenalisingRegulation = mostPenalisingRegulation;
	}

	public Boolean getHasOtherRegulations() {
		return hasOtherRegulations;
	}

	public void setHasOtherRegulations(Boolean hasOtherRegulations) {
		this.hasOtherRegulations = hasOtherRegulations;
	}

	public RegulationLocationsDTO getRegulationLocations() {
		return regulationLocations;
	}

	public void setRegulationLocations(RegulationLocationsDTO regulationLocations) {
		this.regulationLocations = regulationLocations;
	}

	public MostPenalisingRegulationCauseDTO getMostPenalisingRegulationCause() {
		return mostPenalisingRegulationCause;
	}

	public void setMostPenalisingRegulationCause(MostPenalisingRegulationCauseDTO mostPenalisingRegulationCause) {
		this.mostPenalisingRegulationCause = mostPenalisingRegulationCause;
	}

	public String getDelayCharacteristics() {
		return delayCharacteristics;
	}

	public void setDelayCharacteristics(String delayCharacteristics) {
		this.delayCharacteristics = delayCharacteristics;
	}

	public LocalDateTimeToMinOrSecDTO getCdmEstimatedOffBlockTime() {
		return cdmEstimatedOffBlockTime;
	}

	public void setCdmEstimatedOffBlockTime(LocalDateTimeToMinOrSecDTO cdmEstimatedOffBlockTime) {
		this.cdmEstimatedOffBlockTime = cdmEstimatedOffBlockTime;
	}

	public LocalDateTimeToMinOrSecDTO getScheduledOffBlockTime() {
		return scheduledOffBlockTime;
	}

	public void setScheduledOffBlockTime(LocalDateTimeToMinOrSecDTO scheduledOffBlockTime) {
		this.scheduledOffBlockTime = scheduledOffBlockTime;
	}

	@Override
	public String toString() {
		return "FlightDTO [" + (flightId != null ? "flightId=" + flightId + ", " : "")
				+ (aircraftType != null ? "aircraftType=" + aircraftType + ", " : "")
				+ (estimatedTakeOffTime != null ? "estimatedTakeOffTime=" + estimatedTakeOffTime + ", " : "")
				+ (actualTakeOffTime != null ? "actualTakeOffTime=" + actualTakeOffTime + ", " : "")
				+ (taxiTime != null ? "taxiTime=" + taxiTime + ", " : "")
				+ (currentlyUsedTaxiTime != null ? "currentlyUsedTaxiTime=" + currentlyUsedTaxiTime + ", " : "")
				+ (estimatedTimeOfArrival != null ? "estimatedTimeOfArrival=" + estimatedTimeOfArrival + ", " : "")
				+ (actualTimeOfArrival != null ? "actualTimeOfArrival=" + actualTimeOfArrival + ", " : "")
				+ (lateFiler != null ? "lateFiler=" + lateFiler + ", " : "")
				+ (lateUpdater != null ? "lateUpdater=" + lateUpdater + ", " : "")
				+ (readyStatus != null ? "readyStatus=" + readyStatus + ", " : "")
				+ (aircraftOperator != null ? "aircraftOperator=" + aircraftOperator + ", " : "")
				+ (operatingAircraftOperator != null ? "operatingAircraftOperator=" + operatingAircraftOperator + ", "
						: "")
				+ (exemptedFromRegulations != null ? "exemptedFromRegulations=" + exemptedFromRegulations + ", " : "")
				+ (estimatedElapsedTime != null ? "estimatedElapsedTime=" + estimatedElapsedTime + ", " : "")
				+ (icaoRoute != null ? "icaoRoute=" + icaoRoute + ", " : "")
				+ (departureTolerance != null ? "departureTolerance=" + departureTolerance + ", " : "")
				+ (filedRegistrationMark != null ? "filedRegistrationMark=" + filedRegistrationMark + ", " : "")
				+ (isProposalFlight != null ? "isProposalFlight=" + isProposalFlight + ", " : "")
				+ (hasBeenForced != null ? "hasBeenForced=" + hasBeenForced + ", " : "")
				+ (ctotLimitReason != null ? "ctotLimitReason=" + ctotLimitReason + ", " : "")
				+ (slotSwapCounter != null ? "slotSwapCounter=" + slotSwapCounter + ", " : "")
				+ (aircraftAddress != null ? "aircraftAddress=" + aircraftAddress + ", " : "")
				+ (calculatedTakeOffTime != null ? "calculatedTakeOffTime=" + calculatedTakeOffTime + ", " : "")
				+ (calculatedTimeOfArrival != null ? "calculatedTimeOfArrival=" + calculatedTimeOfArrival + ", " : "")
				+ (slotIssued != null ? "slotIssued=" + slotIssued + ", " : "")
				+ (delay != null ? "delay=" + delay + ", " : "")
				+ (mostPenalisingRegulation != null ? "mostPenalisingRegulation=" + mostPenalisingRegulation + ", "
						: "")
				+ (hasOtherRegulations != null ? "hasOtherRegulations=" + hasOtherRegulations + ", " : "")
				+ (regulationLocations != null ? "regulationLocations=" + regulationLocations + ", " : "")
				+ (mostPenalisingRegulationCause != null
						? "mostPenalisingRegulationCause=" + mostPenalisingRegulationCause + ", "
						: "")
				+ (delayCharacteristics != null ? "delayCharacteristics=" + delayCharacteristics + ", " : "")
				+ (cdmEstimatedOffBlockTime != null ? "cdmEstimatedOffBlockTime=" + cdmEstimatedOffBlockTime + ", "
						: "")
				+ (scheduledOffBlockTime != null ? "scheduledOffBlockTime=" + scheduledOffBlockTime : "") + "]";
	}
}
