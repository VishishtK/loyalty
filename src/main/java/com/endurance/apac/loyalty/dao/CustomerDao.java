package com.endurance.apac.loyalty.dao;

import com.endurance.apac.loyalty.model.Customer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CustomerDao {
    private Map<String, Customer> DB = new HashMap<>();

    public Map<String, Customer> getAllCustomers(){
        return DB;
    }

    public Customer getCustomerById(String customerId){
        return DB.get(customerId);
    }

    public Boolean addCustomer(Customer customer){
        DB.put(customer.getCustomerID(), customer);
        return Boolean.TRUE;
    }
}
