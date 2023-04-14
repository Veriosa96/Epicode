package com.jdbc_PROJECT.configuration;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.jdbc_PROJECT.model.User;

//essendo una classe di configurazione dobbiamo inserire:


@Configuration
@PropertySource("classpath:application.properties")
public class userConfiguration {
	
	@Value("${user.admin.name}") private String adminName;
	@Value("${user.admin.lastname}") private String adminlastName;
	@Value("${user.admin.email}") private String adminEmail;
	@Value("${user.admin.age}") private int adminAge;
	@Value("${user.admin.città}") private String adminCittà;
	@Value("${user.admin.password}") private String adminPassword;
	
	@Bean
	@Scope("singleton")
	public User adminUser() {
		return new User(adminName,adminlastName,adminEmail,adminAge,adminCittà,adminPassword);
	}
	
	
	//bean che restituisce un oggetto vuoto
	@Bean
	@Scope("prototype")
	public User customUser() {
		return new User();
	}
	
	
	//bean che restiruisce un oggetto con i parametri passati
	@Bean
	@Scope("prototype")
	public User paramsUser(String name, String lastname, String email, Integer age, String città, String password) {
		return new User(name, lastname, email, age, città, password);
	}
	
	//oggetto capace di generare dei dati fake
	@Bean
	@Scope("prototype")
	public User fakeUser() {
		Faker fake = Faker.instance(new Locale("in-IT"));
		User u = new User();
		u.setName(fake.name().firstName());
		u.setLastname(fake.name().lastName());
		u.setEmail(u.getName()+"."+ u.getLastname()+ "@example.com");
		u.setAge(fake.number().numberBetween(16, 80));
		u.setCittà(fake.address().cityName());
		u.setPassword(fake.internet().password(6,10,true, true));
		return u;
	}
	
}
