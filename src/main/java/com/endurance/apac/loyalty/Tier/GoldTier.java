package com.endurance.apac.loyalty.Tier;

import com.endurance.apac.loyalty.model.Customer;

public class GoldTier extends Tier{

    static final Customer.Tier NAME = Customer.Tier.GOLD;
    static final double TIER_AMOUNT = 50000;
    static final double CASH_BACK_PERCENTAGE = 7.5;

    @Override
    public Tier getApplicableTier(Customer customer) {
        if (customer.getAmountSpent() >= PlatinumTier.TIER_AMOUNT){
            return new PlatinumTier().getApplicableTier(customer);
        }
        return this;
    }

    @Override
    public Customer.Tier getName() {
        return GoldTier.NAME;
    }

    @Override
    public double getTierAmount() {
        return GoldTier.TIER_AMOUNT;
    }

    @Override
    public double getCashBackPercentage() {
        return GoldTier.CASH_BACK_PERCENTAGE;
    }
}
