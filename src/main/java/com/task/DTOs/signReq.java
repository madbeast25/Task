package com.task.DTOs;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;

public class signReq {
   
	@Email
	String email;
	String name;
	String password;
	
	public signReq() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "signReq [email=" + email + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
}
