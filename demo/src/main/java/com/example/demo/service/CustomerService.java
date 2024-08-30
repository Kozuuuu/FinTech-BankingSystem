package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepo;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo repository;

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }
}
