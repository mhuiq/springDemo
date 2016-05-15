package com.mhuiq.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="USER")
public class User implements Serializable{
	
	private static final long serialVersionUID = -7004910131941206233L;
	
	@Id
	@Column(name="userID",length=50,nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long userID;
	@Column(name="username",length=20,nullable=false)
	private String username;
	@Column(name="fullname",length=50,nullable=false)
	private String fullname;
	@Column(name="password",length=50,nullable=false)
	private String password;
	@Column(name="sex",length=2)
	private String sex;
	@Column(name="mobile",length=20)
	private String mobile;
	@Column(name="address",length=250)
	private String address;
	@Column(name="userRole",length=2)
	private int userRole;
	
	public void setUserID(long userID) {
		this.userID = userID;
	}
	
	public long getUserID() {
		return this.userID;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return this.username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getUserRole() {
		return userRole;
	}

	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}
	
	
}
