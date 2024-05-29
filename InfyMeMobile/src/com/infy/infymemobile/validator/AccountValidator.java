package com.infy.infymemobile.validator;

import com.infy.infymemobile.exception.BankException;
import com.infy.infymemobile.model.Account;

public class AccountValidator {
	private AccountValidator() {
		
	}
	
public  static void validateAccount(Account account) throws BankException {
		if(isValidAccountNumber(account.getAccountNumber())==false) {
			throw new BankException(" ");
		}
		if(isValidBankName(account.getBankName())==false) {
			throw new BankException(" ");
		}
		if(isValidBalance(account.getBalance())==false) {
			throw new BankException(" ");
		}
		if(isValidAccountType(account.getAccountType())==false) {
			throw new BankException(" ");
		}
}
 
public static Boolean isValidAccountNumber( Long accountNumber) {
	String regexp="";
	if(accountNumber.toString().matches(regexp)){
		return true;
	}
 
	 return false;
}
		
public static Boolean isValidBankName(String bankName) {
	String regexp="[A-Za-z]";
 
	if(bankName.toString().matches(regexp)) {
		return true;
	}
   return false;
	
}
public static Boolean isValidBalance(Double balance) {
 
	if(balance>=1000) {
		return true;
	}
	 return false;
}
public static Boolean isValidAccountType(String accountType) {
	
String regexp="(SavingAccount|SalaryAccount|FixedDeposite)";
if(accountType.matches(regexp)) {
	return true;
}
	 return false ;
}
 
}