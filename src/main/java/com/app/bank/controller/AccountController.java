package com.app.bank.controller;

import com.app.bank.model.Account;
import com.app.bank.model.User;
import com.app.bank.service.AccountService;
import org.apache.tomcat.util.modeler.BaseAttributeFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
    @RequestMapping(value = {"/createAccount"}, method = RequestMethod.GET)
    public String createAccount(Model model) {
        model.addAttribute("account", new Account());
        return "account/createAccount";
    }

    @PostMapping("/createAccount")
    public String createAccount(@ModelAttribute("account") @Valid Account account, BindingResult bindingResult) {
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

        // Save the account details to the database using the accountService
      accountService.createAccount(account);
        System.out.println("Account Details-------------->: "+account.toString());

        // Redirect to a success page after successful account creation


       // return "auth/login";
     return "account/successCreateAccount";

    }
}
