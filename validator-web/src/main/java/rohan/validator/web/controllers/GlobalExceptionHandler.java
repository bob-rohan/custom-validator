package rohan.validator.web.controllers;

import javax.validation.ConstraintViolationException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ConstraintViolationException.class)
	public String handleError(){
		return "constraintViolation";
	}
	
}
