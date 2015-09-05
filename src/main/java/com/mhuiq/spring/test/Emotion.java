package com.mhuiq.spring.test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Emotion {
	@Pointcut("execution(* com.mhuiq.spring.test.People.speak(..))")
	public void spea() {
	}
	
	@Before("spea()")
	public void happy() {
		System.out.println("you r so happy ...");
	}
	
	@After("spea()")
	public void anger() {
		System.out.println("why r u anger ...");
	}
}
