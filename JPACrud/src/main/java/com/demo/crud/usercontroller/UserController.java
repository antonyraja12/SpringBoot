package com.demo.crud.usercontroller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.crud.model.User;
import com.demo.crud.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("/jpa/crud")
public class UserController {
	
//	@Autowired
	private UserService userservice =new UserService();
	
	
	@PostMapping("/insert")
	public User addUser(@RequestBody User input) {
	return userservice.addUser(input);
	}

}
