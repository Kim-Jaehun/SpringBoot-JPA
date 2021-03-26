package com.example.demo.domain.users;

import org.junit.After;
import org.junit.Test;
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
    	
    	//usersRepository.save();
    	
    	
    	
    }


}
