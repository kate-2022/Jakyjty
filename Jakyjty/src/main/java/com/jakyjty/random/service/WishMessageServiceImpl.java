package com.jakyjty.random.service;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WishMessageServiceImpl implements IWishMessageService  {

	@Override
	public String generateWishMessage() {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		int hour = ldt.getHour();
		String body = null;
		if (hour <12) {
			body = "Good Morning, how are you today?";
		}
		else if (hour <17) {
			body = "Good afternoon, good to see you!";
		}
		else if (hour <21) {
	    	body ="Good evening : ) a warm welcome for a pleasant eve with nice people at Jakyjty!";
	    }
		else 
			body = "Welcome! :) Get prepared for a vibrant night with nice and interesting people.. let us surprise you! ";
		return body;
	}
}

