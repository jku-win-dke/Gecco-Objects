package com.optimization.data.wm.service.dto;

public class FlightAirspaceUserMappingDTO {
    private String id;

    private String airspaceUser;

    public FlightAirspaceUserMappingDTO(){
        // empty for serialization
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAirspaceUser() {
        return airspaceUser;
    }

    public void setAirspaceUser(String airspaceUser) {
        this.airspaceUser = airspaceUser;
    }

    @Override
    public String toString() {
        return "FlightAirspaceUserMappingDTO{" +
                "id='" + id + '\'' +
                ", airspaceUser='" + airspaceUser + '\'' +
                '}';
    }
}
