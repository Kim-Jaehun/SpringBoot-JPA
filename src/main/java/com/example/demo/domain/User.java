package com.example.demo.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
public class User {
	@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "user_no")
	private int userNo;
	
	@Column(name = "user_name")
    private String userName;
	
	@Column(name = "user_password")
    private String userPassword;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Account> accounts;
}
