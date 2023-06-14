package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.*;
import com.example.demo.services.CommentsService;
import com.example.demo.services.UserService;

@Controller
public class ServiceController {
	
	@Autowired
	UserService uService;
	
	@Autowired
	CommentsService cService;
	@PostMapping("/addUser")
	public String addUser(@RequestParam("fname")String fname,
			@RequestParam("lname")String lname,
			@RequestParam("email")String email,
			@RequestParam("password")String password,
			@RequestParam("role")String role,
			@RequestParam("phone")String phone) {
		boolean emailExists=uService.checkEmail(email);
		if(emailExists==false) {
			UserDemo u=new UserDemo();
			u.setFname(fname);
			u.setLname(lname);
			u.setEmail(email);
			u.setPassword(password);
			u.setRole(role);
			u.setPhone(phone);
			uService.addUser(u);
			return "login";
		}
		else {
			return "register";
		}
		
	}
	
	@PostMapping("/validate")
	public String validate(@RequestParam("email")String email,
			@RequestParam("password")String password) {
		boolean val=uService.validate(email, password);
		//If user is valid
		if(val==true) {
			if(uService.getUserRole(email).equals("Trainer")) {
				return "trainer";
			}
			else {
				return "studenthome";
			}
		}
		else {
			return "login";
		}
	}
	@PostMapping("/addComment")
	public String comments(@RequestParam("comment")String comment) {
	Comments c = new Comments();
	c.setComment(comment);
	cService.addComment(c);
	return "redirect:/studenthome";
	
	}


}
