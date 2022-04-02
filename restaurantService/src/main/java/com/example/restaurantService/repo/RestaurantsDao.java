package com.example.restaurantService.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.restaurantService.model.Restaurants;

@Repository
@Transactional
public interface RestaurantsDao extends JpaRepository<Restaurants,Integer>{
	
	@Query("select r from Restaurants r where r.cid=?1")
	public List<Restaurants> findRestaurantsByCid(int cid);
}
