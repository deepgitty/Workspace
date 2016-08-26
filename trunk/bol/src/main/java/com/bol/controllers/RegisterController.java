package com.bol.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bol.core.SignUp;

@Controller
@RequestMapping("/")
public class RegisterController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String index() {
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String processRegistration(SignUp signUp) {
		System.out.println(signUp);
		return "redirect:/";
	}
}