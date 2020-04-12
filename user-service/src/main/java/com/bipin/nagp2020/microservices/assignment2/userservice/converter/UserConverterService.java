package com.bipin.nagp2020.microservices.assignment2.userservice.converter;

import org.springframework.stereotype.Service;

import com.bipin.nagp2020.microservices.assignment2.userservice.dto.UserDto;
import com.bipin.nagp2020.microservices.assignment2.userservice.model.User;

@Service
public class UserConverterService {

	public UserDto convertToDTO(User user) {
		UserDto userDto = new UserDto();
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setAge(user.getAge());
		return userDto;
	}

}
