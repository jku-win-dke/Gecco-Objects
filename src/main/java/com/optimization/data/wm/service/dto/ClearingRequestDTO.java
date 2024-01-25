package com.optimization.data.wm.service.dto;

/**
 * The DTO to request the clearing from the PE
 */
public class ClearingRequestDTO {
    private int[] data;

    public ClearingRequestDTO(){}

    public ClearingRequestDTO(int[] data){
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

}
