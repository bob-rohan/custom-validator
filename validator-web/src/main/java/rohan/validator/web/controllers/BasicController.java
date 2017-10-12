package rohan.validator.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import rohan.validator.web.model.Candidate;
import rohan.validator.web.model.Registration;
import rohan.validator.web.validators.CheckRegistration;

@Controller
@Validated
@SessionAttributes("registration")
public class BasicController {
	
	private static final String BASIC_VIEW = "basic";
	
	private static final String REGISTRATION_MODEL_ATT = "registration";
	
	@GetMapping("/")
	public String get(Model model){
		Registration registration = new Registration();
		registration.setCandidate(new Candidate());
		
		model.addAttribute(REGISTRATION_MODEL_ATT, registration);
		
		return BASIC_VIEW;
	}
	
	@PostMapping("/")
	public String post(@CheckRegistration Registration registration){
		return BASIC_VIEW;
	}
	
}
