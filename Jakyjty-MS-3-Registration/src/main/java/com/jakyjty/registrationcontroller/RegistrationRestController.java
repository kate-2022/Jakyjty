package com.jakyjty.registrationcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jakyjty.model.user.User;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/register")
public class RegistrationRestController {

	@Autowired
	Environment environment;
	
	

	@PostMapping
	@ApiOperation("Initial user registration")
	public ResponseEntity<String>registerUser(){
		
		User user = new User();
		String msg = " ";
		
		return new ResponseEntity (msg, HttpStatus.OK);
	}

}
