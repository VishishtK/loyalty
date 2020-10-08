package com.endurance.apac.loyalty.Tier;

import com.endurance.apac.loyalty.model.Customer;

public abstract class Tier {

    public abstract Customer.Tier getName();

    public abstract double getTierAmount();

    public abstract double getCashBackPercentage();

    public static Tier getTierObject(Customer.Tier tier){
        if (tier.equals(Customer.Tier.GOLD)){
            return new GoldTier();
        }
        else if (tier.equals(Customer.Tier.PLATINUM)){
            return new PlatinumTier();
        }
        return new SilverTier();
    }

    public abstract Tier getApplicableTier(Customer customer);
}
