package com.financial_tracker.financial_tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financial_tracker.financial_tracker.model.Transaction;
import com.financial_tracker.financial_tracker.repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    // Create a new transaction
    public Transaction createTransaction(Transaction transaction) {
        // Use the variables from the Transaction model
        transaction.setDescription("Sample Transaction Description");
        transaction.setAmount(500.00);
        transaction.setType("income");

        return transactionRepository.save(transaction);
    }

    // Get all transactions
    public Iterable<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
}
