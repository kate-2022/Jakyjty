package com.jakyjty.security.basicController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jakyjty.model.user.User;
import com.jakyjty.servicecontroller.ServiceController;

@RestController
@RequestMapping("/api/security")
public class BasicRestController {

	@Autowired
	User user = null;
	
	@GetMapping("/")
	public void jakyjtyHome() {
		initialWelcome();
		
	}
	
	@GetMapping("/home")
	public void initialWelcome() {	
		ServiceController.welcomeHome();
	}
	
	@GetMapping("/register/{firstName}")
	public ResponseEntity<String> registration (@PathVariable String firstname, @PathVariable String lastname) {
		User user = new User();
		user.setFirstName(firstname);
		user.setLastName(lastname);
		ServiceController.preRegisterUser(firstname);
		return new ResponseEntity<String>(firstname, HttpStatus.OK);
	}
		
	@GetMapping("/oauth")
	public String chooseExternalID () {
	
		return "Please choose your type of identification..";
		}
		
		
		
	}
	


