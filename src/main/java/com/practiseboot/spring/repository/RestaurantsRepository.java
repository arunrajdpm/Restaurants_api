package com.practiseboot.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practiseboot.spring.model.Restaurants;

public interface RestaurantsRepository extends JpaRepository<Restaurants, Long> {
	
	List<Restaurants> findAll();

}
