package com.jpa.crud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.cred.service.JPAService;
import com.jpa.crud.model.JPAModel;

@Service
public class CrudDao {
	@Autowired
  private JPAService js ;
	public JPAModel insertUser(JPAModel input) {
		return js.save(input);
	}
	
}
