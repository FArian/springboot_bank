package com.app.bank.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "account_details")
public class Account {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_sequence"
    )
    private int id;
    @NotNull(message = " userId cannot be empty")
    @Column(name = "userId")
    private Long userId;
    @NotNull(message = " Name cannot be empty")
    @Column(name = "name")
    private String name;
    @NotNull(message = " dob cannot be empty")
    @Column(name = "dob")
    private String dob;
    @NotNull(message = " address cannot be empty")
    @Column(name = "address")
    private String address;
    @NotNull(message = " email cannot be empty")
    @Column(name = "email")
    private String email;

    @Column(name = "balance")
    private double balance;
    @NotNull(message = " typeOfAccount cannot be empty")
    @Column(name = "typeOfAccount")
    @Convert(converter = AccountTypeConverter.class)
    @Enumerated(EnumType.STRING)
    private ACCOUNTS typeOfAccount;

    public Account() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ACCOUNTS getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(ACCOUNTS typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", typeOfAccount=" + typeOfAccount +
                '}';
    }
}
