package com.example.demo.domain.users;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.User;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.UsersRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersRepositoryTest {
	
	@Autowired
	UsersRepository userRepository;
	@Autowired
	AccountRepository accountRepository;

	@After
	public void cleanup() {
		userRepository.deleteAll();
	}
	
    @Test
	public void test() {

//		String userId = "kakao2";
//		String userName = "lee";
//		int userNo = 10;
//		String password = "1234";
//
//		userRepository.save(User.builder()
//				.userId(userId)
//				.userName(userName)
//				.userNo(userNo)
//				.userPassword(password)
//				.build());
//		
//		List<User> usersList = userRepository.findAll();
//
//		User users = usersList.get(0);
//		
//		System.out.println(users.getUserId());
//		System.out.println(users.getUserName());
//		
//		assertThat(users.getUserName(), is("lee"));
//		//assertThat(users.getUserPassword(), is("1234"));
	}
    
    @Test
	public void test2() {

//		String userId = "kakao2";
//		String userName = "lee";
//		int userNo = 10;
//		String password = "1234";
//		
//		Account account = null; 
//		account= new Account("11111", 100000, "kakao2", null);
//		
////		Account.builder()
////		.accNo("11111")
////		.balacne(1000)
////		.userId("kakao2")
////		.build()
//		
//
//
//		userRepository.save(User.builder()
//				.userId(userId)
//				.userName(userName)
//				.userNo(userNo)
//				.userPassword(password)
//				.accounts(null)
//				.build());
//		
//		
//		
	}


}
