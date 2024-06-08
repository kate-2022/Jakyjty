package com.jakyjty.random.controller;

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
public class RandomController {
	
	@Autowired
	private IWishMessageService service;
	
	@PostMapping("/greet")
	public ResponseEntity<String> greetMesssage(@RequestBody User user){
		try {
		String msg = service.generateWishMessage(user);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
		catch(Exception e){
			return new ResponseEntity<String>("Something went wrong..", HttpStatus.INTERNAL_SERVER_ERROR);	
		}
	}
	
	@PostMapping("/result")
	public ResponseEntity<String> getRandomResult(){
		
		try {
		String result = RandomResult.rollTheDice();
		return new ResponseEntity<String> ("You were selected by our Jakyjty night planner for the pleasure of " +result +	
		" !! Wishing you lots of good moments in nice company..", HttpStatus.OK) ;
	}catch(Exception e) {
		return new ResponseEntity<String> ("The random generator obviously made a mistake", HttpStatus.INTERNAL_SERVER_ERROR );
	}
	}
}
