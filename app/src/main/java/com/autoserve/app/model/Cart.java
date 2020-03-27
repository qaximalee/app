package com.autoserve.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart extends AuditModel{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	
	private List<Item> items;
	
	private List<Deal> deals;
	
	private Restaurant restaurant;
	
	private Integer quantity;
	
	private Double amount;
	
	private Double totalAmmount;

	public Cart() {	}
	
	
}
