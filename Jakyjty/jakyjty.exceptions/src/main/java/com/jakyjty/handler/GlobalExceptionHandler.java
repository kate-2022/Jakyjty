package com.jakyjty.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jakyjty.error.ErrorDetails;
import com.jakyjty.exception.SessionExpiredException;
import com.jakyjty.exception.UserNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleUserNotFound(UserNotFoundException unf) {
		System.out.println("UserErrorControllerAdvice.handleUserNotFound()");
		
		//ErrorDetails details = new ErrorDetails(LocalDateTime.now(), unf.getMessage(), "404-NotFound");
		
		return new ResponseEntity<ErrorDetails>(new ErrorDetails(LocalDateTime.now(), unf.getMessage(),"404-NotFound" ), HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(SessionExpiredException.class)
	public ResponseEntity<ErrorDetails> handleSessionExpired(SessionExpiredException see){
		System.out.println("UserErrorControllerAdvice.handleSessionExpired()");
		//ErrorDetails details2 = new ErrorDetails(LocalDateTime.now(), see.getMessage(), "503-Service Unavailable");
		
		return new ResponseEntity<ErrorDetails>( new ErrorDetails(LocalDateTime.now(), see.getMessage(), "503-Service Unavailable"),HttpStatus.SERVICE_UNAVAILABLE);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?>handleRemainingProblems(Exception e){	
		System.out.println("UserErrorControllerAdvice.handleRemainingProblems()");
		
		ErrorDetails details = new ErrorDetails(LocalDateTime.now(), e.getMessage(), "Problems in processing occured..");
		
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
