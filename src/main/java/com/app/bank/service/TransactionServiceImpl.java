package com.app.bank.service;

import com.app.bank.model.Account;
import com.app.bank.model.Transaction;
import com.app.bank.repository.TransaktionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
//@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransaktionRepository transaktionRepository;

    public TransactionServiceImpl(TransaktionRepository transaktionRepository) {
        this.transaktionRepository = transaktionRepository;
    }

    @PostMapping("/transaction")
    @Override
    public String addTransaction(Transaction transaction) {
        transaktionRepository.save(transaction);
        return String.valueOf(new ResponseEntity<>("transaction added .", HttpStatus.CREATED));
    }
}

