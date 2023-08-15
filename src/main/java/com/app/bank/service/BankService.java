package com.app.bank.service;

import com.app.bank.model.Bank;
import com.app.bank.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface BankService {
    public Bank saveBank(Bank bank);

}
