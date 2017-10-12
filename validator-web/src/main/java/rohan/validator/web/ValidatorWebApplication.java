package rohan.validator.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@SpringBootApplication
public class ValidatorWebApplication {

	public static void main(String[] args){
		SpringApplication.run(ValidatorWebApplication.class, args);
	}
}
