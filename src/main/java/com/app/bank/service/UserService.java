package com.app.bank.service;

import java.util.List;

import com.app.bank.model.Bank;
import com.app.bank.model.User;

public interface Service {
    public void saveUser(User user);
    public List<Object> isUserPresent(User user);

    public void saveBank(Bank bank);
}
