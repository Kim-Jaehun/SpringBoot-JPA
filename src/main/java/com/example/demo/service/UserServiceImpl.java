package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UsersRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UsersRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUserByUserId(String userId) {
		return userRepository.findById(userId);
	}

	@Override
	public void registerUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void modifyUser(String userId, User user) {
		Optional<User> svrUser = userRepository.findById(userId);
		svrUser.get().setUserName(user.getUserName());
		svrUser.get().setUserNo(user.getUserNo());
		svrUser.get().setUserPassword(user.getUserPassword());
		userRepository.save(svrUser.get());
	}

	@Override
	public void deleteUser(String userId) {
		userRepository.deleteById(userId);;
	}

	@Override
	public Optional<User> getAllAccount(String userId) {
		Optional<User> user = userRepository.findById(userId);
		//userRepository.getOne(userId)
		return user;
	}
	
}
