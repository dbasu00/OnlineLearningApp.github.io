package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.LessionRepository;

@Service
public class TrainerServiceImpl implements TrainerService{
	
	@Autowired
	CourseRepository crepo;
	
	@Autowired
	LessionRepository lrepo;

	@Override
	public String addCourse(Course c) {
		crepo.save(c);
		return "Course Added Successfully";
	}

	@Override
	public String addLesson(Lesson l) {
		lrepo.save(l);
		return "Lession Added Successfully";
	}

	@Override
	public Course getCourse(int cId) {
		return crepo.findById(cId).get();
	}

	@Override
	public List<Course> getAllCouses() {
		return crepo.findAll();
	}
	

}
