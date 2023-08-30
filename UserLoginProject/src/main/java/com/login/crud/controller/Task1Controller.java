package com.login.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.login.crud.dao.Task1Dao;
import com.login.crud.model.Response;
import com.login.crud.model.Task1Model;

@CrossOrigin("*")
@RestController
@RequestMapping("/signup")
public class Task1Controller {

	
	@Autowired
	private Task1Dao dao;
	
	@PostMapping("/insert")
	public ResponseEntity<Response>insertUserData( @RequestBody Task1Model input){
		return ResponseEntity.ok(dao.insertUser(input));
	}
	
	@PostMapping("/validate")
	
	public ResponseEntity<Response>validUser(@RequestParam String email,@RequestParam String password){
		return ResponseEntity.ok(dao.validateUser(email,password));
	}
}