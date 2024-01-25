package com.optimization.data.nmf.service.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SlotSwapCounterDTO {

	@JacksonXmlProperty(localName="currentCounter")
	private String currentCounter;
	
	@JacksonXmlProperty(localName="maxLimit")
	private String maxLimit;
	
	public String getCurrentCounter() {
		return currentCounter;
	}

	public void setCurrentCounter(String currentCounter) {
		this.currentCounter = currentCounter;
	}

	public String getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(String maxLimit) {
		this.maxLimit = maxLimit;
	}

	@Override
	public String toString() {
		return "SlotSwapCounterDTO [" + (currentCounter != null ? "currentCounter=" + currentCounter + ", " : "")
				+ (maxLimit != null ? "maxLimit=" + maxLimit : "") + "]";
	}
}
