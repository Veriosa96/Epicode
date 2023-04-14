package com.jdbc_PROJECT.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.jdbc_PROJECT.model.User;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UserJDBCDao implements UserDaoRepository {

	@Autowired
	JdbcTemplate jdbc;
	
	
	
	@Override
	public void create(User user) {
		String sql =  "INSERT INTO public.user (name, lastname, email, age, città, password)"
				+ "VALUES(?,?,?,?,?,?)";
		jdbc.update(sql, user.getName()
				,user.getLastname()
				,user.getEmail()
				,user.getAge()
				,user.getCittà()
				,user.getPassword());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
