package com.optimization.data.nmf.service.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ReferenceLocationDTO {
	@JacksonXmlProperty(localName="type")
    private String type;
    
    @JacksonXmlProperty(localName="id")
    private String id;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ReferenceLocationDTO [" + (type != null ? "type=" + type + ", " : "") + (id != null ? "id=" + id : "")
				+ "]";
	}
}
