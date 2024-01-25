package com.optimization.objects.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.optimization.data.controller.service.dto.OptimizationStateEnum;

public class ControllerState {
	
	@JsonIgnore
	private boolean connectionState;
	private OptimizationStateEnum optimizationState;

	public ControllerState() {
		
	}
	
	public ControllerState(OptimizationStateEnum optimizationState) {
		super();
		this.optimizationState = optimizationState;
	}

	public OptimizationStateEnum getOptimizationState() {
		return optimizationState;
	}

	public void setOptimizationState(OptimizationStateEnum optimizationState) {
		this.optimizationState = optimizationState;
	}

	public boolean getConnectionState() {
		return connectionState;
	}

	public void setConnectionState(boolean connectionState) {
		this.connectionState = connectionState;
	}
}
