package com.tingmou.ssm.ui;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.BeanUtils;

import com.tingmou.ssm.model.User;

public class UserForm implements Serializable {
	private int id;
	
	@NotNull
	@Size(max = 40)
	private String name;
	private int age;
	private String description;
	private int callId;
	
	public UserForm(){
		
	}
	
	public UserForm(User user){
		BeanUtils.copyProperties(user,this);
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}	
	
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age=age;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void setDescription(String password){
		this.description = password;
	}
	
	public int getCallId(){
		return this.callId;
	}
	public void setCallId(int callId){
		this.callId=callId;
	}
	
	public User toUser(){

		User user = new User();
		BeanUtils.copyProperties(this, user);
		return user;
	}
}
