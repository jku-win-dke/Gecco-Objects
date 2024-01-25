package com.optimization.objects.model;

import java.time.LocalDateTime;

public class OptimizationState {
	
	private String regulationId;
	private LocalDateTime currentServerTime;
	private LocalDateTime nextOptimizationRun;
	private OptimizatioStateEnum state;
	
	public OptimizationState() {
		
	}

	public String getRegulationId() {
		return regulationId;
	}

	public void setRegulationId(String regulationId) {
		this.regulationId = regulationId;
	}

	public LocalDateTime getCurrentServerTime() {
		return currentServerTime;
	}

	public void setCurrentServerTime(LocalDateTime currentServerTime) {
		this.currentServerTime = currentServerTime;
	}

	public LocalDateTime getNextOptimizationRun() {
		return nextOptimizationRun;
	}

	public void setNextOptimizationRun(LocalDateTime nextOptimizationRun) {
		this.nextOptimizationRun = nextOptimizationRun;
	}

	public OptimizatioStateEnum getState() {
		return state;
	}

	public void setState(OptimizatioStateEnum state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "OptimizationState [" + (regulationId != null ? "regulationId=" + regulationId + ", " : "")
				+ (currentServerTime != null ? "currentServerTime=" + currentServerTime + ", " : "")
				+ (nextOptimizationRun != null ? "nextOptimizationRun=" + nextOptimizationRun + ", " : "")
				+ (state != null ? "state=" + state : "") + "]";
	}
	
}
