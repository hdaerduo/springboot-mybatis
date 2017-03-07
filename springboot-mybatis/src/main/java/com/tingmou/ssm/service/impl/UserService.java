package com.tingmou.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tingmou.ssm.dao.UserMapper;
import com.tingmou.ssm.model.User;
import com.tingmou.ssm.service.IUserService;

//@Service
public class UserService implements IUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getUsers() {

		try {
			List<User> list = userMapper.getUsers();
			return list;

		} catch (Exception e) {
			System.out.print(e);
			throw e;
		}
	}

	@Override
	public User getUser(int id) {
		return userMapper.getUser(id);
	}

	@Override
	public void saveUser(User user) {
		userMapper.saveUser(user);		
	}

	@Override
	public void createUser(User user) {
		userMapper.createUser(user);		
	}

}
