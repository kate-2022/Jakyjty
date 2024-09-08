package com.jakyjty.user.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jakyjty.model.user.User;
import com.jakyjty.random.service.IWishMessageService;
import com.jakyjty.random.service.RandomResult;

   

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private IWishMessageService service;
	
	
	
	@GetMapping("/api/user/greet")
	public ResponseEntity<String> greetUser(@RequestBody User user){
		String msg= service.generateWishMessage(user);
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
			
	}
	
	@PostMapping
	public ResponseEntity<String>getRandomResult(@RequestBody User user){
		
		String result = RandomResult.rollTheDice();
		return new ResponseEntity<String> ("You were selected by our Jakyjty night planner for the pleasure of " +result +	
		" !! Wishing you lots of good moments in nice company..", HttpStatus.OK) ;
	}
	
	
	// trying to update module-info.java for user.dao and user.model - why is git telling all would be up to date??
	

}
