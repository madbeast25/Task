package com.task.DTOs;

import jakarta.validation.constraints.Email;

public class logReq {
    
	@Email
	String email;
	String password;
	
	public logReq() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "logReq [email=" + email + ", password=" + password + "]";
	}
	
	
}
