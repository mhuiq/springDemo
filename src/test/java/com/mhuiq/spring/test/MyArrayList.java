package com.mhuiq.spring.test;

import java.util.Iterator;

public class MyArrayList<T> {
	
	Object[] element;
	
	public MyArrayList() {
		element = new Object[10];
	}
	public T get(int i) {
		try {
			return (T)element[i];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("索引不存在...");
		}
		return null;
	}
	public void add(T t) {
		System.out.println(element.length);
		element[element.length-1] = t;
	}
}
