package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.CustomerService;
import com.example.demo.model.Customer;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/customer")
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }
}
