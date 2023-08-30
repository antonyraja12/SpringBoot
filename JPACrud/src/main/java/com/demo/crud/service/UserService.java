package com.demo.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.crud.model.User;
import com.demo.crud.repository.UserRepository;

@Service  // Indicates that an annotated class is a service may also indicates that  a class is business service facade (in the core J2EE pattern sence) 
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User addUser(User input) {
		
		return userRepository.save(input);
	}
	
	

}
