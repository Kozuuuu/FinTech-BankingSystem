package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.service.TransactionService;
import com.example.demo.model.Transaction;
import com.example.demo.dto.TransactionDTO;

@RestController
@RequestMapping("/transactions") 
public class TransactionController {  

    @Autowired
    private TransactionService service;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return service.getAllTransactions();
    }

    @GetMapping("/{id}")
    public Transaction getTransactionById(@PathVariable String id) {
        return service.getTransactionById(id);
    }

    @PostMapping
    public ResponseEntity<Transaction> saveTransaction(@RequestBody TransactionDTO transactionDTO) {
        Transaction savedTransaction = service.saveTransaction(transactionDTO);
        return new ResponseEntity<>(savedTransaction, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transaction> updateTransaction(@PathVariable String id, @RequestBody TransactionDTO transactionDTO) {
        Transaction updatedTransaction = service.updateTransaction(id, convertToTransaction(transactionDTO));
        return updatedTransaction != null ? new ResponseEntity<>(updatedTransaction, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable String id) {
        service.deleteTransaction(id);
    }

    // Utility method to convert DTO to model
    private Transaction convertToTransaction(TransactionDTO transactionDTO) {
        Transaction transaction = new Transaction();
        // Set other fields if necessary
        return transaction;
    }
}