package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import java.sql.Date;
import java.math.BigDecimal;
import jakarta.persistence.Id;

@Entity
@Table(name = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Transaction {

    @Id
    
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "account_id")
    private String accountId;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "currency")
    private String currency;

    @Column(name = "transaction_date")
    private Date transactionDate;
}
