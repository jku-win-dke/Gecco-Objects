package com.optimization.data.optimizer.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

/**
 * Representation of the "margins" of a flight. Margins may only be passed if the optimizer runs in
 * non-privacy-preserving mode.
 */
public class MarginsDTO {
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime scheduledTime;

	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime timeNotBefore;

	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime timeWished;

	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime timeNotAfter;
    
    public MarginsDTO() {
    	super();
    }
    
	public MarginsDTO(LocalDateTime scheduledTime,
					  LocalDateTime timeNotBefore,
					  LocalDateTime timeWished,
					  LocalDateTime timeNotAfter) {
		super();
		this.scheduledTime = scheduledTime;
		this.timeNotBefore = timeNotBefore;
		this.timeWished = timeWished;
		this.timeNotAfter = timeNotAfter;
	}

	public LocalDateTime getScheduledTime() {
		return scheduledTime;
	}
	public void setScheduledTime(LocalDateTime scheduledTime) {
		this.scheduledTime = scheduledTime;
	}
	public LocalDateTime getTimeNotBefore() {
		return timeNotBefore;
	}
	public void setTimeNotBefore(LocalDateTime timeNotBefore) {
		this.timeNotBefore = timeNotBefore;
	}
	public LocalDateTime getTimeWished() {
		return timeWished;
	}
	public void setTimeWished(LocalDateTime timeWished) {
		this.timeWished = timeWished;
	}
	public LocalDateTime getTimeNotAfter() {
		return timeNotAfter;
	}
	public void setTimeNotAfter(LocalDateTime timeNotAfter) {
		this.timeNotAfter = timeNotAfter;
	} 
}
