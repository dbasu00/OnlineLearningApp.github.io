package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserDemo;

public interface UserRepository extends JpaRepository<UserDemo, Integer>{
	boolean existsByEmail(String email);
	
	UserDemo getByEmail(String email);
	
}
