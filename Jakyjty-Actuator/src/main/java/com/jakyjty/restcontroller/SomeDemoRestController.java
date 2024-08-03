package com.jakyjty.restcontroller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greet")
public class SomeDemoRestController {
	
		
	@GetMapping("/wish/{name}")
	public ResponseEntity<String> greetMe (@PathVariable String name){
	
		LocalDateTime ldt = LocalDateTime.now();
		int hour = ldt.getHour();
		
		String body = null;
	
	if (hour<12) 
		body = "Good morning :: " +name;
		
	else if (hour < 16)
		body = "Good afternoon :: " + name;
	else if(hour <20)
		body = "Good evening :: " + name;
	else 
		body = "Good night :: "+ name;
	
		return new ResponseEntity<String>(body, HttpStatus.OK);	}
	
	

}
