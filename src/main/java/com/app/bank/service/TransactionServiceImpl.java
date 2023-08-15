package com.app.bank.service;

import com.app.bank.model.Transaction;
import com.app.bank.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @PostMapping("/transaction")
    @Override
    public void addTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
       // return String.valueOf("transaction added");
    }
}

