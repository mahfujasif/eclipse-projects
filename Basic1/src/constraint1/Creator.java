package constraint1;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class Creator {
	
	public static void main(String args[]) {
		
		System.out.println("jhjh");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
        
		Car car = new Car("morris", "dfsdfsd", 1);
		
		Set<ConstraintViolation<Car>> constraintViolations =
	            validator.validate(car);

	}
}