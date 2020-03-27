package com.autoserve.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cart extends AuditModel{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@OneToMany
	private List<Item> items;
	
	@OneToMany
	private List<Deal> deals;
	
	@ManyToOne
	private Restaurant restaurant;
	
	@Column
	private Integer quantity;
	
	@Column
	private Double amount;
	
	@Column
	private Double totalAmmount;

	public Cart() {	}

	public Cart(Long id, List<Item> items, List<Deal> deals, Restaurant restaurant, Integer quantity, Double amount,
			Double totalAmmount) {
		super();
		this.id = id;
		this.items = items;
		this.deals = deals;
		this.restaurant = restaurant;
		this.quantity = quantity;
		this.amount = amount;
		this.totalAmmount = totalAmmount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Deal> getDeals() {
		return deals;
	}

	public void setDeals(List<Deal> deals) {
		this.deals = deals;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getTotalAmmount() {
		return totalAmmount;
	}

	public void setTotalAmmount(Double totalAmmount) {
		this.totalAmmount = totalAmmount;
	}
}
