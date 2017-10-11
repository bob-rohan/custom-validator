package rohan.validator.web.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import rohan.validator.web.model.Candidate;

public class CandiateValidator implements ConstraintValidator<CheckCandidate, Candidate> {
	
	private Validator validator;
	
	public void initialize(CheckCandidate constraintAnnotation) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	public boolean isValid(Candidate value, ConstraintValidatorContext context) {
		return (validator.validate(value, new Class<?>[0]).isEmpty());
	}
}