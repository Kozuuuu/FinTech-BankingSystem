package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Loan;
import com.example.demo.repo.LoanRepo;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    private LoanRepo repository;

    public List<Loan> getAllLoans() {
        return repository.findAll();
    }
}