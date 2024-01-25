package com.optimization.data.controller.service.dto;

import java.util.ArrayList;
import java.util.List;

public class WeightMapFlightDTO {
	private String flightId = null;
	private List<WeightMapObjectDTO> weightMap = null;

	public WeightMapFlightDTO() {
		
	}
	
	public WeightMapFlightDTO(String flightId, List<WeightMapObjectDTO> weightMap) {
		super();
		this.flightId = flightId;
		this.weightMap = weightMap;
	}

	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public List<WeightMapObjectDTO> getWeightMap() {
		return weightMap;
	}
	public void setWeightMap(List<WeightMapObjectDTO> weightMap) {
		this.weightMap = weightMap;
	}
	
	public void addWeightMapObject(WeightMapObjectDTO weightMap) {
		if (this.weightMap == null) {
			this.weightMap = new ArrayList<>();
		}
		this.weightMap.add(weightMap);
	}

	@Override
	public String toString() {
		return "WeightMapFlight [" + (flightId != null ? "flightId=" + flightId + ", " : "")
				+ (weightMap != null ? "weightMap=" + weightMap : "") + "]";
	}
}
