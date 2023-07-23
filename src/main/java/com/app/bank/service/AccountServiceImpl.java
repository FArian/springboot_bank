package com.app.bank.service;

import com.app.bank.model.Account;
import com.app.bank.model.User;
import com.app.bank.repository.AccountRepository;
import com.app.bank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
//@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;

    }

    @GetMapping("/successCreateAccount")
    public String showSuccessPage() {
        return "success";
    }

    @PostMapping("/createAccount")
    public String createAccount(Account account) {
        account.setUserId(getCurrentUserId());
        accountRepository.save(account);
        return String.valueOf(new ResponseEntity<>("Benutzerkonto erfolgreich erstellt.", HttpStatus.CREATED));
    }
    public Long getCurrentUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User userDetails = (User) authentication.getPrincipal();
        System.out.println("User Info: "+userDetails.getId());
        return userDetails.getId();
    }

}
