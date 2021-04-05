package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/{userId}")
	public Optional<User> getUserByUserId(@PathVariable("userId") String userId) {
		return userService.getUserByUserId(userId);
	}
	
	@PostMapping("")
	public void registerUser(@RequestBody User user) {
		userService.registerUser(user);
	}
	
	@PutMapping("/{userId}")
	public void modifyUser(
			@PathVariable("userId") String userId, @RequestBody User user) {
		userService.modifyUser(userId, user);
	}
	
	@DeleteMapping("/{userId}")
	public void deleteUser(
			@PathVariable("userId") String userId) {
		userService.deleteUser(userId);
	}
	
	@GetMapping("/account/{userId}")
	public Optional<User> getAllAcount(@PathVariable("userId") String userId) {
		return userService.getAllAccount(userId); 
	}

	
}
