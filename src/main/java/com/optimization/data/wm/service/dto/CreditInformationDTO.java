package com.optimization.data.wm.service.dto;


import java.util.Map;

public class CreditInformationDTO {
    private int circulatingCredits;
    private int spentCredits;
    private int earnedCredits;
    private Map<Double, Integer> ninetyPercentThresholdMap;


    public CreditInformationDTO(){
        // empty constructor
    }

    public int getCirculatingCredits() {
        return circulatingCredits;
    }

    public void setCirculatingCredits(int circulatingCredits) {
        this.circulatingCredits = circulatingCredits;
    }

    public int getSpentCredits() {
        return spentCredits;
    }

    public void setSpentCredits(int spentCredits) {
        this.spentCredits = spentCredits;
    }

    public int getEarnedCredits() {
        return earnedCredits;
    }

    public void setEarnedCredits(int earnedCredits) {
        this.earnedCredits = earnedCredits;
    }

    public Map<Double, Integer> getNinetyPercentThresholdMap() {
        return ninetyPercentThresholdMap;
    }

    public void setNinetyPercentThresholdMap(Map<Double, Integer> ninetyPercentThresholdMap) {
        this.ninetyPercentThresholdMap = ninetyPercentThresholdMap;
    }

    @Override
    public String toString() {
        return "CreditInformationDTO{" +
                "circulatingCredits=" + circulatingCredits +
                ", spentCredits=" + spentCredits +
                ", earnedCredits=" + earnedCredits +
                ", ninetyPercentThresholdMap=" + ninetyPercentThresholdMap +
                '}';
    }
}
