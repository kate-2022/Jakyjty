package com.jakyjty.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jakyjty.model.random.RandomResult;
import com.jakyjty.model.user.User;
import com.jakyjty.random.service.IWishMessageService;

@RestController
@RequestMapping("/api/random")
public class UserController {
	
	@Autowired
	private IWishMessageService service;
	
	@PostMapping("/greet")
	public ResponseEntity<String> greetMesssage(@RequestBody User user){
	
		String msg = service.generateWishMessage(user);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	
	@PostMapping("/result")
	public ResponseEntity<String> getRandomResult(){
		
		String result = RandomResult.rollTheDice();
		return new ResponseEntity<String> ("You were selected by our Jakyjty night planner for the pleasure of " +result +	
		" !! Wishing you lots of good moments in nice company..", HttpStatus.OK) ;

	}
}
