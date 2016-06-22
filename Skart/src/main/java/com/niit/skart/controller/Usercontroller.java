package com.niit.skart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.skart.dao.Userdao;

@Controller
public class Usercontroller {
	
	@Autowired
		Userdao userdao;
		
	@RequestMapping("/")
	public String gotoindex() {
		return "home";
	}

	@RequestMapping("/isValidUser")
	public ModelAndView show(@RequestParam(value = "userid") String userid,
			@RequestParam(value = "password") String password) {

		String op;
		if (userdao.isValidUser(userid, password)) {
			op = "Valid Details";
		} else {
			op = "Invalid Details";
		}
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("op", op);
		mv.addObject("userid", userid);
		return mv;
	}

	@RequestMapping("/index")
	public String gotohome() {
		return "index";
	}

	@RequestMapping("/mobiles")
	public String gotmobiles() {
		return "mobiles";
	}

	@RequestMapping("/brand")
	public String gotobrand() {
		return "brand";
	}

	@RequestMapping("/contactus")
	public String gotocontactus() {
		return "contactus";
	}

	@RequestMapping("/signup")
	public String gotosignup() {
		return "signup";
	}

	@RequestMapping("/product")
	public String gotoproduct() {
		return "product";
	}

	

	}
	

