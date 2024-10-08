package com.jakyjty.random.service;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

import com.jakyjty.model.user.User;


@Service("wishMessageService")
public class WishMessageServiceImpl implements IWishMessageService  {

	@Override
	public String generateWishMessage(User user) {
		
		LocalDateTime ldt = LocalDateTime.now();
		String greetName = user.getFirstName();
		int hour = ldt.getHour();
		String body = null;
		if (hour <12) {
			body = "Good Morning "+ greetName + ", how are you today?";
		}
		else if (hour <17) {
			body = "Good afternoon "+ greetName + ", good to see you!";
		}
		else if (hour <21) {
	    	body ="Good evening " + greetName+ " : ) a warm welcome for a pleasant eve with nice people at Jakyjty!";
	    }
		else 
			body = "Welcome "+ greetName + " ! :) Get prepared for a vibrant night with sympatic and interesting people.. "+
		".. let us surprise you! ";
		return body;
	}


}

