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
		if (hour <12) {
			return "Good Morning, how are you today?";
		}
		if (hour <17) {
			return "Good afternoon, good to see you!";
		}
	    if (hour <21) {
	    	return"Good evening : ) a warm welcome for a pleasant eve with nice people at Jakyjty!";
	    }
		return "Welcome! :) Get prepared for a vibrant night with nice and interesting people.. let us surprise you! ";
	}

}
