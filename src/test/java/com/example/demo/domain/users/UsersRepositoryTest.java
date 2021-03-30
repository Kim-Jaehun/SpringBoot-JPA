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



@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersRepositoryTest {
	
	@Autowired
	UsersRepository usersRepository;

	@After
	public void cleanup() {
		usersRepository.deleteAll();
	}
	
    @Test
	public void test() {

		String userId = "kakao2";
		String userName = "lee";
		int userNo = 10;
		String password = "1234";

		usersRepository.save(User.builder()
				.userId(userId)
				.userName(userName)
				.userNo(userNo)
				.userPassword(password)
				.build());
		
		List<User> usersList = usersRepository.findAll();

		User users = usersList.get(0);
		
		System.out.println(users.getUserId());
		System.out.println(users.getUserName());
		
		assertThat(users.getUserName(), is("lee"));
		//assertThat(users.getUserPassword(), is("1234"));
	}


}
