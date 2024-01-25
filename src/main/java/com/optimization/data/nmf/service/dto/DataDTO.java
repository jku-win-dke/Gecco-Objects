package com.optimization.data.nmf.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataDTO {

	@JsonProperty("flights")
	@JacksonXmlElementWrapper(useWrapping = false)
    private List<FlightsDTO> flights;
	
	@JacksonXmlProperty(localName="effectiveTrafficWindow")
	private EffectiveTrafficWindowDTO effectiveTrafficWindow;

	public List<FlightsDTO> getFlights() {
		return flights;
	}

	public void setFlights(List<FlightsDTO> flights) {
		this.flights = flights;
	}

	public void addFlights(FlightsDTO newFlights) {
		if (this.flights == null) {
			this.flights = new ArrayList<>();
		}
		this.flights.add(newFlights);
	}

	public EffectiveTrafficWindowDTO getEffectiveTrafficWindow() {
		return effectiveTrafficWindow;
	}

	public void setEffectiveTrafficWindow(EffectiveTrafficWindowDTO effectiveTrafficWindow) {
		this.effectiveTrafficWindow = effectiveTrafficWindow;
	}

	@Override
	public String toString() {
		return "DataDTO [" + (flights != null ? "flights=" + flights + ", " : "")
				+ (effectiveTrafficWindow != null ? "effectiveTrafficWindow=" + effectiveTrafficWindow : "") + "]";
	}
}
