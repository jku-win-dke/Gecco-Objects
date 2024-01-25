package com.optimization.data.controller.service.dto;

public class OptimizationStateDTO {
	private OptimizationStateEnum optimizationState = null;

	public OptimizationStateDTO() {
		
	}
	
	public OptimizationStateDTO(OptimizationStateEnum optimizationState) {
		this.optimizationState = optimizationState;
	}

	public OptimizationStateEnum getOptimizationState() {
		return optimizationState;
	}

	public void setOptimizationState(OptimizationStateEnum optimizationState) {
		this.optimizationState = optimizationState;
	}
}
