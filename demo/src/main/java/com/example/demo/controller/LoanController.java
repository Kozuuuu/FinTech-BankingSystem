package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.LoanService;
import com.example.demo.model.Loan;

import java.util.List;

@RestController
@RequestMapping
public class LoanController {

    @Autowired
    private LoanService service;

    @GetMapping("/loans")
    public List<Loan> getAllLoans() { 
        return service.getAllLoans();
    }
}