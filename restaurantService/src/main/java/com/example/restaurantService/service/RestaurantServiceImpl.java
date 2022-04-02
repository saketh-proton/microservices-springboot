package com.example.restaurantService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restaurantService.model.Restaurants;
import com.example.restaurantService.repo.RestaurantsDao;

@Service
public class RestaurantServiceImpl implements RestaurantService{
	
	@Autowired
	RestaurantsDao dao;

	@Override
	public List<Restaurants> getAllRestaurants() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Restaurants insertRestaurant(Restaurants restaurant) {
		// TODO Auto-generated method stub
		return dao.save(restaurant);
	}

	@Override
	public String deleteRestaurant(Restaurants restaurant) {
		// TODO Auto-generated method stub
		dao.delete(restaurant);
		return "Restaurant deleted!!";
	}

	@Override
	public Optional<Restaurants> findByRestaurantId(int rid) {
		// TODO Auto-generated method stub
		return dao.findById(rid);
	}

	@Override
	public List<Restaurants> findRestaurantsByCustomerId(int cid) {
		// TODO Auto-generated method stub
		return dao.findRestaurantsByCid(cid);
	}
	
	
}
