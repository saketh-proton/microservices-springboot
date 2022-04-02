package com.example.restaurantService.service;

import java.util.List;
import java.util.Optional;

import com.example.restaurantService.model.Restaurants;

public interface RestaurantService {
	
	public List<Restaurants> getAllRestaurants();
	public Restaurants insertRestaurant(Restaurants restaurant);
	public String deleteRestaurant(Restaurants restaurant);
	public Optional<Restaurants> findByRestaurantId(int rid);
	public List<Restaurants> findRestaurantsByCustomerId(int cid);
}
