package com.optimization.data.wm.service.dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClearingInitializationDTO {
    private String[] flightList;

    private List<FlightAirspaceUserMappingDTO> flights;

    private String privacyEngineEndpoint;

    private int[] data;

    public ClearingInitializationDTO(){
        // empty for serialization
    }

    public String[] getFlightList() {
        return flightList;
    }

    public void setFlightList(String[] flightList) {
        this.flightList = flightList;
    }

    public List<FlightAirspaceUserMappingDTO> getFlights() {
        return flights;
    }

    public void setFlights(List<FlightAirspaceUserMappingDTO> flights) {
        this.flights = flights;
    }

    public String getPrivacyEngineEndpoint() {
        return privacyEngineEndpoint;
    }

    public void setPrivacyEngineEndpoint(String privacyEngineEndpoint) {
        this.privacyEngineEndpoint = privacyEngineEndpoint;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ClearingInitializationDTO{" +
                "flightList=" + Arrays.toString(flightList) +
                ", flights=" + flights +
                ", privacyEngineEndpoint='" + privacyEngineEndpoint + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
