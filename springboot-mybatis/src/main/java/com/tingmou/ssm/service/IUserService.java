package com.tingmou.ssm.service;

import java.util.List;

import com.tingmou.ssm.model.User;

public interface IUserService {

	public List<User> getUsers();
	public User getUser(int id);
	public void saveUser(User user);
	public void createUser(User user);
}
