package com.tingmou.ssm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tingmou.ssm.service.IUserService;
import com.tingmou.ssm.service.impl.UserService;

@Configuration
public class JavaConfig {
	@Bean
	public IUserService iUserService()
	{
		return new UserService();
	}
}
