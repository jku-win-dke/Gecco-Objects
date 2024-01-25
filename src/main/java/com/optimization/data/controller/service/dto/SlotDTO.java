package com.optimization.data.controller.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class SlotDTO {
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime slotTime = null;

	public SlotDTO() {

	}

	public SlotDTO(LocalDateTime slotTime) {
		super();
		this.slotTime = slotTime;
	}

	public LocalDateTime getSlotTime() {
		return slotTime;
	}

	public void setSlotTime(LocalDateTime slotTime) {
		this.slotTime = slotTime;
	}

	@Override
	public String toString() {
		return "Slot [" + (slotTime != null ? "slotTime=" + slotTime : "") + "]";
	}
}
