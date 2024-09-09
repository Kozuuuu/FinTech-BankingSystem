package com.example.demo.model;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cards")
@Data
@NoArgsConstructor
@AllArgsConstructor 
public class Card {
    @Id

    @Column(name = "card_id")
    private String cardId;

    @Column(name = "account_id")
    private String accountId;

    @Column(name = "loan_type")
    private String loanType;

    @Column(name = "mortage")
    private String mortage;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "exp_date")
    private Date expDate;

    @Column(name = "security_code")
    private String securityCode;

    @Column(name = "status_code")
    private String statusCode;
}
