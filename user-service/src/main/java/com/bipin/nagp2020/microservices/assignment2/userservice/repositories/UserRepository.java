package com.bipin.nagp2020.microservices.assignment2.userservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.bipin.nagp2020.microservices.assignment2.userservice.model.User;

@Service
public interface UserRepository extends CrudRepository<User, Integer> {

}
