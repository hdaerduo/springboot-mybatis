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

import com.tingmou.ssm.model.Customer;
import com.tingmou.ssm.service.ICustomerService;
import com.tingmou.ssm.service.impl.CustomerService;
import com.tingmou.ssm.ui.CustomerForm;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private ICustomerService customerService;

	@RequestMapping("/")
	public String index(Model model) {

		List<Customer> users = customerService.getCustomers();

		model.addAttribute("users", users);

		return "customers/index";
	}

	@RequestMapping(value = "/user/{id}")
	public String editUser(@PathVariable("id") Integer id, Model model) {

		Customer user = customerService.getCustomer(id);
		CustomerForm userForm = new CustomerForm(user);
		
		model.addAttribute("user", userForm);

		return "customers/editUser";
	}

	@RequestMapping(value = "/user/saveUser", method=RequestMethod.POST)
	public String saveUser(@ModelAttribute CustomerForm userForm) {		
		assert(userForm.getId()!=0);
		
		customerService.saveCustomer(userForm.toUser());

		return "redirect:/customers/";
	}

	@RequestMapping(value = "/createUser",params = "form")
	public String createUserForm(){
		
		return "customers/createUser";
	}

	@RequestMapping(value = "/createUser",method=RequestMethod.POST)
	public String createUser(@ModelAttribute CustomerForm userForm){
		//Need to add the create function here.
		Customer user= userForm.toUser();
		customerService.createCustomer(user);

		return "redirect:/customers/";
	}	
	

	@RequestMapping(value = "/user/{id}", params="remove")
	public String removeUser(@PathVariable("id") Integer id) {
		customerService.removeCustomer(id);
		return "redirect:/customers/";
	}
}
