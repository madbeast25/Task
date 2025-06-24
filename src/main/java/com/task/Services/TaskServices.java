package com.task.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.DTOs.TaskReqDTO;
import com.task.DTOs.TaskResDTO;
import com.task.Wrappers.TaskWrappers;

import jakarta.transaction.Transactional;

import com.task.Models.*;
import com.task.Repositories.taskRepo;

@Service
@Transactional
public class TaskServices {
    
	@Autowired
	TaskWrappers wrapper;
	
	@Autowired
	taskRepo repo;
	
	public TaskResDTO add(TaskReqDTO req) {
		Tasks newTask=wrapper.toTask(req);
		
		repo.save(newTask);
		
		TaskResDTO res=wrapper.toResDTO(newTask);
		return res;
		
	}
	
	public String changeStatus(int id,String status) {
		repo.setStatus(id, status);
		
		return "Status changed to "+status+"";
	}
	
	public String delete(int id) {
		repo.deleteById(id);
		
		return new String("Task with id:"+id+" is deleted successfully!!!");
	}
	
	public List<TaskResDTO> getTasks(String assigned_to){
		List<Tasks> tasks=repo.findAllTask(assigned_to);
		List<TaskResDTO> resTasks=new ArrayList<>();
		
		for(Tasks task:tasks) {
			TaskResDTO res=wrapper.toResDTO(task);
			
			resTasks.add(res);
		}
		
		return resTasks;
	}
	
	public String editTask(int id,TaskReqDTO req) {
		repo.editTask(id,req.getTitle(),req.getDescription(),req.getStatus(),req.getAssigned_to(),req.getDue_date());
		
		return "Task with id: "+id+" is edited successfully!!!";
	}
}
