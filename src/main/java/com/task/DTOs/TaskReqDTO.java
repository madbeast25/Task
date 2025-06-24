package com.task.DTOs;

import java.time.LocalDate;

public class TaskReqDTO {
    
	String title;
	String description;
	String status;
	String assigned_to;
	LocalDate due_date;
	
	public TaskReqDTO() {
		
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
	

	public String getAssigned_to() {
		return assigned_to;
	}

	public void setAssigned_to(String assigned_to) {
		this.assigned_to = assigned_to;
	}

	@Override
	public String toString() {
		return "TaskReqDTO [title=" + title + ", description=" + description + ", status=" + status + ", due_date="
				+ due_date + "]";
	}
	
	
}
