package com.bol.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Lets welcome the user with the following controller for spring
 * 
 * @author Gagandeep Singh
 * 
 */
@Controller
@RequestMapping({ "/", "/home" })
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "index";
	}
}
