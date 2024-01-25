package com.optimization.data.wm.service.dto;

import java.sql.Timestamp;

public class BalanceInformationDTO {
    private String airspaceUser;
    private int balance;
    private Timestamp timestamp;

    public BalanceInformationDTO(){
        // empty constructor
    }

    public String getAirspaceUser() {
        return airspaceUser;
    }

    public void setAirspaceUser(String airspaceUser) {
        this.airspaceUser = airspaceUser;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "BalanceInformationDTO{" +
                "airspaceUser='" + airspaceUser + '\'' +
                ", balance=" + balance +
                ", timestamp=" + timestamp +
                '}';
    }
}
