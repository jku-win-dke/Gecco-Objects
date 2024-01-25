package com.optimization.objects.model.aus;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PrefFlight {

	private String flightId;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime scheduledTime;
	private Integer priority;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime notBefore;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime notAfter;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime timeWished;

	public PrefFlight() {

	}
	
	public PrefFlight(String flightId, LocalDateTime scheduledTime, Integer priority, LocalDateTime notBefore,
			LocalDateTime notAfter, LocalDateTime timeWished) {
		super();
		this.flightId = flightId;
		this.scheduledTime = scheduledTime;
		this.priority = priority;
		this.notBefore = notBefore;
		this.notAfter = notAfter;
		this.timeWished = timeWished;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public LocalDateTime getScheduledTime() {
		return scheduledTime;
	}

	public void setScheduledTime(LocalDateTime scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public LocalDateTime getNotBefore() {
		return notBefore;
	}

	public void setNotBefore(LocalDateTime notBefore) {
		this.notBefore = notBefore;
	}

	public LocalDateTime getNotAfter() {
		return notAfter;
	}

	public void setNotAfter(LocalDateTime notAfter) {
		this.notAfter = notAfter;
	}

	public LocalDateTime getTimeWished() {
		return timeWished;
	}

	public void setTimeWished(LocalDateTime timeWished) {
		this.timeWished = timeWished;
	}

	@Override
	public String toString() {
		return "PrefFlight [" + (flightId != null ? "flightId=" + flightId + ", " : "")
				+ (scheduledTime != null ? "scheduledTime=" + scheduledTime + ", " : "")
				+ (priority != null ? "priority=" + priority + ", " : "")
				+ (notBefore != null ? "notBefore=" + notBefore + ", " : "")
				+ (notAfter != null ? "notAfter=" + notAfter + ", " : "")
				+ (timeWished != null ? "timeWished=" + timeWished : "") + "]";
	}
}
