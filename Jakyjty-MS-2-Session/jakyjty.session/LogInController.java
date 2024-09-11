package com.jakyjty.restcontroller;

import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/login")
public class LogInController {
	
	@GetMapping("/greet")
	public ResponseEntity<String> someRestController (@RequestBody User user ){
		String msg = "Login successful for user" + user.getUsername();
		
		return new ResponseEntity<String> (msg, HttpStatus.OK);
	}
	
	
	
	

}
