package com.financial_tracker.financial_tracker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String description;
    private Double amount;
    private String type; // e.g., income or expense

    // Getters
    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setType(String type) {
        this.type = type;
    }
}
