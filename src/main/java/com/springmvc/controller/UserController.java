package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.model.User;
import com.springmvc.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("register")
	public String register() {
		System.out.println("Register Page");
		return "register";
	}
	
	@RequestMapping(path="processRegistration",method=RequestMethod.POST)
	public String processRegister(@ModelAttribute("user") User user,Model model) {
		System.out.println(user.getId());
		model.addAttribute("msg", user.getUsername());
		userService.createUser(user);
		return "index";
	}
	
}
