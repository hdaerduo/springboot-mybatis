package com.tingmou.ssm.dao;

import java.util.List;

import com.tingmou.ssm.model.Customer;

public interface CustomerMapper {

	public List<Customer> getCustomers();
	public Customer getCustomer(int id);
	public void saveCustomer(Customer user);
	public void createCustomer(Customer user);
	public void removeCustomer(int id);	
}
