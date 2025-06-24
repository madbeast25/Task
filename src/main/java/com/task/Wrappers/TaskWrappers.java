package com.task.Wrappers;

import org.springframework.stereotype.Component;

import com.task.DTOs.TaskReqDTO;
import com.task.DTOs.TaskResDTO;
import com.task.Models.*;

@Component
public class TaskWrappers {

	
	public Tasks toTask(TaskReqDTO req) {
		Tasks newTask=new Tasks();
		
		newTask.setTitle(req.getTitle());
		newTask.setDescription(req.getDescription());
		newTask.setStatus(req.getStatus());
		newTask.setAssigned_to(req.getAssigned_to());
		newTask.setDue_date(req.getDue_date());
		
		return newTask;
	}
	
	public TaskResDTO toResDTO(Tasks task) {
		TaskResDTO res=new TaskResDTO();
		
		res.setId(task.getId());
		res.setTitle(task.getTitle());
		res.setDescription(task.getDescription());
		res.setStatus(task.getStatus());
		res.setAssigned_to(task.getAssigned_to());
		res.setDue_date(task.getDue_date());
		
		return res;
	}
}
