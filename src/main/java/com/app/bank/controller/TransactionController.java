package com.app.bank.controller;

import com.app.bank.model.Transaction;
import com.app.bank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping( "/addTransaction")
    public String showAddTransactionForm(Model model) {
        model.addAttribute("transaction", new Transaction());
        return "transactions/addTransaction.html";
    }

    @PostMapping("/addTransaction")
    public String addTransaction(@ModelAttribute("transaction") @Valid Transaction transaction, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            for (FieldError error : bindingResult.getFieldErrors()) {
                // Get the field name that has an error
                String fieldName = error.getField();

                // Get the error message for the field
                String errorMessage = error.getDefaultMessage();

                // Print the error details
                System.out.println("Error in field '" + fieldName + "': " + errorMessage);
            }
            return "account/errors";
        }
        transactionService.addTransaction(transaction);
        return "transactions/addTransaction.html";


    }
}

