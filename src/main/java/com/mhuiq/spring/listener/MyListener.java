package com.mhuiq.spring.listener;

import org.springframework.web.context.ContextLoaderListener;

public class MyListener {
	
	private ContextLoaderListener cl = null;
	
	public MyListener() {
		System.out.println("MyListener is starting ...");
		cl = new ContextLoaderListener();
		System.out.println("MyListener is started ...");
	}
}
