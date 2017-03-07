package com.tingmou.ssm.dao;

import java.util.List;

import com.tingmou.ssm.model.User;

public interface UserMapper {

	public List<User> getUsers();
	public User getUser(int id);
	public void saveUser(User user);
	public void createUser(User user);
	public void removeUser(int id);	
}
