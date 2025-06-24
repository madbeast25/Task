package com.task.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.DTOs.logReq;
import com.task.DTOs.signReq;
import com.task.DTOs.updateReq;
import com.task.DTOs.userRes;
import com.task.Exceptions.EmailAlreadyExistException;
import com.task.Exceptions.PassWordMissMatchException;
import com.task.Exceptions.UserNotFoundException;
import com.task.Models.User;
import com.task.Repositories.userRepo;
import com.task.Wrappers.userWrappers;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AuthServices {
     
	@Autowired
	userRepo repo;
	@Autowired
	userWrappers wrapper;
	
	public userRes login(logReq req) throws UserNotFoundException, PassWordMissMatchException {
		String userMail=req.getEmail();
		String userPass=req.getPassword();
		
		User exist=repo.findByEmail(userMail);
		
		if(exist == null) {
			throw new UserNotFoundException("User doesn't exist with the email called "+userMail);
		}
		
		if(!exist.getPassword().equals(userPass)) {
			throw new PassWordMissMatchException("Sorry invalid credentials wrong password!!!");
		}
		
		userRes res=wrapper.toRes(exist);
		return res;
		
	}
	
	public userRes signup(signReq req) throws EmailAlreadyExistException {
		
		User newUser=wrapper.toUser(req);
		String userEmail=newUser.getEmail();
		
		if(repo.existsByEmail(userEmail)) {
			throw new EmailAlreadyExistException("Sorry user with this email already exist!!!");
		}
		
		repo.save(newUser);
		userRes res=wrapper.toRes(newUser);
		
		return res;
	}
	
	public String updateProfile(updateReq req) throws EmailAlreadyExistException {
		int user_id=req.getId();
		String newEmail=req.getEmail();

		
		if(repo.existsByEmailAndIdNot(newEmail,user_id)) {
			throw new EmailAlreadyExistException("Sorry user with this email already exist!!!");
		}
		
		repo.updateUser(req.getEmail(),req.getName(),req.getPassword(),user_id);
		return "Updated Successfully!!!";
		
	}
}
