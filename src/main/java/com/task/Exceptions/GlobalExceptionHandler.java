package com.task.Exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Map<String,String>> handleUserNotFound(UserNotFoundException ex){
		Map<String,String> errors=new HashMap<>();
		
		errors.put("Message",ex.getMessage());
		errors.put("StatusCode","404");
		
		return new ResponseEntity<>(errors,HttpStatus.NOT_FOUND);
	}
	
	public ResponseEntity<Map<String,String>> handlePassMissMatch(PassWordMissMatchException ex){
		Map<String,String> errors=new HashMap<>();
		
		errors.put("message",ex.getMessage());
		errors.put("StatusCode",HttpStatus.BAD_REQUEST.toString());
		
		return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
	}
	
    @ExceptionHandler(EmailAlreadyExistException.class)
	public ResponseEntity<Map<String,String>> handleEmailAlreadyExist(EmailAlreadyExistException ex){
		Map<String,String> errors=new HashMap<>();
		
		errors.put("Message",ex.getMessage());
		errors.put("StatusCode",HttpStatus.BAD_REQUEST.toString());
		
		
		return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
	}
}
