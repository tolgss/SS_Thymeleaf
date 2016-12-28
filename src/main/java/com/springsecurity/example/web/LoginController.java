package com.springsecurity.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(){
		return "login";
	}
	@RequestMapping("/")
	public String root(){
		return "redirect:/home";
	}
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(){
		return "home";
	}
}
