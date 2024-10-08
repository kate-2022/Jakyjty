package com.jakyjty.servicecontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api/service")
public class ServiceController {
	
//	@Autowired
//	User user = null;
	
	@GetMapping("/register/{firstName}")
	@ApiOperation("User registration service")
	public ResponseEntity<String> preRegisterUser(@PathVariable String firstName){
		String msg = "Hello " + firstName + "please start your registration here.. ";
	
		return new ResponseEntity(msg, HttpStatus.OK);
	}

}