package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
		
		@RequestMapping("/")
		public String homePage(Model model) {
			System.out.println("main controller");
			
			model.addAttribute("name", "deepak");
			return "index";
		}
		
		@RequestMapping("/about")
		public String aboutPage() {
			System.out.println("about request");
			return "about";
		}
}
