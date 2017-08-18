package constraint1;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckCaseValidator implements ConstraintValidator<CheckCase, String>{
	
	private CaseMode casemode;
	
	public void initialize(CheckCase constrainAnnotation) {
		this.casemode = constrainAnnotation.value();
	}
	
	public boolean isValid(String object, ConstraintValidatorContext constraintValidatorContext) {
		if(object == null)
			return true;
		else if(casemode == CaseMode.UPPERCASE)
			return object.equals(object.toUpperCase());
		else
			return object.equals(object.toLowerCase());
	}
}
