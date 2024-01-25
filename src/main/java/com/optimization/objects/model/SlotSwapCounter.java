package com.optimization.objects.model;

public class SlotSwapCounter {
	
	private Integer currentCounter = null;
	private Integer maxLimit = null;
	
	public SlotSwapCounter() {
		
	}

	public Integer getCurrentCounter() {
		return currentCounter;
	}

	public void setCurrentCounter(Integer currentCounter) {
		this.currentCounter = currentCounter;
	}

	public Integer getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(Integer maxLimit) {
		this.maxLimit = maxLimit;
	}

	@Override
	public String toString() {
		return "SlotSwapCounter [" + (currentCounter != null ? "currentCounter=" + currentCounter + ", " : "")
				+ (maxLimit != null ? "maxLimit=" + maxLimit : "") + "]";
	}

}
