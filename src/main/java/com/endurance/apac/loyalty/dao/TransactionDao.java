package com.endurance.apac.loyalty.dao;

import com.endurance.apac.loyalty.model.Transactions;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class TransactionDao {
    private Map<UUID, Transactions> DB = new HashMap<>();

    public Map<UUID,Transactions> getAllTransactions(){
        return DB;
    }

    public Transactions getTransactionById(UUID uuid){
        return DB.get(uuid);
    }

    public Boolean addTransaction(Transactions transactions){
        DB.put(transactions.getUuid(), transactions);
        return Boolean.TRUE;
    }
}
