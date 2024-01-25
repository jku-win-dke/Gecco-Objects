package com.optimization.data.wm.service.dto;

import java.util.HashMap;
import java.util.Map;

public class ClearingResponseDTO {
    private Map<String, Integer> values;

    private Boolean isFundingSufficient;

    private Boolean executedClearing;

    public ClearingResponseDTO(){
        values = new HashMap<>();
    }

    public Map<String, Integer> getValues() {
        return values;
    }

    public void setValues(Map<String, Integer> values) {
        this.values = values;
    }

    public Boolean getFundingSufficient() {
        return isFundingSufficient;
    }

    public void setFundingSufficient(Boolean fundingSufficient) {
        isFundingSufficient = fundingSufficient;
    }

    public Boolean getExecutedClearing() {
        return executedClearing;
    }

    public void setExecutedClearing(Boolean executedClearing) {
        this.executedClearing = executedClearing;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(var e : values.entrySet()){
           sb.append(e.getKey()).append(": ").append(e.getValue()).append(".").append("\n");
        }
        return "ClearingResponseDTO{" +
                "values=" + "\n" + sb.toString() +
                '}';
    }
}
