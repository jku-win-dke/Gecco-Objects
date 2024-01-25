package com.optimization.data.nmf.service.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class EffectiveTrafficWindowDTO {
	@JacksonXmlProperty(localName="wef")
	private String wef;
	
	@JacksonXmlProperty(localName="unt")
	private String unt;

	public String getWef() {
		return wef;
	}

	public void setWef(String wef) {
		this.wef = wef;
	}

	public String getUnt() {
		return unt;
	}

	public void setUnt(String unt) {
		this.unt = unt;
	}

	@Override
	public String toString() {
		return "EffectiveTrafficWindowDTO [" + (wef != null ? "wef=" + wef + ", " : "")
				+ (unt != null ? "unt=" + unt : "") + "]";
	}
}
