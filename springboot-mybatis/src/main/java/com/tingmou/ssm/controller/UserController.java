package com.tingmou.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

		model.addAttribute("users", users);

		return "users/index";
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public String user(@PathVariable("id") Integer id, Model model) {

		User user = userService.getUser(id);
		model.addAttribute("user", user);

		return "users/user";
	}
	
	@RequestMapping(value = "/user/saveUser", method=RequestMethod.POST)
	public String saveUser(@ModelAttribute User user) {		
		assert(user.getId()!=0);
		
		userService.saveUser(user);

		return "redirect:/users/";
	}
}
