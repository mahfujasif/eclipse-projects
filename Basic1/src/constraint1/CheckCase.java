package constraint1;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Target( {METHOD, FIELD, ANNOTATION_TYPE} )
@Retention(RUNTIME)
@Constraint(validatedBy = CheckCaseValidator.class)
@Documented
public @interface CheckCase {
	
	String message() default "default error message";
	
	Class<?>[] groups() default{};

	Class<? extends Payload>[] PayLoad() default{};
	
	CaseMode value();
}
