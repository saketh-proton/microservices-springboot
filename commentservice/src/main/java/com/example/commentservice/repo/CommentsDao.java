package com.example.commentservice.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.commentservice.model.Comments;

@Repository
@Transactional
public interface CommentsDao extends JpaRepository<Comments,Integer>{
	
	@Query("select c from Comments c where c.pid=?1")
	public List<Comments> findCommentsByPid(int pid);
	
}
