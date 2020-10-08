package com.endurance.apac.loyalty.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {

    public enum Tier{
        SILVER,
        GOLD,
        PLATINUM
    }

    private String customerID;
    private String resellerID;
    private Tier tier;
    private double amountSpent;

    public Customer(@JsonProperty("customerID") String customerID,
                    @JsonProperty("resellerID") String resellerID) {
        this.customerID = customerID;
        this.resellerID = resellerID;
        this.tier = Tier.SILVER;
        this.amountSpent = 0;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getResellerID() {
        return resellerID;
    }

    public void setResellerID(String resellerID) {
        this.resellerID = resellerID;
    }

    public Tier getTier() {
        return tier;
    }

    public void setTier(Tier tier) {
        this.tier = tier;
    }

    public double getAmountSpent() {
        return amountSpent;
    }

    public void setAmountSpent(double amountSpent) {
        this.amountSpent = amountSpent;
    }
}
