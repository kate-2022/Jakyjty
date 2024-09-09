package com.jakyjty.session.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.jakyjty.model.user.User;


@FeignClient(name = "MS1-User")
public interface IUserClient {
	
	@GetMapping("/api/user/greet")
	public ResponseEntity<String> greetUser(@RequestBody User user);

}

