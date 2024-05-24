package com.infy.infymemobile.validator;

import com.infy.infymemobile.exception.BankException;
import com.infy.infymemobile.model.Login;

public class LoginValidator {
	
	  public static  String LoginValidate(Login login)  throws BankException{
		  Long mobileNo= login.getMobileNumber();
		  String pass = login.getPassword();
		  if(validateMobileNumber(mobileNo) && validatePassword(pass)) {
			  return "User is Valid";
		  }
		  else {
			  throw new BankException("User is not valid");
		  }
		  
		  
	  }
	  
	  
	  public static  boolean validateMobileNumber(Long mobileNo) {
			// TODO Auto-generated method stub
		  String regex = "?!(\\d)\\1(9))[0-9]{10}";
		  if(mobileNo.toString().matches(regex)) {
			  return true ;
		  }
			return false;
		}
	  
	  
	private static boolean validatePassword(String pass) {
		// TODO Auto-generated method stub
		String regexp =  "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";

		if(pass.matches(regexp)) {
			return true ;
		}
		return false;
	}
	
	  
	  
}
