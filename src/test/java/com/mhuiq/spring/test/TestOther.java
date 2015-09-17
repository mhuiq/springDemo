package com.mhuiq.spring.test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.mhuiq.spring.util.MyUtil;

public class TestOther {

	@Test
	public  void TestMD5() {
		System.out.println(MyUtil.MD5encoding("123456789"));
	}
	
	@Test
	public void testArrayList() {
		List<String> list = new ArrayList<String>();
		list.add("b");
		list.add("a");
		list.add("h");
		list.add("d");
		
		for(Iterator<String> it = list.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
		
		Collections.sort(list, new Comparator<String>() {
			public int compare(String s1,String s2) {
				return s2.compareTo(s1);
			}
		});
		System.out.println("排序以后...");
		for(Iterator<String> it = list.iterator();it.hasNext();) {
			System.out.println(it.next());
		}
		
	}
	
	@Test
	public void testGeneric() {
		List list = new ArrayList();
		MyArrayList<String> myArrayList = new MyArrayList<String>();
		myArrayList.add("hello");
		System.out.println(myArrayList.get(9));
	}
	
	@Test
	public void testHashMap() {
		Map<String,String> hashMap = new HashMap<String, String>();
		hashMap.put("first", "the first value");
		System.out.println(hashMap.get("first"));
	}
	
}
