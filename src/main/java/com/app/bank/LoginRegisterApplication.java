package com.app.bank;

import com.app.bank.controller.BankController;
import com.app.bank.model.ACCOUNTS;
import com.app.bank.model.Account;
import com.app.bank.model.Bank;
import com.app.bank.repository.AccountRepository;
import com.app.bank.repository.BankRepository;
import com.app.bank.service.AccountService;
import com.app.bank.service.AccountServiceImpl;
import com.app.bank.service.BankService;
import com.app.bank.service.BankServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginRegisterApplication {


	public static void main(String[] args) {
		SpringApplication.run(LoginRegisterApplication.class, args);





	}

}
