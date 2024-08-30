package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.CustomerAccountService;
import com.example.demo.model.CustomerAccount;

import java.util.List;

@RestController
@RequestMapping("/accounts")  // This URL is used for accessing customer accounts
public class CustomerAccountController {

    @Autowired
    private CustomerAccountService customerAccountService;

    @GetMapping
        public List<CustomerAccount> getAllCustomerAccounts() {
        return customerAccountService.getAllCustomerAccounts();
    }
}
