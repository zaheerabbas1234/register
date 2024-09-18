package com.register.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Register {
	
	@Id
	private String id;
	private String username;
	private String password;
	private String mobileno;
	private String email;
	private String address;
	
	public Register() {
		super();
	}

	public Register(String id,String username, String password, String mobileno, String email, String address) {
		super();
		this.id=id;
		this.username = username;
		this.password = password;
		this.mobileno = mobileno;
		this.email = email;
		this.address = address;
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Register [username=" + username + ", password=" + password + ", mobileno=" + mobileno + ", email="
				+ email + ", address=" + address + "]";
	}
	
	

}
