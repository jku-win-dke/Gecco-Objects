package com.optimization.data.nmf.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MostPenalisingRegulationCauseDTO {
	@JacksonXmlProperty(localName="reason")
    private String reason;
    
    @JacksonXmlProperty(localName="locationCategory")
    private String locationCategory;
    
    @JacksonXmlProperty(localName="iataDelayCode")
    private String iataDelayCode;

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getLocationCategory() {
		return locationCategory;
	}

	public void setLocationCategory(String locationCategory) {
		this.locationCategory = locationCategory;
	}

	public String getIataDelayCode() {
		return iataDelayCode;
	}

	public void setIataDelayCode(String iataDelayCode) {
		this.iataDelayCode = iataDelayCode;
	}

	@Override
	public String toString() {
		return "MostPenalisingRegulationCauseDTO [" + (reason != null ? "reason=" + reason + ", " : "")
				+ (locationCategory != null ? "locationCategory=" + locationCategory + ", " : "")
				+ (iataDelayCode != null ? "iataDelayCode=" + iataDelayCode : "") + "]";
	}
}
