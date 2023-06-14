package com.example.demo.services;

import com.example.demo.entity.UserDemo;

public interface UserService {
	//Adding user
	String addUser(UserDemo u);
	//Checking email
	boolean checkEmail(String email);
	//validating user
	boolean validate(String email,String password);
	//String get role by providing email
	String getUserRole(String email);
	
}
