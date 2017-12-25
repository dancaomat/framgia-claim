package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView showMessage() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView showlogin() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping("/resetpassword")
	public ModelAndView showreset() {
		ModelAndView mv = new ModelAndView("resetpassword");
		return mv;
	}
}
