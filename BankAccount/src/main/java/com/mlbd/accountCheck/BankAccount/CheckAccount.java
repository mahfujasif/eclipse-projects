package com.mlbd.accountCheck.BankAccount;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target( { METHOD, FIELD, ANNOTATION_TYPE } )
@Retention(RUNTIME)
@Constraint(validatedBy = CheckAccountValidator.class)
@Documented
public @interface CheckAccount {
	
	String message() default "Invalid format 1";
	
	String message2() default "Invalid format 2";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
	 
}
