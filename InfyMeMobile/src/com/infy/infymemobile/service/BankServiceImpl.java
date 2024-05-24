package com.infy.infymemobile.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.infy.infymemobile.model.Account;
import com.infy.infymemobile.model.Transaction;

public abstract class BankServiceImpl implements BankService {
    private Map<Long, List<Account>> mobileToAccountsMap;
    private List<Transaction> transactions;

    public BankServiceImpl() {
        this.mobileToAccountsMap = new HashMap<>();
        this.transactions = new ArrayList<>();
    }

    @Override
    public String loginUser(long mobileNo) {
        // Assuming some logic for login, for example, checking if the mobile number exists
        if (mobileToAccountsMap.containsKey(mobileNo)) {
            return "Login successful.";
        } else {
            return "Invalid mobile number. Please try again.";
        }
    }

    // Implement other methods of the BankService interface
    // createAccount, viewAllAccounts, linkAccount, checkBalance, fundTransfer, viewAllTransactions
}