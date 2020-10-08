package com.endurance.apac.loyalty.controller;

import com.endurance.apac.loyalty.model.Customer;
import com.endurance.apac.loyalty.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("api/customer")
@RestController
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public Map<String, Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping(path = "{customerId}")
    public Customer getCustomerById(@PathVariable("customerId") String customerId){
        return customerService.getCustomerById(customerId);
    }

    @PostMapping
    public Boolean addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @PutMapping(path = "{customerId}")
    public Boolean updateCustomer(@PathVariable("customerId") String customerId){
        return Boolean.TRUE;
    }

    @DeleteMapping(path = "{customerId}")
    public Boolean deleteCustomer(@PathVariable("customerId") String customerId){
        return Boolean.TRUE;
    }
}
