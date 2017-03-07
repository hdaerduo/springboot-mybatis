package com.tingmou.ssm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tingmou.ssm.service.ICustomerService;
import com.tingmou.ssm.service.impl.CustomerService;

@Configuration
public class JavaConfig {
	@Bean
	public ICustomerService iUserService()
	{
		return new CustomerService();
	}
}
