package com.tingmou.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping()
@Controller
public class LoginController {	
	
    @RequestMapping("/login")
    public String login(){
        return "login";
    }   

    @RequestMapping(value="/login",params = "error")
    public String loginerror(){
    	return "login";
    }

//    @RequestMapping(value="/login",params= "logout")
//    public String logout(){
//    	return "login";
//    }
    
}
