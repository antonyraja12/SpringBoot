package com.jpa.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.crud.dao.CrudDao;
import com.jpa.crud.model.JPAModel;

@CrossOrigin("*")
@RestController
@RequestMapping("/CRUD")
public class JPAController {
	@Autowired
	private CrudDao dao;
	
	@PostMapping("/post")
	public ResponseEntity<JPAModel> insertUserDetails(@RequestBody JPAModel input){
	return  ResponseEntity.ok(dao.insertUser(input));
	}

}
