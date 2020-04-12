package com.bipin.nagp2020.microservices.assignment2.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bipin.nagp2020.microservices.assignment2.userservice.dto.UserDto;
import com.bipin.nagp2020.microservices.assignment2.userservice.init.InitUserService;
import com.bipin.nagp2020.microservices.assignment2.userservice.userserviceimpl.UserServiceImpl;

@RestController
public class UserServiceController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Autowired
	private InitUserService init;
	/**
	 * Gets the user.
	 *
	 * @param userId the user id
	 * @return the user
	 */
	@GetMapping("user/{userId}")
	public UserDto getUser(@PathVariable String userId) {
		init.init();
		return userServiceImpl.getUser(Integer.parseInt(userId));
	}

}
