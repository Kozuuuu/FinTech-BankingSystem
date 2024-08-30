package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.sql.Date;
import java.math.BigDecimal;

@Entity
@Table(name = "custommer_account")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomerAccount {
    @Id 

    @Column(name = "account_id")
    private String accountId;

    @Column(name = "client_id")
    private String clientId;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "currency")
    private String currency;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at") 
    private Date accountCreationDate;
}


