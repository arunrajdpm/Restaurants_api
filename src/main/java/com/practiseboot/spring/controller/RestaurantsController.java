package com.practiseboot.spring.controller;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practiseboot.spring.model.Foods;
import com.practiseboot.spring.model.Order;
import com.practiseboot.spring.model.Restaurants;
import com.practiseboot.spring.repository.OrderRepository;
import com.practiseboot.spring.repository.RestaurantsRepository;

@RestController
@CrossOrigin
public class RestaurantsController {
	
	@Autowired
	RestaurantsRepository resRepo;
	
	@Autowired
	OrderRepository orderRepo;

	
	@GetMapping("/")
	public List<Restaurants> getRes() {
		
		
		return resRepo.findAll();
	}
	
	
	
	@GetMapping("/{filterBy}")
	public List<Restaurants> getResFilter(@PathVariable() String filterBy) {
		
		Predicate<Restaurants> filterByPredicate;
		
		if(filterBy.matches("\\d+")) {	 
			filterByPredicate = res -> res.getResRating() == Integer.valueOf(filterBy).intValue();
		} else {
			filterByPredicate = res -> res.getRestName().toLowerCase().contains(filterBy.toLowerCase());
		}
		
		
		return resRepo.findAll().stream().filter(filterByPredicate).collect(Collectors.toList());
	}
	
	@PostMapping("/order")
	public String postBody(@RequestBody Order order) {
		
		orderRepo.save(order);
		return "order Placed";
	}
	
	
	
	
}
