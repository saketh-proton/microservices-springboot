package com.example.commentservice.service;

import java.util.List;
import java.util.Optional;

import com.example.commentservice.model.Comments;

public interface CommentService {
	public List<Comments> getAllComments();
	public Comments insertComment(Comments comment);
	public String deleteComment(Comments comment);
	public Optional<Comments> findByCommentId(int cid);
	public List<Comments> findCommentsByPostId(int pid);
}
