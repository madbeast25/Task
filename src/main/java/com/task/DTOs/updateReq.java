package com.task.DTOs;

import jakarta.validation.constraints.Email;

public class updateReq {
	
	@Email
	String email;
	int id;
	String name;
	String password;
	
	public updateReq() {
		
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
	
	
	



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "signReq [email=" + email + ", name=" + name + ", password=" + password + "]";
	}
	
}
