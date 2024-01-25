package com.optimization.data.wm.service.dto;

public class AirspaceUserDTO {
    private String airspace_user_id;
    private String name;

    public AirspaceUserDTO(){

    }

    public AirspaceUserDTO(String id){
        this.airspace_user_id = id;
    }

    public String getAirspace_user_id() {
        return airspace_user_id;
    }

    public void setAirspace_user_id(String airspace_user_id) {
        this.airspace_user_id = airspace_user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AirspaceUserDTO{" +
                "airspace_user_id='" + airspace_user_id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
