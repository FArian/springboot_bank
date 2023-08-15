package com.app.bank.model;

public enum Role {
    CUSTOMER("Customer"),
    EMPLOYEE("Employee");

    private final String value;

    private Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}