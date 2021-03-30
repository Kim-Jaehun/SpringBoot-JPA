package com.example.demo.domain.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class User {
	@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String userId;
	
	@Column(length = 50, nullable = true)
	private int userNo;

	@Column(length = 50, nullable = true)
    private String userName;
	
	@Column(length = 50, nullable = true)
    private String userPassword;
	
	@Builder
	public User(String userId, int userNo, String userName, String userPassword) {
		this.userId = userId;
		this.userNo = userNo;
		this.userName = userName;
		this.userPassword = userPassword;
	}
}
