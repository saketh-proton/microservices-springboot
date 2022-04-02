package com.example.postservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.postservice.model.CommentsDto;

@FeignClient(name="comment-service", url="http://localhost:8082/comments/")
public interface PostFeignProxy {
	
		
		@GetMapping("/search/post/{pid}")
		public List<CommentsDto> findByPid(@PathVariable("pid") int pid);
			

	


}
