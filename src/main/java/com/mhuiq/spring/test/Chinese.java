package com.mhuiq.spring.test;

import org.springframework.stereotype.Component;

@Component("chinese")
public class Chinese implements People {

	public void speak() {
		System.out.println("Chinese speak chinese !");
		
	}

	public void walk() {
		// TODO Auto-generated method stub
		
	}

}
