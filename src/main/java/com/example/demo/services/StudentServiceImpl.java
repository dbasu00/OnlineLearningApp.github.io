package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Lesson;
import com.example.demo.repository.LessionRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	LessionRepository lrepo;
	
	@Override
	public Lesson getLesson(int lessonId) {
		return lrepo.findById(lessonId).get();
	}

}
