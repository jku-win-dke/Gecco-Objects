package com.optimization.data.nmf.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(namespace = "http://schemas.xmlsoap.org/soap/envelope/", localName = "EnvelopeDTO")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnvelopeDTO {

	@JacksonXmlProperty(localName = "Body")
	private BodyDTO body;

	public BodyDTO getBody() {
		return body;
	}

	public void setBody(BodyDTO body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "EnvelopeDTO [" + (body != null ? "body=" + body : "") + "]";
	}
}
