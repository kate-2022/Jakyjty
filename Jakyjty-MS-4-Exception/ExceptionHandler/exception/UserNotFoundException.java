package com.jakyjty.exception;

public class UserNotFoundException extends RuntimeException{
	
	public static final long serialVersionUIO = 2L;
	
	public UserNotFoundException (String message) {
		super(message);
	}

}
