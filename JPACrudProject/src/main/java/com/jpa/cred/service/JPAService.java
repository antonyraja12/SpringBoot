package com.jpa.cred.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.crud.model.JPAModel;

@Repository
public interface JPAService  extends JpaRepository<JPAModel,String>{

	
}
