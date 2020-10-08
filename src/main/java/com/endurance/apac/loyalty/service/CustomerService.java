package com.endurance.apac.loyalty.service;

import com.endurance.apac.loyalty.Tier.Tier;
import com.endurance.apac.loyalty.model.Customer;
import com.endurance.apac.loyalty.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Map<String, Customer> getAllCustomers(){
        return customerRepository.getAllCustomers();
    }

    public Customer getCustomerById(String customerId){
        return customerRepository.getCustomerById(customerId);
    }

    public Boolean addCustomer(Customer customer){
        return customerRepository.addCustomer(customer);
    }

    public Boolean updateCustomerTier(Customer customer){
        Tier tier = Tier.getTierObject(customer.getTier());
        Tier newTier = tier.getApplicableTier(customer);
        if(!tier.equals(newTier)){
            customer.setTier(newTier.getName());
            return customerRepository.addCustomer(customer);
        }
        return Boolean.TRUE;
    }

    public Boolean addAmountSpent(Customer customer, double amount){
        customer.setAmountSpent(customer.getAmountSpent() + amount);
        return customerRepository.addCustomer(customer);
    }
}
