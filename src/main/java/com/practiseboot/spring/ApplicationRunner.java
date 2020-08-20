package com.practiseboot.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practiseboot.spring.model.Foods;
import com.practiseboot.spring.model.Restaurants;
import com.practiseboot.spring.repository.RestaurantsRepository;



/*
In Spring Boot, a class that implements CommandLineRunner
is executed after the application is bootstrapped
 */

@Component
public class ApplicationRunner implements CommandLineRunner {

	@Autowired
	RestaurantsRepository resRepo;
	

    @Override
    public void run(String... args) throws Exception {

    	resRepo.save(new Restaurants( "rest1", List.of(new Foods("Idly", 15, 2)), 3, "chennai"));
		resRepo.save(new Restaurants( "Food Paradise", List.of(new Foods("Briyani", 65, 7)), 3, "chennai"));
		resRepo.save(new Restaurants( "Fine Dinner", List.of(new Foods("Dosa", 5, 10), new Foods("Puri", 25, 6)), 6, "chennai"));
		
        System.out.println("Application started...");
    }
}
