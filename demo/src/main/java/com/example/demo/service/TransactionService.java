package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Transaction;
import com.example.demo.repo.TransactionRepo;

import java.util.UUID;
import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepo repository;

    public List<Transaction> getAllTransactions() {
        return repository.findAll();
    }

    public Transaction getTransactionById(String id) {
        return repository.findById(id).orElse(null);
    }

    public Transaction saveTransaction(Transaction transaction) {
        if (transaction.getTransactionId() == null || transaction.getTransactionId().isEmpty()) {
            transaction.setTransactionId(UUID.randomUUID().toString()); // Generate a new ID if not provided
        }
        return repository.save(transaction);
    }

    public void deleteTransaction(String id) {
        repository.deleteById(id);
    }

    public Transaction updateTransaction(String id, Transaction updatedTransaction) {
        Transaction existingTransaction = repository.findById(id).orElse(null);
        if (existingTransaction != null) {
            existingTransaction.setAmount(updatedTransaction.getAmount());
            // Set other fields accordingly
            return repository.save(existingTransaction);
        }
        return null;
    }
}
