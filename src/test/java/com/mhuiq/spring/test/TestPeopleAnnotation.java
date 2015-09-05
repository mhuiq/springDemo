package com.mhuiq.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=("classpath:ApplicationContext.xml"))
public class TestPeopleAnnotation {
	@Autowired
	@Qualifier("chinese")
	private People people;
	
	@Test
	public void speak() {
		people.speak();
	}
	
	
}
