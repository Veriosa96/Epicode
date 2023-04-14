package com.jdbc_PROJECT.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {
	private long id;
	private String name;
	private String lastname;
	private String email;
	private Integer age;
	private String città;
	private String password;
	
	
	public User(String name, String lastname, String email, Integer age, String città , String password) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
		this.città = città; 
		this.password = password;
	}
	
	
}
