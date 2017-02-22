package com.tingmou.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tingmou.ssm.model.User;
import com.tingmou.ssm.service.IUserService;
import com.tingmou.ssm.service.impl.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping("/")
	public String index(Model model) {

		List<User> users = userService.getUsers();

		if (users.size() >= 1) {
			model.addAttribute("singlePerson", users.get(0));
		}
		model.addAttribute("people", users);

		return "users/index";

	}
}
