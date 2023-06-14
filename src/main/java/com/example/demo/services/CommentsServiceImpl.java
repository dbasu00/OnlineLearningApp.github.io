package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Comments;
import com.example.demo.repository.CommentRepository;

@Service
public class CommentsServiceImpl implements CommentsService{

	@Autowired
	CommentRepository crepo;
	@Override
	public List<Comments> commentList() {
		return crepo.findAll();
	}

	@Override
	public String addComment(Comments comment) {
		crepo.save(comment);
		return "Comment Added";
	}

}
