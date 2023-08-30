package com.login.crud.service;

import org.springframework.stereotype.Component;

import com.login.crud.model.Response;
import com.login.crud.model.Task1Model;

@Component
public interface Task1Service {

	public Response insertUser(Task1Model input);
	public Response validateUser(String email,String password);
}
