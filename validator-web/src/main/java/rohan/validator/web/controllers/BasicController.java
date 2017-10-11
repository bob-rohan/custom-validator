package rohan.validator.web.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import rohan.validator.web.model.Candidate;
import rohan.validator.web.model.Registration;

@Controller
public class BasicController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BasicController.class);
	
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
	public String post(@Valid Registration registration, BindingResult bindingResult){
		
		if(bindingResult.hasErrors()){
			LOGGER.error(bindingResult.getAllErrors().toString());
		}
		
		return BASIC_VIEW;
	}
	
}
