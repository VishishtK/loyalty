package com.endurance.apac.loyalty.controller;

import com.endurance.apac.loyalty.model.Customer;
import com.endurance.apac.loyalty.model.Transactions;
import com.endurance.apac.loyalty.service.CustomerService;
import com.endurance.apac.loyalty.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RequestMapping("api/transaction")
@RestController
public class TransactionController {

    private TransactionService transactionService;
    private CustomerService customerService;

    @Autowired
    public TransactionController(TransactionService transactionService, CustomerService customerService) {
        this.transactionService = transactionService;
        this.customerService = customerService;
    }

    @GetMapping
    public Map<UUID, Transactions> getAllTransactions(){
        return transactionService.getAllTransactions();
    }

    @GetMapping(path = "{uuid}")
    public Transactions getTransactionById(@PathVariable("uuid") UUID uuid){
        return transactionService.getTransactionById(uuid);
    }

    @PostMapping
    public Boolean addTransaction(@RequestBody Transactions transactions){
        Customer customer = customerService.getCustomerById(transactions.getCustomerId());
        customerService.addAmountSpent(customer, transactions.getAmount());
        customerService.updateCustomerTier(customer);
        return transactionService.addTransaction(transactions);
    }

    @DeleteMapping(path = "{uuid}")
    public Boolean deleteTransaction(@PathVariable("uuid") UUID uuid){
        return Boolean.TRUE;
    }
}
