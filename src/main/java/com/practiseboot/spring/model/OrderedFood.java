package com.practiseboot.spring.model;

import javax.persistence.Embeddable;

@Embeddable
public class OrderedFood {
	
	private String name;
	private double price;
	private int rating;
	private String resId;
	
	public OrderedFood () {}
	
	public OrderedFood(String name, double price, int rating) {
		super();
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	
	
	

	public OrderedFood(String name, double price, int rating, String resId) {
		super();
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.resId = resId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}
	


}
