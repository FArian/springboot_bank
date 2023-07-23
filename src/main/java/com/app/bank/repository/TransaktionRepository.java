package com.app.bank.repository;

import com.app.bank.model.Account;
import com.app.bank.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaktionRepository extends JpaRepository<Transaction, Long> {

}
