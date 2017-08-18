package com.mlbd.accountCheck.BankAccount;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckAccountValidator implements ConstraintValidator<CheckAccount, String>{

	private String message1;
	private String message2;
	
	public void initialize(CheckAccount constraintContext) {
		this.message1 = constraintContext.message();
		this.message2 = constraintContext.message2();
	}

	public boolean isValid(String object, ConstraintValidatorContext constraintContext) {
		boolean result = false;
		CheckValidity checkValidity = new CheckValidity();
		result =  checkValidity.check(object);
		
		if(result)
			System.out.println("ok");
		else
			System.out.println("not ok");
		
//		if(!result) {
//            constraintContext.disableDefaultConstraintViolation();
//            constraintContext.buildConstraintViolationWithTemplate( "Please enter proper format" ).addConstraintViolation();
//        }
		return result;
	}
}
