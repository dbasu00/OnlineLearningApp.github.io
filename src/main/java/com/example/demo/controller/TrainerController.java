package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;

import com.example.demo.services.TrainerService;

@Controller
public class TrainerController {
	
	@Autowired
	TrainerService cService;
	
	@PostMapping("/createcourse")
	public String addCourse(@RequestParam("courseId")int courseId,
			@RequestParam("courseName")String courseName,
			@RequestParam("coursePrice")int coursePrice) {
		Course c=new Course();
		c.setCourseId(courseId);
		c.setCourseName(courseName);
		c.setCoursePrice(coursePrice);
		cService.addCourse(c);
		return "redirect:/";
	}
	
	@PostMapping("/addLesson")
	public String lession(@RequestParam("courseId")int cId,
			@RequestParam("lessonId")int lessonId,
			@RequestParam("lessonName")String lessonName,
			@RequestParam("topics")String topics,
			@RequestParam("vlink")String vlink) {
		Course course=cService.getCourse(cId);
		Lesson lession=new Lesson(lessonId,lessonName,topics,vlink,course);
		cService.addLesson(lession);
		course.getLesson().add(lession);
		return "redirect:/";
	}
	
	@PostMapping("/view")
	public String getCourses(@RequestParam("courseId")int courseId, Model model) {
		Course cs=cService.getCourse(courseId);
		model.addAttribute("courses",cs);
		return "show";
	}
	@GetMapping("/viewAll")
	public String getAllCourses(Model model) {
		List<Course> clist=cService.getAllCouses();
		model.addAttribute("courses",clist);

		return "show";
	}
	
}
