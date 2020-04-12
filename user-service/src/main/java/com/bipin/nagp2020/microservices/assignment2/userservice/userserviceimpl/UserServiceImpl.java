package com.bipin.nagp2020.microservices.assignment2.userservice.userserviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bipin.nagp2020.microservices.assignment2.userservice.converter.UserConverterService;
import com.bipin.nagp2020.microservices.assignment2.userservice.dto.UserDto;
import com.bipin.nagp2020.microservices.assignment2.userservice.model.User;
import com.bipin.nagp2020.microservices.assignment2.userservice.repositories.UserRepository;

@Service
public class UserServiceImpl {
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private UserConverterService userConverterService;

	public Optional<User> getUser2(Integer uId) {
		return userRepo.findById(uId);
	}
	
	public UserDto getUser(Integer uId) {
		Optional<User> user = userRepo.findById(uId);
		return userConverterService.convertToDTO(user.orElse(null));
	}


}
