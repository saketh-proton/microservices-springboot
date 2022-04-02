package com.example.restaurantService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.restaurantService.model.Restaurants;
import com.example.restaurantService.service.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
	
	@Autowired
	RestaurantService service;
	
	@GetMapping("/all")
	public List<Restaurants> getAll(){
		return service.getAllRestaurants();
	}
	
	@GetMapping("search/customer/{cid}")
	public List<Restaurants> findByCid(@PathVariable("cid") Integer cid){
		return service.findRestaurantsByCustomerId(cid);
	}
}