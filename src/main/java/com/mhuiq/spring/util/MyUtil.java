package com.mhuiq.spring.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 
 * @author Mark
 * @version 1.0
 * @Description 公共类
 */

public class MyUtil {
	
	/**
	 * @Description 对文件进行MD5加密
	 * @param file 输入要进行MD5加密的文件
	 * @return 加密后的字符串
	 * @throws NoSuchAlgorithmException
	 */
	public static String MD5encoding(File file) {
		if(null == file)
			return null;
		
		try {
			InputStream is = new FileInputStream(file);
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			try {
				BufferedInputStream bis = new BufferedInputStream(is);;
				byte[] bytes = new byte[1024];
				int length;
				while((length = bis.read(bytes)) > 0) {
					md5.update(bytes, 0, length);
				}
				bis.close();
			} catch(IOException e) {
				e.printStackTrace();
				return null;
			} finally {
				if(null != is) {
					is.close();
				}
			}
			return convertByteToHex(md5.digest());
		} catch (FileNotFoundException e) {
			System.out.println("找不到文件！");
		} catch (NoSuchAlgorithmException e) {
			System.out.println("MD5算法生成失败！");
		} catch (IOException e) {
			System.out.println("输入输出出错");
		}
		
		return null;
	}
	
	/**
	 * @description 加密字符串
	 * @param rawStr 输入要进行MD5加密的字符串
	 * @return 加密后的字符串
	 * @throws NoSuchAlgorithmException
	 */
	public static String MD5encoding(String rawStr) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(rawStr.getBytes());
			return convertByteToHex(md5.digest());
		} catch (NoSuchAlgorithmException e) {
			System.out.println("MD5算法生成失败！");
		}
		return null;
	}
	
	private static String convertByteToHex(byte[] bytes) {
		if(null == bytes || 0 == bytes.length)
			return null;
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<bytes.length;++i) {
			String tmp = Integer.toHexString(bytes[i] & 0xFF);
			if(tmp.length() < 2) {
				sb.append("0"+tmp);
			} else {
				sb.append(tmp);
			}
		}
		return sb.toString();
	}
	
	public static File zipFile(File file) {
		return null;
	}
	
	
	
}
