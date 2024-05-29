package com.infy.infymemobile.service;

import java.util.List;

import com.infy.infymemobile.dto.BankDAO;
import com.infy.infymemobile.exception.BankException;
import com.infy.infymemobile.model.Account;
import com.infy.infymemobile.model.Login;
import com.infy.infymemobile.validator.AccountValidator;
import com.infy.infymemobile.validator.LoginValidator;

public class BankServiceImpl implements BankService{

	public String LoginUser(Login login) throws BankException {
		String message = LoginValidator.LoginValidate(login);
		return message;
	}

 
	public String createAccount(Account account) throws BankException {
		String message = AccountValidator.createAccount(account);
		return message;		
	}

 
	
	public List<Account> viewAllAccounts(Long mobileNo) {
		return BankDAO.viewAllAccounts(mobileNo);
	}

 
	
	public String linkAccount(Long MobileNo, Long AccountNo) {
		if(BankDAO.linkAccount(MobileNo, AccountNo)==true) {
			return "Account is linked to given mobileNo";
		}
		return "Account is not linked to given mobileNo";
	}

 
	
	public Double checkBalance(Long MobileNo, Long AccountNo) {
		return BankDAO.checkBalance(MobileNo, AccountNo);
	}

 
	
	public String fundTransfer(Transaction transaction) throws BankException {
		String message = TransactionValidator.TransactionValidate(transaction);
		return message;
	}

 
	
	public List<Transaction> viewAllTransaction(Long MobileNo) {
		return BankDAO.viewAllTransactiondao(MobileNo);
	}
 
}