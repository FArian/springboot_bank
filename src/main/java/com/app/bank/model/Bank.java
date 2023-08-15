package com.app.bank.model;

import javax.persistence.*;

@Entity
@Table(name = "Bank")
public class Bank {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_sequence"
    )
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "Customer")
    private String Customer;
    @Column(name = "Employee")
    private String Employee;
    @Column(name = "amount")
    private double amount;

    public Bank(String name, String customer, String employee, double amount) {
        this.name = name;
        Customer = customer;
        Employee = employee;
        this.amount = amount;
    }

    public Bank() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public String getEmployee() {
        return Employee;
    }

    public void setEmployee(String employee) {
        Employee = employee;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Customer='" + Customer + '\'' +
                ", Employee='" + Employee + '\'' +
                ", amount=" + amount +
                '}';
    }
}
