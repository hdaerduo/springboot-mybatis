package com.tingmou.ssm.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	private int id;
	private String name;
	private int age;
	private String description;
	private int callId;
	
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
	
}
