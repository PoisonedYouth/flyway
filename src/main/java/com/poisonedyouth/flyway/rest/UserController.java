package com.poisonedyouth.flyway.rest;

import com.poisonedyouth.flyway.domain.User;
import com.poisonedyouth.flyway.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/users")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("")
	public ResponseEntity<Iterable<User>> loadAllUsers() {
		return new ResponseEntity<>(userService.loadAllUsers(), HttpStatus.OK);
	}
}
