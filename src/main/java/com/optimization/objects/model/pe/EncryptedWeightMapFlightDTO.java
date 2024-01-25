package com.optimization.objects.model.pe;

import java.util.List;

public class EncryptedWeightMapFlightDTO {
	
	private String flightId = null;
	private List<EncryptedWeightMapListDTO> encodedWeights = null;

	public EncryptedWeightMapFlightDTO() {
		
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public List<EncryptedWeightMapListDTO> getEncodedWeights() {
		return encodedWeights;
	}

	public void setEncodedWeights(List<EncryptedWeightMapListDTO> encodedWeights) {
		this.encodedWeights = encodedWeights;
	}

	@Override
	public String toString() {
		return "EncryptedWeightMapFlightDTO [" + (flightId != null ? "flightId=" + flightId + ", " : "")
				+ (encodedWeights != null ? "encodedWeights=" + encodedWeights : "") + "]";
	}

}
