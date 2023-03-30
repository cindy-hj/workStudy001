package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	// create
	@PostMapping("/api/users/join")
	private ResponseEntity<User> createUser(@RequestBody User user) {
		User create = userService.createUser(user);
		
		return new ResponseEntity<User>(create, HttpStatus.CREATED);
	}
	
	// read
	
	
	// update
	
	
	// delete
	
	
}
