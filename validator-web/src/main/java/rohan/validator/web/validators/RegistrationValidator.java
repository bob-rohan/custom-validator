package rohan.validator.web.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import rohan.validator.web.model.Registration;

public class RegistrationValidator implements ConstraintValidator<CheckRegistration, Registration> {
	
	private Validator validator;
	
	public void initialize(CheckRegistration constraintAnnotation) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	public boolean isValid(Registration value, ConstraintValidatorContext context) {
		return (validator.validate(value, new Class<?>[0]).isEmpty());
	}
}