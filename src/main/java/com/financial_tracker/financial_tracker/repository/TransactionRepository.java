package com.financial_tracker.financial_tracker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.financial_tracker.financial_tracker.model.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
    // Optional: You can add custom queries here if needed
}
