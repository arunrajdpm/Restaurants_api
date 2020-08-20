package com.practiseboot.spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.sun.istack.NotNull;

@Entity
public class Order {
	
	@Id
	@GeneratedValue
	private long orderId;
	
	@ElementCollection
	private List<Foods> listOfFood =   new ArrayList<Foods>();;
	
	
	private String user;
	
	
	
	

}
