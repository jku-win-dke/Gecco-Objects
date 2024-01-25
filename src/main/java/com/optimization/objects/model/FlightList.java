package com.optimization.objects.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FlightList {
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime requestReceptionTime = null;
	
	private String requestId = null;
	private String optimizationSession = null;
	private String regulationId = null;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime currentServerTime = null;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime cutOffTime = null;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime nextOptRun = null;
	
	private List<Slot> slots = null;
	private List<Flight> flights = null;
	
	
	public FlightList() {
		
	}
	
	public FlightList(LocalDateTime requestReceptionTime, String requestId, String optimizationSession,
			String regulationId, LocalDateTime currentServerTime, LocalDateTime cutOffTime, LocalDateTime nextOptRun,
			List<Slot> slots, List<Flight> flights) {
		super();
		this.requestReceptionTime = requestReceptionTime;
		this.requestId = requestId;
		this.optimizationSession = optimizationSession;
		this.regulationId = regulationId;
		this.currentServerTime = currentServerTime;
		this.cutOffTime = cutOffTime;
		this.nextOptRun = nextOptRun;
		this.slots = slots;
		this.flights = flights;
	}

	public LocalDateTime getRequestReceptionTime() {
		return requestReceptionTime;
	}

	public void setRequestReceptionTime(LocalDateTime requestReceptionTime) {
		this.requestReceptionTime = requestReceptionTime;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOptimizationSession() {
		return optimizationSession;
	}

	public void setOptimizationSession(String optimizationSession) {
		this.optimizationSession = optimizationSession;
	}

	public String getRegulationId() {
		return regulationId;
	}

	public void setRegulationId(String regulationId) {
		this.regulationId = regulationId;
	}

	public LocalDateTime getCurrentServerTime() {
		return currentServerTime;
	}

	public void setCurrentServerTime(LocalDateTime currentServerTime) {
		this.currentServerTime = currentServerTime;
	}

	public LocalDateTime getCutOffTime() {
		return cutOffTime;
	}

	public void setCutOffTime(LocalDateTime cutOffTime) {
		this.cutOffTime = cutOffTime;
	}

	public LocalDateTime getNextOptRun() {
		return nextOptRun;
	}

	public void setNextOptRun(LocalDateTime nextOptRun) {
		this.nextOptRun = nextOptRun;
	}

	public List<Slot> getSlots() {
		return slots;
	}

	public void setSlots(List<Slot> slots) {
		this.slots = slots;
	}
	
	public void addSlot(Slot slot) {
		if (this.slots == null) {
			this.slots = new ArrayList<Slot>();
		}
		this.slots.add(slot);
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	public void addFlight(Flight flight) {
		if (this.flights == null) {
			this.flights = new ArrayList<Flight>();
		}
		this.flights.add(flight);
	}

	@Override
	public String toString() {
		return "FlightList [" + (requestId != null ? "requestId=" + requestId + ", " : "")
				+ (optimizationSession != null ? "optimizationSession=" + optimizationSession + ", " : "")
				+ (regulationId != null ? "regulationId=" + regulationId + ", " : "")
				+ (currentServerTime != null ? "currentServerTime=" + currentServerTime + ", " : "")
				+ (cutOffTime != null ? "cutOffTime=" + cutOffTime + ", " : "")
				+ (nextOptRun != null ? "nextOptRun=" + nextOptRun + ", " : "")
				+ (flights != null ? "flights=" + flights : "") + "]";
	}
}
