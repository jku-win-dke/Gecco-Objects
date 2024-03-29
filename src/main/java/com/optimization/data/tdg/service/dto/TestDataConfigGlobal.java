package com.optimization.data.tdg.service.dto;

public class TestDataConfigGlobal {
    private String aerodomeOfRegulation;
    private String mostPenalisingRegulation;
    private String mostPenalisingRegulationCauseReason;
    private String filedRegistrationMark;
    private int slotSwapCounterCurrent;
    private int slotSwapCounterMax;
    private String mostPenalisingRegulationLocationCategory;
    private String status;
    private boolean nonICAOAerodromeOfDestination;
    private boolean nonICAOAerodromeOfDeparture;
    private boolean airfiled;
    private String timeWindowString;

    public String getTimeWindowString() {
        return timeWindowString;
    }

    public void setTimeWindowString(String timeWindowString) {
        this.timeWindowString = timeWindowString;
    }

    public String getMostPenalisingRegulationLocationCategory() {
        return mostPenalisingRegulationLocationCategory;
    }

    public void setMostPenalisingRegulationLocationCategory(String mostPenalisingRegulationLocationCategory) {
        this.mostPenalisingRegulationLocationCategory = mostPenalisingRegulationLocationCategory;
    }

    public String getAerodomeOfRegulation() {
        return aerodomeOfRegulation;
    }

    public void setAerodomeOfRegulation(String aerodomeOfRegulation) {
        this.aerodomeOfRegulation = aerodomeOfRegulation;
    }

    public String getMostPenalisingRegulationCauseReason() {
        return mostPenalisingRegulationCauseReason;
    }

    public void setMostPenalisingRegulationCauseReason(String mostPenalisingRegulationCauseReason) {
        this.mostPenalisingRegulationCauseReason = mostPenalisingRegulationCauseReason;
    }

    public String getFiledRegistrationMark() {
        return filedRegistrationMark;
    }

    public void setFiledRegistrationMark(String filedRegistrationMark) {
        this.filedRegistrationMark = filedRegistrationMark;
    }

    public int getSlotSwapCounterCurrent() {
        return slotSwapCounterCurrent;
    }

    public void setSlotSwapCounterCurrent(int slotSwapCounterCurrent) {
        this.slotSwapCounterCurrent = slotSwapCounterCurrent;
    }

    public int getSlotSwapCounterMax() {
        return slotSwapCounterMax;
    }

    public void setSlotSwapCounterMax(int slotSwapCounterMax) {
        this.slotSwapCounterMax = slotSwapCounterMax;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean getNonICAOAerodromeOfDestination() {
        return nonICAOAerodromeOfDestination;
    }

    public void setNonICAOAerodromeOfDestination(boolean nonICAOAerodromeOfDestination) {
        this.nonICAOAerodromeOfDestination = nonICAOAerodromeOfDestination;
    }

    public boolean getNonICAOAerodromeOfDeparture() {
        return nonICAOAerodromeOfDeparture;
    }

    public void setNonICAOAerodromeOfDeparture(boolean nonICAOAerodromeOfDeparture) {
        this.nonICAOAerodromeOfDeparture = nonICAOAerodromeOfDeparture;
    }

    public boolean getAirfiled() {
        return airfiled;
    }

    public void setAirfiled(boolean airfiled) {
        this.airfiled = airfiled;
    }

    public String getMostPenalisingRegulation() {
        return mostPenalisingRegulation;
    }

    public void setMostPenalisingRegulation(String mostPenalisingRegulation) {
        this.mostPenalisingRegulation = mostPenalisingRegulation;
    }

    public boolean isNonICAOAerodromeOfDestination() {
        return nonICAOAerodromeOfDestination;
    }

    public boolean isNonICAOAerodromeOfDeparture() {
        return nonICAOAerodromeOfDeparture;
    }

    public boolean isAirfiled() {
        return airfiled;
    }

    @Override
    public String toString() {
        return "TestDataConfigGlobal{" +
                "aerodomeOfRegulation='" + aerodomeOfRegulation + '\'' +
                ", mostPenalisingRegulation='" + mostPenalisingRegulation + '\'' +
                ", mostPenalisingRegulationCauseReason='" + mostPenalisingRegulationCauseReason + '\'' +
                ", filedRegistrationMark='" + filedRegistrationMark + '\'' +
                ", slotSwapCounterCurrent=" + slotSwapCounterCurrent +
                ", slotSwapCounterMax=" + slotSwapCounterMax +
                ", mostPenalisingRegulationLocationCategory='" + mostPenalisingRegulationLocationCategory + '\'' +
                ", status='" + status + '\'' +
                ", nonICAOAerodromeOfDestination=" + nonICAOAerodromeOfDestination +
                ", nonICAOAerodromeOfDeparture=" + nonICAOAerodromeOfDeparture +
                ", airfiled=" + airfiled +
                ", timeWindowString='" + timeWindowString + '\'' +
                '}';
    }
}
