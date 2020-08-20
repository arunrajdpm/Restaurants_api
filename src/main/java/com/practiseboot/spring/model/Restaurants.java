package com.practiseboot.spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Restaurants {
	
	 @Id
	 @GeneratedValue
     private long resId;
	 
	 @Column
	 private String restName;
	 
	 @Column
	 @ElementCollection
	 private List<Foods> foodList =  new ArrayList<Foods>();;
	 
	 @Column
	 private int resRating;
	 
	 @Column
	 private String resDest;
	 
	 public Restaurants () {
		 
	 }

	public Restaurants( String restName, List<Foods> foodList, int resRating, String resDest) {
		super();
		
		this.restName = restName;
		this.foodList = foodList;
		this.resRating = resRating;
		this.resDest = resDest;
	}



	public long getResId() {
		return resId;
	}

	public void setResId(long resId) {
		this.resId = resId;
	}

	public String getRestName() {
		return restName;
	}

	public void setRestName(String restName) {
		this.restName = restName;
	}

	public List<Foods> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<Foods> foodList) {
		this.foodList = foodList;
	}

	public int getResRating() {
		return resRating;
	}

	public void setResRating(int resRating) {
		this.resRating = resRating;
	}

	public String getResDest() {
		return resDest;
	}

	public void setResDest(String resDest) {
		this.resDest = resDest;
	}
	 
}
