package com.tingmou.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.tingmou.ssm.dao.UserMapper;
import com.tingmou.ssm.model.User;

public class UserService implements UserDetailsService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userMapper.getUser(username);
		if(user==null){
			throw new UsernameNotFoundException("user not exist");
		}
		
		return user;
	}

}
