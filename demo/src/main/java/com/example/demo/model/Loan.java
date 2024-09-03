package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import java.sql.Date;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Entity
@Table(name = "loan")
@Data
@NoArgsConstructor
@AllArgsConstructor 
public class Loan {
    @Id

    @Column(name = "loan_id")
    private String loandId;

    @Column(name = "client_id")
    private String customerId;

    @Column(name = "loan_type")
    private String loanType;

    @Column(name = "mortage")
    private String mortage;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "interest_rate")
    private BigDecimal interestRate;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "status")
    private String status;
}
