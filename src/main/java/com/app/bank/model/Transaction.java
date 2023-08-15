package com.app.bank.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "transaction_sequence"
    )
    private int id;
    @NotNull(message = " accountNum cannot be empty")
    @Column(name = "accountNum")
    private String accountNum;
    @NotNull(message = " amount cannot be empty")
    @Column(name = "amount")
    private double amount ;

    @Temporal(TemporalType.DATE)
    @NotNull(message = " createdAt cannot be empty")
    @Column(name = "createdAt")
    private Date createdAt;

    public Transaction(String accountNum, double amount) {
        this.accountNum = accountNum;
        this.amount = amount;
    }

    public Transaction() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
