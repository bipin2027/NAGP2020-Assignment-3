package com.bipin.nagp2020.microservices.assignment2.userservice.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bipin.nagp2020.microservices.assignment2.userservice.model.User;
import com.bipin.nagp2020.microservices.assignment2.userservice.repositories.UserRepository;

@Service
public class InitUserService {
@Autowired
 private UserRepository userRepo;
	
	public void init() {
		User u1 = new User("john", 35, "john.doe@gmail.com", 1);
		User u2 = new User("jack", 35, "jack@gmail.com", 2);
		User u3 = new User("cassia", 35, "cassia@gmail.com", 3);
		userRepo.save(u1);
		userRepo.save(u2);
		userRepo.save(u3);
	}
}
