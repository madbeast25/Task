package com.task.DTOs;

import java.time.LocalDate;

public class TaskResDTO {
     
	int id;
	String title;
	String description;
	String status;
	String assigned_to;
	LocalDate due_date;
	
	public TaskResDTO() {
		
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
	

	public LocalDate getDue_date() {
		return due_date;
	}

	public void setDue_date(LocalDate due_date) {
		this.due_date = due_date;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	public String getAssigned_to() {
		return assigned_to;
	}

	public void setAssigned_to(String assigned_to) {
		this.assigned_to = assigned_to;
	}

	@Override
	public String toString() {
		return "TaskResDTO [id=" + id + ", title=" + title + ", description=" + description + ", status=" + status
				+ ", assigned_to=" + assigned_to + ", due_date=" + due_date + "]";
	}

	
	
}
