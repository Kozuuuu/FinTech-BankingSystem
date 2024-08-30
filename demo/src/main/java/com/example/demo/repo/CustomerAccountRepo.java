package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.CustomerAccount;

public interface CustomerAccountRepo extends JpaRepository<CustomerAccount, String> {   
}   