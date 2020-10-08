package com.endurance.apac.loyalty.service;

import com.endurance.apac.loyalty.model.Transactions;
import com.endurance.apac.loyalty.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Map<UUID, Transactions> getAllTransactions(){
        return transactionRepository.getAllTransactions();
    }

    public Transactions getTransactionById(UUID uuid){
        return transactionRepository.getTransactionById(uuid);
    }

    public Boolean addTransaction(Transactions transactions){
        return transactionRepository.addTransaction(transactions);
    }
}
