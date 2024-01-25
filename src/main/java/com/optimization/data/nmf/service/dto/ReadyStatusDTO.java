package com.optimization.data.nmf.service.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ReadyStatusDTO {

	@JacksonXmlProperty(localName="readyForImprovement")
	private Boolean readyForImprovement;
	
	@JacksonXmlProperty(localName="readyToDepart")
	private Boolean readyToDepart;
	
	public Boolean getReadyForImprovement() {
		return readyForImprovement;
	}
	
	public void setReadyForImprovement(Boolean readyForImprovement) {
		this.readyForImprovement = readyForImprovement;
	}
	
	public Boolean getReadyToDepart() {
		return readyToDepart;
	}
	
	public void setReadyToDepart(Boolean readyToDepart) {
		this.readyToDepart = readyToDepart;
	}
	
	@Override
	public String toString() {
		return "ReadyStatusDTO ["
				+ (readyForImprovement != null ? "readyForImprovement=" + readyForImprovement + ", " : "")
				+ (readyToDepart != null ? "readyToDepart=" + readyToDepart : "") + "]";
	}
}
