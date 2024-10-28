package com.jakyjty.usercontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jakyjty.model.user.User;
import io.swagger.annotations.ApiOperation;


/*
 * This class is used to greet the user and communicate the random decision
 * 
 *  @author Kate
 * 
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private IWishMessageService service;

/*
 * This method is used for an initial greeting in get request
 * 
 * @param user (upon login)
 * @return 
 */	
	@GetMapping("/greet")
	@ApiOperation("Greet user")
	public ResponseEntity<String> greetUser(@RequestBody User user){
		String msg= service.generateWishMessage(user);

		return new ResponseEntity<String>(msg, HttpStatus.OK);	
	}
	
	/*
	 * This method is used to communicate the random result to the user upon greeting
	 * 
	 * @param user
	 * @return 
	 */
	@PostMapping
	@ApiOperation("Random result")
	public ResponseEntity<String>getRandomResult(@RequestBody User user){
		
		String result = RandomResult.rollTheDice();
		return new ResponseEntity<String> ("You were selected by our Jakyjty night planner for the pleasure of " +result +	
		" !! Wishing you lots of good moments in nice company..", HttpStatus.OK) ;
	}
	
	
	
}