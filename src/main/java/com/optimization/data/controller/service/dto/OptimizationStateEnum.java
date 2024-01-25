package com.optimization.data.controller.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape= JsonFormat.Shape.STRING)
public enum OptimizationStateEnum {
	WAIT_FOR_INPUTS, 
	CUT_OFF_TIME_REACHED, 
	OPTIMIZATION_RUNNING, 
	WAITING_FOR_REJECTS, 
	WAITING_FOR_NM_CONFIRMATION,
	FINISHED
}
