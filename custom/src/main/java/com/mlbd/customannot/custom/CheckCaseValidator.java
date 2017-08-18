package com.mlbd.customannot.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckCaseValidator implements ConstraintValidator<CheckCase, String> {

    private CaseMode caseMode;
    
    private String massage;

    public void initialize(CheckCase constraintAnnotation) {
        this.caseMode = constraintAnnotation.value();
        this.massage = constraintAnnotation.message();
    }

    public boolean isValid(String object, ConstraintValidatorContext constraintContext) {

        if (object == null)
            return true;

        if (caseMode == CaseMode.UPPER) {
        	massage="A";
        	return object.equals(object.toUpperCase());
        }
            
        else {
        	massage="B";
        	return object.equals(object.toLowerCase());
        }
            
    }
}