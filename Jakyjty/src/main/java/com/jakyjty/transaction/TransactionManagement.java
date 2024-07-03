package com.jakyjty.transaction;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionManagement {
	
	@Pointcut("@annotation(com.jakyjty.charity.annotations.CustomTransaction)")
	public void p1() {
		
	}
	
	@Before("p1()")
	public void beforeTransactio() {
		System.out.println("***** Before Transaction ****");
	}
	

	@After("p1()")	
	public void uponTransaction() {
		System.out.println(" ***** Upon Transaction *****");
			
		}
	
	
}
