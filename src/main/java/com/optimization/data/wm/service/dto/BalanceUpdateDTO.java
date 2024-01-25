package com.optimization.data.wm.service.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BalanceUpdateDTO {
    private List<Balance> credit;

    public BalanceUpdateDTO(){
        this.credit = new ArrayList<>();
    }

    public void addBalance(String participant, Integer balance){
        this.credit.add(new Balance(participant, balance + ""));
    }

    public List<Balance> getCredit() {
        return credit;
    }

    public void setCredit(List<Balance> credit) {
        this.credit = credit;
    }

    private static class Balance{
        private String participant;
        private String balance;

        public Balance(){

        }

        public Balance(String participant, String balance){
            this.participant  = participant;
            this.balance = balance;
        }
        public String getParticipant() {
            return participant;
        }

        public void setParticipant(String participant) {
            this.participant = participant;
        }

        public String getBalance() {
            return balance;
        }

        public void setBalance(String balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Balance{" +
                    "participant='" + participant + '\'' +
                    ", balance=" + balance +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "BalanceUpdateDTO{" +
                "credit=" + Arrays.toString(credit.stream().toArray()) +
                '}';
    }
}

