package com.optimization.objects.model;

import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Slot {
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime slotTime = null;
	
	public Slot() {
		
	}

	public Slot(LocalDateTime slotTime) {
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
