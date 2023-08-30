package com.demo.crud.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Specifies that the class is an entity
@Table(name = "users") // Specifies the primary table for the annotated entity

public class User {

	@Id // specifies the primary of an entity
	@Column(name = "s_no") // Specifies the mapped column for a presistence propertiy ora a field
	private String sNo;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "gender")
	private String gander;
	@Column(name = "updated_date")
	private Date upadted_date;

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGander() {
		return gander;
	}

	public void setGander(String gander) {
		this.gander = gander;
	}

	public Date getUpadted_date() {
		return upadted_date;
	}

	public void setUpadted_date(Date upadted_date) {
		this.upadted_date = upadted_date;
	}
}
