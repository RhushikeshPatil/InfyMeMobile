package com.infy.infymemobile.service;

import java.util.List;

import com.infy.infymemobile.model.Account;
import com.infy.infymemobile.model.Transaction;

public interface BankService {
    String loginUser(long mobileNo);
    
    String createAccount(Account account);
    
    List<Account> viewAllAccounts(long mobileNo);
    
    String linkAccount(long mobileNo, long accountNo);
    
    double checkBalance(long mobileNo, long accountNo);
    
    String fundTransfer(Transaction transaction);
    
    List<Transaction> viewAllTransactions(long mobileNo);
}
