package com.rest_PROJECT.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.rest_PROJECT.model.User;

@Configuration
public class UserConfiguration {
	
	@Value("${user.admin.name}") private String adminName;
	@Value("${user.admin.lastname}") private String adminLastname;
	@Value("${user.admin.email}") private String adminEmail;
	@Value("${user.admin.age}") private Integer adminAge;
	@Value("${user.admin.city}") private String adminCity;
	@Value("${user.admin.password}") private String adminPassword;
	
	@Bean("AdminUserBean")
	@Scope("singleton")
	public User newAdminUser() {
		 User Admin =  User.builder().name(adminName).lastname(adminLastname).email(adminEmail).age(adminAge).city(adminCity).password(adminPassword).build();
		
	}
	
	@Bean("AdminFakeBean")
	@Scope("singleton")
	public User newFakeUser() {
		User Admin = User.builder().name(adminName).lastname(adminLastname).email(adminEmail).age(adminAge).city(adminCity).password(adminPassword).build();
	}
}
