package com.jakyjty.random.service;

import org.springframework.http.ResponseEntity;

import com.jakyjty.model.user.User;

public interface IWishMessageService {
	
	public String generateWishMessage(User user);

}
