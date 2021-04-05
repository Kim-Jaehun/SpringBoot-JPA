package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.domain.User;

@Service
public interface UserService {

	List<User> getAllUsers();

	Optional<User> getUserByUserId(String userId);

	void registerUser(User user);

	void modifyUser(String userId, User user);

	void deleteUser(String userId);
	
	/*고객의 모든계좌 조회*/
	Optional<User> getAllAccount(String userId);
}
