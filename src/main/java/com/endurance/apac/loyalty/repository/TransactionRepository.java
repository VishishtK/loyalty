package com.endurance.apac.loyalty.repository;

import com.endurance.apac.loyalty.dao.TransactionDao;
import com.endurance.apac.loyalty.model.Transactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.UUID;

@Repository
public class TransactionRepository {

    private final TransactionDao transactionDao;

    @Autowired
    public TransactionRepository(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    public Map<UUID, Transactions> getAllTransactions(){
        return transactionDao.getAllTransactions();
    }

    public Transactions getTransactionById(UUID uuid){
        return transactionDao.getTransactionById(uuid);
    }

    public Boolean addTransaction(Transactions transactions){
        return transactionDao.addTransaction(transactions);
    }
}
