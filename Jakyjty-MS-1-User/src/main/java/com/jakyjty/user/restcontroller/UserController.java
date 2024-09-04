package com.jakyjty.user.restcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@GetMapping("/api/user/greet/{firstName}")
	public ResponseEntity<String> userGreeting (@PathVariable String firstName){
		
		return null;
	}

}
