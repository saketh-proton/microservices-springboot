package com.example.postservice.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.postservice.model.CommentsDto;
import com.example.postservice.model.Posts;
import com.example.postservice.repo.PostsDao;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	PostsDao dao;
	
	public List<Posts> getAllPosts(){
		return dao.findAll();
	}
	
	public Posts insertPost(Posts post) {
		return dao.save(post);
	}
	
	public String deletePost(Posts post) {
		dao.delete(post);
		return "Post deleted..";
	}
	
	public Optional<Posts> findByPostId(int pid){
		return dao.findById(pid);
	}
	
	public List<Posts> searchPostsByAuthor(String author){
		List<Posts> posts = dao.findAll();
		List<Posts> data = new ArrayList();
		for(Posts p: posts) {
			if(p.getAuthor().equals(author))
				data.add(p);
		}
		return data;
	}
	
	public List<Posts> searchPostsByTitle(String title){
		List<Posts> posts = dao.findAll();
		List<Posts> data = new ArrayList();
		for(Posts p: posts) {
			if(p.getTitle().equals(title))
				data.add(p);
		}
		return data;
	}

	@Override
	public List<CommentsDto> searchCommentsByPid(int pid) {
		// TODO Auto-generated method stub
		return template.getForObject("http://COMMENT-SERVICE/comments/search/post/"+pid, List.class);
		
	}

	@Override
	public List<String> searchAuthorsByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.searchAuthorsByTitle(title);
	}
	
	
}
