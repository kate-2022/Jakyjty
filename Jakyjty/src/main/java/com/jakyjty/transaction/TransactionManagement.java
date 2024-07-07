package com.jakyjty.transaction;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
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
	public void p1() {}
	
	@Pointcut("execution(public * com.jakyjty.dao.*.*())")
	public void p2() {}
	
	
	@Before("p1()")
	public void beforeTransaction(JoinPoint jp) {
		System.out.println("***** Before Transaction ****");
	}

	@After("p1()")	
	public void uponTransaction(JoinPoint jp) {
		System.out.println(" ***** Upon Transaction *****");		
	}

	@After("p1()")	
	public void uponTransaction() {
		System.out.println(" ***** Upon Transaction *****");
			
	}
	
	@Around("p2()")
	public void aroundAdvice(ProceedingJoinPoint pjp) {
		System.out.println("+++ Before Transaction around advice ++++");
		try {
			Object obj = pjp.proceed();
			System.out.println("Data: " + obj);
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("+++ After Transaction around advice ++++");
		
	}
	
}
