package com.example.commentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.commentservice.model.Comments;
import com.example.commentservice.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	CommentService service;
	
	@GetMapping("/all")
	public List<Comments> getAll(){
		return service.getAllComments();
	}
	
	@GetMapping("/search/post/{pid}")
	public List<Comments> findByPid(@PathVariable("pid") Integer pid){
		return service.findCommentsByPostId(pid);
	}
}
