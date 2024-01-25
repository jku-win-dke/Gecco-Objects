package com.optimization.data.controller.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class WeightMapObjectDTO {
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime slotTime = null;

	private String weight = null;

	public WeightMapObjectDTO() {
		
	}
	
	public WeightMapObjectDTO(LocalDateTime slotTime, String weight) {
		super();
		this.slotTime = slotTime;
		this.weight = weight;
	}

	public LocalDateTime getSlotTime() {
		return slotTime;
	}
	public void setSlotTime(LocalDateTime slotTime) {
		this.slotTime = slotTime;
	}

	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "WeightMapObject [" + (slotTime != null ? "slotTime=" + slotTime + ", " : "")
				+ (weight != null ? "weight=" + weight : "") + "]";
	}
}
