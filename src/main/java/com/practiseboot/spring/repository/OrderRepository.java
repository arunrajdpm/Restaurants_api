package com.practiseboot.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practiseboot.spring.model.Order;
import com.practiseboot.spring.model.Restaurants;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	List<Order> findAll();

}
