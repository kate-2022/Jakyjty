package com.jakyjty.servicecontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class ServiceController {
	
//	@Autowired
//	User user = null;
	
	@GetMapping("/home")
	public static String welcomeHome() {
		return "<h1 style='colour:blue, text-align:center;'>Welcome to Jakyjty!</h1> </br>" + 
				"Please create an account or log in to your existing account." +
				"<a href='https://kyivindependent.com/'> Click here for demonstration purpose..</a>";
	}
	
	
	@GetMapping("/preregister/{firstName}")
	public static ResponseEntity<String> preRegisterUser(@PathVariable String firstName){
		String msg = "Hello " + firstName + "please start your registration here.. ";
		return new ResponseEntity(msg, HttpStatus.OK);
	}
	
	@GetMapping("register")
	@ApiOperation("User registration service")
	public ResponseEntity<String>registerUser(@RequestParam String firstName, @RequestParam String lastName){
		String msg2 = "Please enter your registration details:";
		
		return new ResponseEntity(msg2, HttpStatus.OK);
		
	}
	
	
	
	@GetMapping("/logIn")
	public String personalLogIn () {
		return "Login succesful";
	}

}