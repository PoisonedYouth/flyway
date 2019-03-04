package com.poisonedyouth.flyway.service;

import com.poisonedyouth.flyway.domain.User;
import com.poisonedyouth.flyway.domain.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public Iterable<User> loadAllUsers() {
		return userRepository.findAll();
	}
}
