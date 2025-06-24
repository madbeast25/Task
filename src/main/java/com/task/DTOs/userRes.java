package com.task.DTOs;

import java.time.LocalDate;

public class userRes {
    
	int id;
	String name;
	LocalDate created_at;
	
	public userRes() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}
	
	

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "userRes [name=" + name + ", created_at=" + created_at + "]";
	}
	
	
}
