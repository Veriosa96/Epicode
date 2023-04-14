package com.jdbc_PROJECT.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.jdbc_PROJECT.configuration.userConfiguration;
import com.jdbc_PROJECT.model.User;
import com.jdbc_PROJECT.repository.UserJDBCDao;

@Component

//utilizziamo CommandLineRunner per runnarli in maniera automatica
public class UserRunner implements CommandLineRunner{


	@Autowired UserJDBCDao jdbcDao;
	
	@Override
	public void run(String... args) throws Exception {
		createUserRunner();
	}
	
	public void createUserRunner() {
		AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(userConfiguration.class);
		User u1 = (User) appContext.getBean("fakeUser");
		System.out.println(u1);
		
		jdbcDao.create(u1);
		appContext.close();
	}

}
