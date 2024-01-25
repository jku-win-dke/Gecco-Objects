package com.optimization.data.controller.service.dto;

public class ControllerModeDTO {
	private ControllerModeEnum controllerMode = null;

	public ControllerModeDTO() {
		
	}
	
	public ControllerModeDTO(ControllerModeEnum controllerMode) {
		this.controllerMode = controllerMode;
	}

	public ControllerModeEnum getControllerMode() {
		return controllerMode;
	}

	public void setControllerMode(ControllerModeEnum controllerMode) {
		this.controllerMode = controllerMode;
	}

	
}
