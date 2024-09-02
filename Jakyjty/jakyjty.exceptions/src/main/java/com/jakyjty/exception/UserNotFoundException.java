package com.jakyjty.exception;

public class UserNotFoundException extends RuntimeException{
	
	public static final long serialVersionUIO = 1L;
	
	public UserNotFoundException (String message) {
		super(message);
	}

}
