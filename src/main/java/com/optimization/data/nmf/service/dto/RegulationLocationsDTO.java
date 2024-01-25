package com.optimization.data.nmf.service.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RegulationLocationsDTO {
    @JacksonXmlProperty(localName="regulationId")
    private String regulationId;
    
    @JacksonXmlProperty(localName="referenceLocation-ReferenceLocationAirspace")
    private ReferenceLocationDTO referenceLocationReferenceLocationAirspace;
    
    @JacksonXmlProperty(localName="toConfirm")
    private Boolean toConfirm;
    
    @JacksonXmlProperty(localName="referenceLocation-ReferenceLocationAerodrome")
    private ReferenceLocationDTO referenceLocationReferenceLocationAerodrome;
    
    @JacksonXmlProperty(localName="referenceLocation-ReferenceLocationAerodromeSet")
    private ReferenceLocationDTO referenceLocationReferenceLocationAerodromeSet;

	public String getRegulationId() {
		return regulationId;
	}

	public void setRegulationId(String regulationId) {
		this.regulationId = regulationId;
	}

	public ReferenceLocationDTO getReferenceLocationReferenceLocationAirspace() {
		return referenceLocationReferenceLocationAirspace;
	}

	public void setReferenceLocationReferenceLocationAirspace(
			ReferenceLocationDTO referenceLocationReferenceLocationAirspace) {
		this.referenceLocationReferenceLocationAirspace = referenceLocationReferenceLocationAirspace;
	}

	public Boolean getToConfirm() {
		return toConfirm;
	}

	public void setToConfirm(Boolean toConfirm) {
		this.toConfirm = toConfirm;
	}

	public ReferenceLocationDTO getReferenceLocationReferenceLocationAerodrome() {
		return referenceLocationReferenceLocationAerodrome;
	}

	public void setReferenceLocationReferenceLocationAerodrome(
			ReferenceLocationDTO referenceLocationReferenceLocationAerodrome) {
		this.referenceLocationReferenceLocationAerodrome = referenceLocationReferenceLocationAerodrome;
	}

	public ReferenceLocationDTO getReferenceLocationReferenceLocationAerodromeSet() {
		return referenceLocationReferenceLocationAerodromeSet;
	}

	public void setReferenceLocationReferenceLocationAerodromeSet(
			ReferenceLocationDTO referenceLocationReferenceLocationAerodromeSet) {
		this.referenceLocationReferenceLocationAerodromeSet = referenceLocationReferenceLocationAerodromeSet;
	}

	@Override
	public String toString() {
		return "RegulationLocationsDTO [" + (regulationId != null ? "regulationId=" + regulationId + ", " : "")
				+ (referenceLocationReferenceLocationAirspace != null ? "referenceLocationReferenceLocationAirspace="
						+ referenceLocationReferenceLocationAirspace + ", " : "")
				+ (toConfirm != null ? "toConfirm=" + toConfirm + ", " : "")
				+ (referenceLocationReferenceLocationAerodrome != null
						? "referenceLocationReferenceLocationAerodrome=" + referenceLocationReferenceLocationAerodrome
								+ ", "
						: "")
				+ (referenceLocationReferenceLocationAerodromeSet != null
						? "referenceLocationReferenceLocationAerodromeSet="
								+ referenceLocationReferenceLocationAerodromeSet
						: "")
				+ "]";
	}
}
