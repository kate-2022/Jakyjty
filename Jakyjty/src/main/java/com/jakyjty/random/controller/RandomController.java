package com.jakyjty.random.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jakyjty.random.service.IWishMessageService;

@RestController
@RequestMapping("/api/random")
public class RandomController {
	
	@Autowired
	private IWishMessageService service;
	
	@GetMapping("/greet")
	public ResponseEntity<String> greetMesssage(){
		String msg = service.generateWishMessage();
		ResponseEntity<String> entity = new ResponseEntity<>(msg, HttpStatus.OK);
		return entity;
	}
	
	@PostMapping("/result")
	public ResponseEntity<String> rollTheDice(){
		return null;
		
	}

}
