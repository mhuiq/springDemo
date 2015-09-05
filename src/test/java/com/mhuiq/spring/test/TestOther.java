package com.mhuiq.spring.test;

import java.security.NoSuchAlgorithmException;

import org.junit.Test;

import com.mhuiq.spring.util.MyUtil;

public class TestOther {

	@Test
	public void TestMD5() throws NoSuchAlgorithmException {
		System.out.println(MyUtil.MD5encoding("123456789"));
	}
}
