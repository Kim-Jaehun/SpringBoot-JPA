package com.example.demo.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
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
