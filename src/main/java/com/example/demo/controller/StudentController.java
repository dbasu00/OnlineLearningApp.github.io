package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Lesson;
import com.example.demo.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService sService;
	
	@PostMapping("/goToLesson")
	public String myLesson(@RequestParam("lessonId")int lessonId,Model model) {
		Lesson lesson=sService.getLesson(lessonId);
		model.addAttribute("lesson",lesson);
		return "myLesson";
	}
}
