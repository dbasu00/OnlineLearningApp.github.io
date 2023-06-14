package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserDemo;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository urepo;

	@Override
	public String addUser(UserDemo u) {
		urepo.save(u);
		return "Student Added Successfully";
	}

	@Override
	public boolean checkEmail(String email) {
		return urepo.existsByEmail(email);
	}

	@Override
	public boolean validate(String email, String password) {
		if(urepo.existsByEmail(email)) {
			UserDemo u=urepo.getByEmail(email);
			String dbPassword=u.getPassword();
			if(password.equals(dbPassword)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	@Override
	public String getUserRole(String email) {
		UserDemo u=urepo.getByEmail(email);
		return u.getRole();
	}

}
