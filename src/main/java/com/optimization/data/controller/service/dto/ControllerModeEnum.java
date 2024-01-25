package com.optimization.data.controller.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape= JsonFormat.Shape.STRING)
public enum ControllerModeEnum {
	CLEAR,
	SECRET
}
