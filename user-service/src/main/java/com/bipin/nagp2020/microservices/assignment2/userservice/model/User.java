package com.bipin.nagp2020.microservices.assignment2.userservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class User {
	private String name;
	private Integer age;
	private String email;
	
	@Id
	private Integer uId;

	public User() {

	}

	public User(String name, Integer age, String email, Integer uId) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

}
