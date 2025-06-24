package com.task.Models;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tasks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	int id;
	@Column(name = "title",nullable = false)
	String title;
	@Column(name = "description",nullable = false)
	String description;
	@Column(name = "status",nullable = false)
	String status;
	@Column(name = "created_at",nullable = false)
	@CreationTimestamp
	LocalDate created_at;
	@Column(name = "due_date",nullable = false)
	LocalDate due_date;
	@Column(name = "assigned_to",nullable = false)
	String assigned_to;
	
	public Tasks() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}

	public LocalDate getDue_date() {
		return due_date;
	}

	public void setDue_date(LocalDate update_at) {
		this.due_date = update_at;
	}
	
	

	public String getAssigned_to() {
		return assigned_to;
	}

	public void setAssigned_to(String assigned_to) {
		this.assigned_to = assigned_to;
	}

	@Override
	public String toString() {
		return "Tasks [id=" + id + ", title=" + title + ", description=" + description + ", status=" + status
				+ ", created_at=" + created_at + ", update_at=" + due_date + "]";
	}
	
	
	
}
