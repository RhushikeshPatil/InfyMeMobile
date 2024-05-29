package com.infy.infymemobile.validator;


 
import java.time.LocalDate;

import com.infy.infymemobile.exception.BankException;
import com.infy.infymemobile.model.Transaction;
 

 
public class TransactionValidator {

	public  static void validateTransaction(Transaction transaction) throws BankException {

		if(isValidModeOfTransaction(transaction.getModeOfTransaction())==false) {

			throw new BankException(" ");

		}

		if(isValidTransactionDate(transaction.getTransactionDate())==false) {

			throw new BankException(" ");

		}

}
 
	private static boolean isValidTransactionDate(LocalDate transactionDate ) {

		LocalDate today=LocalDate.now();

		if(transactionDate.isAfter(today)) {

		return false;

	}return true;

}

	private static boolean isValidModeOfTransaction(String modeOfTransaction) {

		String regexp="(CreditCard|DebitCard|BankTransfer)";

		if(regexp.matches(regexp)) {

			return true;

		}

		return false;

	}
 
}
