package com.mhuiq.spring.test;

import org.springframework.stereotype.Component;

@Component("bodyLanguage")
public class BodyLanguage {
	public void beforeSaying() {
		System.out.println("Before Saying ...");
	}
	
	public void afterSaying() {
		System.out.println("After Saying ...");
	}
}
