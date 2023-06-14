package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Comments;

public interface CommentsService {
	List<Comments> commentList();
	String addComment(Comments comment);
	

}
