package com.optimization.objects.model.pe;

import java.util.List;

import com.optimization.data.controller.service.dto.WeightMapObjectDTO;

public class EncryptedWeightMapListDTO {
	
	private List<WeightMapObjectDTO> weightMap = null;

	public EncryptedWeightMapListDTO() {
		
	}

	public List<WeightMapObjectDTO> getWeightMap() {
		return weightMap;
	}

	public void setWeightMap(List<WeightMapObjectDTO> weightMap) {
		this.weightMap = weightMap;
	}

	@Override
	public String toString() {
		return "EncryptedWeightMapListDTO [" + (weightMap != null ? "weightMap=" + weightMap : "") + "]";
	}
}
