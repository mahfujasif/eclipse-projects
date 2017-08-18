package com.mlbd.customannot.custom;

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
        System.out.println( "Hello World!" );
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        
        Car car = new Car("Morris", "dd-ab-123", 1);
        //System.out.println(car.getManufacturer());
        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);
        for (ConstraintViolation<Car> violation : constraintViolations) {
            System.err.println(violation.getMessage());
        }
    }
}
