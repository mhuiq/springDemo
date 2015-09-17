package com.mhuiq.spring.servlet;

import org.springframework.web.servlet.DispatcherServlet;

public class MyServlet {
	
	private DispatcherServlet ds = null;
	
	public MyServlet() {
		System.out.println("MyServlet is starting ...");
		ds = new DispatcherServlet();
		System.out.println("MyServlet is started ...");
	}
}
