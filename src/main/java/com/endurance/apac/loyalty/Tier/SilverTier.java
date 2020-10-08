package com.endurance.apac.loyalty.Tier;

import com.endurance.apac.loyalty.model.Customer;

public class SilverTier extends Tier {

    static final Customer.Tier NAME = Customer.Tier.SILVER;
    static final double TIER_AMOUNT = 0;
    static final double CASH_BACK_PERCENTAGE = 5;

    @Override
    public Tier getApplicableTier(Customer customer) {
        if (customer.getAmountSpent() >= GoldTier.TIER_AMOUNT){
            return new GoldTier().getApplicableTier(customer);
        }
        return this;
    }

    @Override
    public Customer.Tier getName() {
        return SilverTier.NAME;
    }

    @Override
    public double getTierAmount() {
        return SilverTier.TIER_AMOUNT;
    }

    @Override
    public double getCashBackPercentage() {
        return SilverTier.CASH_BACK_PERCENTAGE;
    }
}
