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

		try{

			List<User> list=userMapper.getUsers();
			return list;
			
		}catch (Exception e){
			System.out.print(e);
			throw e;
		}
		
//		List<User> list=new ArrayList<User>();
//		
//		User user1 = new User();
//		user1.setId(1);;
//		user1.setName("ttt");
//		user1.setCallId(1111);
//		list.add(user1);
//
//		User user2 = new User();
//		user2.setId(1);;
//		user2.setName("ttt");
//		user2.setCallId(1111);
//		list.add(user2);
		
	}

}
