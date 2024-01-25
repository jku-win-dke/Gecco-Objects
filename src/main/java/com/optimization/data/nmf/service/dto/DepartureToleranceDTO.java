package com.optimization.data.nmf.service.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DepartureToleranceDTO {
	
	@JacksonXmlProperty(localName="toleranceWindow")
	private ToleranceWindowDTO toleranceWindow;
	
	@JacksonXmlProperty(localName="extended")
	private String extended;

	public ToleranceWindowDTO getToleranceWindow() {
		return toleranceWindow;
	}

	public void setToleranceWindow(ToleranceWindowDTO toleranceWindow) {
		this.toleranceWindow = toleranceWindow;
	}

	public String getExtended() {
		return extended;
	}

	public void setExtended(String extended) {
		this.extended = extended;
	}

	@Override
	public String toString() {
		return "DepartureToleranceDTO [" + (toleranceWindow != null ? "toleranceWindow=" + toleranceWindow + ", " : "")
				+ (extended != null ? "extended=" + extended : "") + "]";
	}
}
