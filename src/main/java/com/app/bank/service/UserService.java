package com.app.bank.service;

import java.util.List;

import com.app.bank.model.Bank;
import com.app.bank.model.User;

public interface UserService {
    public void saveUser(User user);
    public List<Object> isUserPresent(User user);
}
