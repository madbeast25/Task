package com.task.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.task.DTOs.TaskReqDTO;
import com.task.DTOs.TaskResDTO;
import com.task.Models.Tasks;
import com.task.Services.TaskServices;

@RestController
@RequestMapping("tasker/task")
public class TaskControllers {
	
	@Autowired
	TaskServices service;
	
	@PostMapping("/add")
	public ResponseEntity<TaskResDTO> addTask(@RequestBody TaskReqDTO req){
		TaskResDTO res=service.add(req);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	@PatchMapping("/changeStatus/{id}")
	public ResponseEntity<String> setStatus(@PathVariable int id,@RequestParam String status){
		String res=service.changeStatus(id, status);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteTask(@PathVariable int id){
		String res=service.delete(id);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	@GetMapping("/getTasks/{member}")
	public ResponseEntity<List<TaskResDTO>> getTasks(@PathVariable String member){
		List<TaskResDTO> tasks=service.getTasks(member);
		
		return new ResponseEntity<>(tasks,HttpStatus.OK);
	}
	
	@PutMapping("/editTask/{id}")
	public ResponseEntity<String> edit(@PathVariable int id,@RequestBody TaskReqDTO req){
		String res=service.editTask(id, req);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}

}
