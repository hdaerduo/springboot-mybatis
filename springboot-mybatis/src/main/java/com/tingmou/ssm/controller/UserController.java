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
import com.tingmou.ssm.ui.UserForm;

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

	@RequestMapping(value = "/user/{id}")
	public String editUser(@PathVariable("id") Integer id, Model model) {

		User user = userService.getUser(id);
		UserForm userForm = new UserForm(user);
		
		model.addAttribute("user", userForm);

		return "users/editUser";
	}

	@RequestMapping(value = "/user/saveUser", method=RequestMethod.POST)
	public String saveUser(@ModelAttribute UserForm userForm) {		
		assert(userForm.getId()!=0);
		
		userService.saveUser(userForm.toUser());

		return "redirect:/users/";
	}

	@RequestMapping(value = "/user/createUser",params = "form")
	public String createUserForm(){
		
		return "users/createUser";
	}

	@RequestMapping(value = "/user/createUser",method=RequestMethod.POST)
	public String createUser(){
		//Need to add the create function here.

		return "redirect:/users/";
	}	
	

	@RequestMapping(value = "/user/{id}", params="remove")
	public String removeUser(@PathVariable("id") Integer id) {

		return "redirect:/users/";
	}
}
