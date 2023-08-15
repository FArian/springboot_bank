package com.app.bank.repository;

import com.app.bank.model.Bank;
import com.app.bank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository  extends JpaRepository<Bank, Integer> {
}
