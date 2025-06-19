package test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
	
	@GetMapping("/")
	public String anotherTry() {
		return "<h1> Welcome to Jakyty! </h>";
		//return "<h1 style='colour:blue, text-align:center;'>Welcome to Jakyjty!</h1>";
	}
	
	@GetMapping("/test")
	public String anotherTest() {
		return "Does this work ???";
	}
	
	
	@GetMapping("/home")
	public String justTestingSomething() {
		return "<h1 style='colour:blue, text-align:center;'> Welcome to Jakyjty!</h1> </br>" 
				+ "Please create an account or log in to your existing account." 
				+ "<a href='https://kyivindependent.com/'> Click here for demonstration purpose..</a>";
	}

}
