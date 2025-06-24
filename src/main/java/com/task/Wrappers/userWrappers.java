package com.task.Wrappers;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.task.DTOs.signReq;
import com.task.DTOs.userRes;
import com.task.Models.User;

@Component
public class userWrappers {

	public userRes toRes(User user) {
		userRes res=new userRes();
		
		res.setId(user.getId());
		res.setName(user.getName());
		res.setCreated_at(user.getCreated_at());
		
		
		return res;
	}
	
	public User toUser(signReq user) {
		User req=new User();
		
		req.setEmail(user.getEmail());
		req.setName(user.getName());
		req.setPassword(user.getPassword());
		req.setCreated_at(LocalDate.now());
		
		return req;
	}
}
