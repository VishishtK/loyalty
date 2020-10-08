package com.endurance.apac.loyalty.repository;

import com.endurance.apac.loyalty.dao.CustomerDao;
import com.endurance.apac.loyalty.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class CustomerRepository {

    private CustomerDao customerDao;

    @Autowired
    public CustomerRepository(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public Map<String, Customer> getAllCustomers(){
        return customerDao.getAllCustomers();
    }

    public Customer getCustomerById(String customerId){
        return customerDao.getCustomerById(customerId);
    }

    public Boolean addCustomer(Customer customer){
        return customerDao.addCustomer(customer);
    }
}
