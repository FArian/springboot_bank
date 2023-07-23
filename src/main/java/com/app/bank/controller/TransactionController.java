package com.app.bank.controller;

import com.app.bank.model.Transaction;
import com.app.bank.service.TransactionService;
import org.springframework.stereotype.Controller;

@Controller
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public String addTransaction (Transaction transaction){
        transactionService.addTransaction(transaction);
        return "Transaction added";
    }
}

