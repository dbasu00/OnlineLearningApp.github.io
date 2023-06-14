package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;

public interface TrainerService {
	//Adding Courses
	public String addCourse(Course c);
	//Adding Lesson
	public String addLesson(Lesson l);
	//getting course 
	Course getCourse(int cId);
	//All details
	List<Course> getAllCouses();

}
