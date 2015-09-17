package com.mhuiq.spring.classLoader;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyClasslLoader extends ClassLoader {

	private String name;
	private String path;
	private final static String fileType = ".class";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	
	@Override
	protected Class<?> findClass(String className) throws ClassNotFoundException {
		byte[] data = loadClassData(className);
		return data == null? null : this.defineClass(null, data, 0, data.length, null) ;
	}
	
	private byte[] loadClassData(String className) {
		className = className.replace(".", "/");
		File classFile = new File(this.path+className+fileType);
		InputStream is = null;
		ByteArrayOutputStream baos = null;
		try {
			if(!classFile.exists()) {
				return null;
			}
		} catch (Exception e) {
			System.out.println("读取文件出错了...");
			return null;
		}
		
		try {
			is = new BufferedInputStream(new FileInputStream(classFile));
			baos = new ByteArrayOutputStream();
			int ch;
			while((ch = is.read()) != -1) {
				baos.write(ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println("找不到文件...");
			return null;
		} catch (IOException e) {
			System.out.println("读取文件出错了...");
		} finally {
			try {
				if(is != null)
				is.close();
				if(baos != null)
					baos.close();
			} catch (IOException e) {
				return null;
			}
		}
		return baos == null? null : baos.toByteArray();
	}
	
	
}
