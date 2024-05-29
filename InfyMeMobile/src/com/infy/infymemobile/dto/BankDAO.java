package com.infy.infymemobile.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.infy.infymemobile.model.Account;
import com.infy.infymemobile.model.Transaction;

public class BankDAO {
	public static void createAccountlist() {
	}

	public static List<Account> viewAllAccounts(Long mobileNo) {
	List<Account> acclist = new ArrayList<Account>();
	acclist.add(new Account(5558348680461L,"AXISBANK", 3342.334,"SavingsAccount", LocalDate.of(2013, 12, 24) ,1323123321L));
	acclist.add(new Account(5558323480461L,"SBI", 3342.334,"FixedDeposit", LocalDate.of(2014, 12, 24) ,9146797041L));
	acclist.add(new Account(5558348680461L,"ICCI", 3342.334,"SalaryAccount", LocalDate.of(2015, 12, 24) ,9146597041L));
	acclist.add(new Account(43258348680461L,"MAHABANK", 3342.334,"SavingsAccount", LocalDate.of(2015, 12, 24) ,9146747041L));
	acclist.add(new Account(3234348680461L,"AMERICABANK", 3342.334,"SalaryAccount", LocalDate.of(2014, 12, 24) ,9146797141L));
	List<Account> obj= new ArrayList<Account>();
   for(Account obj1 : acclist) {
	   if(obj1.getMobileNumber().equals(mobileNo)) {
		obj.add(obj1);
	   }
		}
    return obj;
}
	public static Boolean linkAccount(Long mobileNo, Long accountNo) {
		List<Account> acclist = new ArrayList<Account>();
		acclist.add(new Account(5558348680461L,"AXISBANK", 3342.334,"SavingsAccount", LocalDate.of(2013, 12, 24) ,1323123321L));
		acclist.add(new Account(5558323480461L,"SBI", 3342.334,"FixedDeposit", LocalDate.of(2014, 12, 24) ,9146797041L));
		acclist.add(new Account(5558348680461L,"ICCI", 3342.334,"SalaryAccount", LocalDate.of(2015, 12, 24) ,9146597041L));
		acclist.add(new Account(43258348680461L,"MAHABANK", 3342.334,"SavingsAccount", LocalDate.of(2015, 12, 24) ,9146747041L));
		acclist.add(new Account(3234348680461L,"AMERICABANK", 3342.334,"SalaryAccount", LocalDate.of(2014, 12, 24) ,9146797141L));
				Boolean result = false;
	 for(Account obj1 : acclist) {
		   if(obj1.getMobileNumber().equals(mobileNo)&& obj1.getAccountNumber().equals(accountNo)) {
			return result=true;
		   }
	 }
	 return result;
	}
	public static Double checkBalance(Long mobileNo, Long accountNo) {
		List<Account> acclist = new ArrayList<Account>();
		acclist.add(new Account(5558338680461L,"AXISBANK", 3342.334,"SavingsAccount", LocalDate.of(2013, 12, 24) ,1323123321L));
		acclist.add(new Account(5558348680461L,"SBI", 3342.334,"FixedDeposit", LocalDate.of(2014, 12, 24) ,9146797041L));
		acclist.add(new Account(5558348660461L,"ICCI", 3342.334,"SalaryAccount", LocalDate.of(2015, 12, 24) ,9146597041L));
		acclist.add(new Account(43258348680461L,"MAHABANK", 3342.334,"SavingsAccount", LocalDate.of(2015, 12, 24) ,9146747041L));
		acclist.add(new Account(3234348680461L,"AMERICABANK", 3342.334,"SalaryAccount", LocalDate.of(2014, 12, 24) ,9146797141L));
	 for(Account obj1 : acclist) {
		   if(obj1.getMobileNumber().equals(mobileNo)&& obj1.getAccountNumber().equals(accountNo)) {
			Double balance= obj1.getBalance();
			return balance;
		   }
	 }
	return null;
	}

	public static List<Transaction> viewAllTransactiondao(Long MobileNo) {
		List<Account> acclist = new ArrayList<Account>();
		acclist.add(new Account(5558348680461L,"AXISBANK", 3342.334,"SavingsAccount", LocalDate.of(2013, 12, 24) ,1323123321L));
		acclist.add(new Account(5558323480461L,"SBI", 3342.334,"FixedDeposit", LocalDate.of(2014, 12, 24) ,9146797041L));
		acclist.add(new Account(5558348680461L,"ICCI", 3342.334,"SalaryAccount", LocalDate.of(2015, 12, 24) ,9146597041L));
		acclist.add(new Account(43258348680461L,"MAHABANK", 3342.334,"SavingsAccount", LocalDate.of(2015, 12, 24) ,9146747041L));
		acclist.add(new Account(3234348680461L,"AMERICABANK", 3342.334,"SalaryAccount", LocalDate.of(2014, 12, 24) ,9146797141L));
	 Long accountNumber= null;
	 for(Account obj1 : acclist) {
		   if(obj1.getMobileNumber().equals(MobileNo)) {
			accountNumber=obj1.getAccountNumber();
		   }
	 }
	  // on transaction end check Account table accountNumber is equal to transaction table accountnumber
		List<Transaction> tralist = new ArrayList<Transaction>();
		tralist.add(new Transaction(1,"MobileBanking", 3244134255L,432343L, LocalDate.of(2013, 12, 24) ,1323.423));
		tralist.add(new Transaction(2,"debit Card", 324413255L,3248L, LocalDate.of(2014, 12, 24) ,3244.432));
		tralist.add(new Transaction(3,"BankTransfer", 5558323480461L,238949L, LocalDate.of(2015, 12, 24) ,3243.234));
		tralist.add(new Transaction(4,"debit Card", 34344134255L,43324345L, LocalDate.of(2015, 12, 24) ,23423.23));
		tralist.add(new Transaction(5,"MobileBanking", 3243134255L,32787243L, LocalDate.of(2014, 12, 24) ,134453.342));
 
		List<Transaction> obj= new ArrayList<Transaction>();
		   for(Transaction obj1 : tralist) {
			   if(obj1.getSenderAccountNumber().equals(accountNumber) || obj1.getReceiverAccountNumber().equals(accountNumber)) {
				obj.add(obj1);
			   }
				}
		    return obj;
	}

}
	
 
