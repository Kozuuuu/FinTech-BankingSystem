package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.CustomerAccount;
import com.example.demo.repo.CustomerAccountRepo;

import java.util.List;

@Service
public class CustomerAccountService {
    @Autowired
    private CustomerAccountRepo repository;

    public List<CustomerAccount> getAllCustomerAccounts() {
        return repository.findAll();
    }
}