package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@RequestMapping("contact")
	public String contact() {
		System.out.println("contact page ");
		return "contact";
	}
	
	@RequestMapping(path="processform",method=RequestMethod.POST)
	public String processform(@RequestParam("email") String email, Model model) {
		System.out.println(email);
		model.addAttribute("email",email);
		return "contact";
	}

}
