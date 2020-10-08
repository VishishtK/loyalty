package com.endurance.apac.loyalty.Tier;

import com.endurance.apac.loyalty.model.Customer;

public class PlatinumTier extends Tier {

    static final Customer.Tier NAME = Customer.Tier.PLATINUM;
    static final double TIER_AMOUNT = 120000;
    static final double CASH_BACK_PERCENTAGE = 10;



    @Override
    public Tier getApplicableTier(Customer customer) {
        return this;
    }

    @Override
    public Customer.Tier getName() {
        return PlatinumTier.NAME;
    }

    @Override
    public double getTierAmount() {
        return PlatinumTier.TIER_AMOUNT;
    }

    @Override
    public double getCashBackPercentage() {
        return PlatinumTier.CASH_BACK_PERCENTAGE;
    }
}
