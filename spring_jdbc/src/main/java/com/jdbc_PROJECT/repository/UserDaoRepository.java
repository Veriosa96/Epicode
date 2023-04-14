package com.jdbc_PROJECT.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.jdbc_PROJECT.model.User;

@Repository


public interface UserDaoRepository {
	
	public void create(User user);
	public void update(User user);
	public void delete(User user);
	public User getById(Long id);
	public List<User> getAllUser();
	
}
