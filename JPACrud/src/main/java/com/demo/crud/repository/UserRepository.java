package com.demo.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.crud.model.User;

@Repository   //implementing traditional java EE Pattern such as data access object
public interface UserRepository extends JpaRepository<User, String >{

}
