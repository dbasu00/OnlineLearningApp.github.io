package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lesson {
	@Id
	int lessonId;
	String lessonName;
	String topics;
	String vlink;
	@ManyToOne
	Course course;
	public Lesson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lesson(int lessonId, String lessonName, String topics, String vlink, Course course) {
		super();
		this.lessonId = lessonId;
		this.lessonName = lessonName;
		this.topics = topics;
		this.vlink = vlink;
		this.course = course;
	}
	public int getLessonId() {
		return lessonId;
	}
	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	public String getTopics() {
		return topics;
	}
	public void setTopics(String topics) {
		this.topics = topics;
	}
	public String getVlink() {
		return vlink;
	}
	public void setVlink(String vlink) {
		this.vlink = vlink;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Lession [lessonId=" + lessonId + ", lessonName=" + lessonName + ", topics=" + topics + ", vlink="
				+ vlink + ", course=" + course + "]";
	}
	
	

}
