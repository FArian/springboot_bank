package com.app.bank.service;

import com.app.bank.model.Bank;
import com.app.bank.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BankServiceImpl implements BankService{

    @Autowired
    BankRepository bankRepository;
    @Override
    public Bank saveBank(Bank bank) {
       return this.bankRepository.save(bank);
    }


}
