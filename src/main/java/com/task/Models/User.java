package com.task.Models;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "users")
public class User {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Email
	@Column(name="mail",nullable = false,unique = true)
	String email;
	@Column(name = "username",nullable = false,unique = true)
	String name;
	@Column(name = "password",nullable = false)
	String password;
	@Column(name = "created_at",nullable = false)
	@CreationTimestamp
	LocalDate created_at;
	
	public User() {
		
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

	public LocalDate getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int u_id) {
		this.id = u_id;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", password=" + password + ", created_at=" + created_at
				+ "]";
	}
	
	
}
