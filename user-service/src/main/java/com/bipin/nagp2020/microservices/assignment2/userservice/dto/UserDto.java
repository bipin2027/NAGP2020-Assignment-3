package com.bipin.nagp2020.microservices.assignment2.userservice.dto;

public class UserDto {
	private String name;
	private int age;
	private String email;

	public UserDto() {

	}

	public UserDto(String name, int age, String email, int uId) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
