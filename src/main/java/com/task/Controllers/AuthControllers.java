package com.task.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.DTOs.logReq;
import com.task.DTOs.signReq;
import com.task.DTOs.updateReq;
import com.task.DTOs.userRes;
import com.task.Exceptions.EmailAlreadyExistException;
import com.task.Exceptions.PassWordMissMatchException;
import com.task.Exceptions.UserNotFoundException;
import com.task.Services.AuthServices;

@RestController
@RequestMapping("tasker/auth")
public class AuthControllers {
	
	@Autowired
	AuthServices service;
	
	@PostMapping("/login")
	public ResponseEntity<userRes> login(@RequestBody logReq req) throws UserNotFoundException, PassWordMissMatchException{
		userRes res=service.login(req);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	@PostMapping("/signup")
	public ResponseEntity<userRes> login(@RequestBody signReq req) throws EmailAlreadyExistException{
		userRes res=service.signup(req);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody updateReq req) throws EmailAlreadyExistException{
		
		String res=service.updateProfile(req);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
		
	}

}
