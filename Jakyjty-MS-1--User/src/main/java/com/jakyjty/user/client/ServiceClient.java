package com.jakyjty.user.client;


//import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Jakyjty-MS-5-SERVICE")
// @RibbonClient(name ="Jakyjty-MS-5-SERVICE")
public interface ServiceClient {
	
	@GetMapping("/register/{firstName}")
	public ResponseEntity<String> preRegisterUser(@PathVariable String firstName);

}
