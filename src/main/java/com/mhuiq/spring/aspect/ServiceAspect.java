package com.mhuiq.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceAspect {
	
	@Pointcut("execution(* com.mhuiq.spring.DAO.UserDAO.saveUser(..))")
	public void serviceAction() {
		
	}
	
	@Before("serviceAction()")
	public void beforAction() {
		System.out.println("Before Action ...");
	}
	
	@After("serviceAction()")
	public void afterAction() {
		System.out.println("After Action ...");
	}
}
