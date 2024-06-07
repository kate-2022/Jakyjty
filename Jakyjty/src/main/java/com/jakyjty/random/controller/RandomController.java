package com.jakyjty.random.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jakyjty.model.random.RandomResult;
import com.jakyjty.model.user.User;
import com.jakyjty.random.service.IWishMessageService;

@RestController
@RequestMapping("/api/random")
public class RandomController {
	
	@Autowired
	private IWishMessageService service;
	
	@GetMapping("/greet")
	public ResponseEntity<String> greetMesssage(User user){
		String msg = service.generateWishMessage(user);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	@PostMapping("/result")
	public ResponseEntity<String> getRandomResult(){
		String result = RandomResult.rollTheDice();
		return new ResponseEntity<String> (result, HttpStatus.OK) ;
	}

}
