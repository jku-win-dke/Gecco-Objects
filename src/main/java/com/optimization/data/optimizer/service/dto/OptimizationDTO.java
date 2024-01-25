package com.optimization.data.optimizer.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.lang.Nullable;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

public class OptimizationDTO {
	private UUID optId;
	private FlightDTO[] flights;
	private SlotDTO[] slots;

	private boolean traceFitnessEvolution = false;

	@Nullable
	private String[] initialFlightSequence;

	@Nullable
	private Map<String,Object> parameters;

	private String optimizationFramework;// JENETICS, OPTAPLANNER, HUNGARIAN

	private String optimizationType; // MULTI_OBJECTIVE, SINGLE_OBJECTIVE

	@Nullable
	private String fitnessEstimator;

	private OptimizationModeEnum optimizationMode; // -- PRIVACY_PRESERVING; NON_PRIVACY_PRESERVING

	@Nullable
	private OptimizationStatusEnum optimizationStatus; // -- CREATED, INITIALIZED, RUNNING, DONE

	@Nullable
	private String privacyEngineEndpoint;

	@Nullable
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime timestamp;


	@Nullable
	private FitnessMethodEnum fitnessMethod;

	@Nullable
	private Integer fitnessPrecision;


	public UUID getOptId() {
		return optId;
	}

	public void setOptId(UUID optId) {
		this.optId = optId;
	}

	public String[] getInitialFlightSequence() {
		return initialFlightSequence;
	}

	public void setInitialFlightSequence(String[] initialFlightSequence) {
		this.initialFlightSequence = initialFlightSequence;
	}

	public FlightDTO[] getFlights() {
		return flights;
	}

	public void setFlights(FlightDTO[] flights) {
		this.flights = flights;
	}

	public SlotDTO[] getSlots() {
		return slots;
	}

	public void setSlots(SlotDTO[] slots) {
		this.slots = slots;
	}

	public String getOptimizationFramework() {
		return optimizationFramework;
	}

	public void setOptimizationFramework(String optimizationFramework) {
		this.optimizationFramework = optimizationFramework;
	}

	public OptimizationModeEnum getOptimizationMode() {
		return optimizationMode;
	}

	public void setOptimizationMode(OptimizationModeEnum optimizationMode) {
		this.optimizationMode = optimizationMode;
	}

	public String getOptimizationType() {
		return optimizationType;
	}

	public void setOptimizationType(String optimizationType) {
		this.optimizationType = optimizationType;
	}

	public OptimizationStatusEnum getOptimizationStatus() {
		return optimizationStatus;
	}

	public void setOptimizationStatus(OptimizationStatusEnum optimizationStatus) {
		this.optimizationStatus = optimizationStatus;
	}

	@Nullable
	public String getPrivacyEngineEndpoint() {
		return privacyEngineEndpoint;
	}

	public void setPrivacyEngineEndpoint(@Nullable String privacyEngineEndpoint) {
		this.privacyEngineEndpoint = privacyEngineEndpoint;
	}


	public Map<String, Object> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	@Nullable
	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(@Nullable LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getFitnessEstimator() {
		return fitnessEstimator;
	}

	public void setFitnessEstimator(String fitnessEstimator) {
		this.fitnessEstimator = fitnessEstimator;
	}

	public boolean isTraceFitnessEvolution() {
		return traceFitnessEvolution;
	}

	public void setTraceFitnessEvolution(boolean traceFitnessEvolution) {
		this.traceFitnessEvolution = traceFitnessEvolution;
	}

	@Nullable
	public FitnessMethodEnum getFitnessMethod() {
		return fitnessMethod;
	}

	public void setFitnessMethod(@Nullable FitnessMethodEnum fitnessMethod) {
		this.fitnessMethod = fitnessMethod;
	}

	@Nullable
	public Integer getFitnessPrecision() {
		return fitnessPrecision;
	}

	public void setFitnessPrecision(int fitnessPrecision) {
		this.fitnessPrecision = fitnessPrecision;
	}
}
