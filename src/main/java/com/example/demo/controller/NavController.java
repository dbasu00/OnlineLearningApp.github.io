package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/createcourse")
	public String createCourse() {
		return "createCourse";
	}
	@GetMapping("/addLesson")
	public String AddLesson() {
		return "createLesson";
	}
	@GetMapping("/view")
	public String showDeatails() {
		return "courseview";
	}
	@GetMapping("/trainer")
	public String trainer() {
		return "trainer";
	}
	@GetMapping("/myCourses")
	public String myCourses() {
		return "myCourse";
	}
	@GetMapping("/purchase")
	public String purchase() {
		return "purchase";
	}
	@GetMapping("/studenthome")
	public String studenthome() {
		return "studenthome";
	}
	@GetMapping("/DemoLesson")
	public String DemoLesson() {
		return "demoLesson";
	}
	@GetMapping("/logout")
	public String Logout() {
		return "login";
	}
	
	

}
