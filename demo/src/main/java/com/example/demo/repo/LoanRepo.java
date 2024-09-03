package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Loan;

public interface LoanRepo extends JpaRepository<Loan, String>{

}