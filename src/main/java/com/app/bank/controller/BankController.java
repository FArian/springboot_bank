package com.app.bank.controller;

import com.app.bank.model.Bank;
import com.app.bank.service.BankService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BankController {
    private  BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }


    @PostMapping("/banks")
    @ResponseBody
    public Bank saveBank(@RequestBody Bank bank) {
        return bankService.saveBank(bank);
    }
}

