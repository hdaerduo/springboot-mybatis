package com.tingmou.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tingmou.ssm.dao.CustomerMapper;
import com.tingmou.ssm.model.Customer;
import com.tingmou.ssm.service.ICustomerService;

//@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public List<Customer> getCustomers() {

		try {
			List<Customer> list = customerMapper.getCustomers();
			return list;

		} catch (Exception e) {
			System.out.print(e);
			throw e;
		}
	}

	@Override
	public Customer getCustomer(int id) {
		return customerMapper.getCustomer(id);
	}

	@Override
	public void saveCustomer(Customer user) {
		customerMapper.saveCustomer(user);		
	}

	@Override
	public void createCustomer(Customer user) {
		customerMapper.createCustomer(user);		
	}

	@Override
	public void removeCustomer(int id) {
		customerMapper.removeCustomer(id);
		
	}

}
