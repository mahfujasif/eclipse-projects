package com.mlbd.accountCheck.BankAccount;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        
        BankAccount ba = new BankAccount("12..5.6");
        
        System.out.println(ba.getter());
        
        Set<ConstraintViolation<BankAccount>> constraintViolations = validator.validate(ba);
        for (ConstraintViolation<BankAccount> violation : constraintViolations) {
            System.err.println(violation.getMessage());
        }
    }
}
