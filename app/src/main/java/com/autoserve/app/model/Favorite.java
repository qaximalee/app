package com.autoserve.app.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.autoserve.app.enums.Active;

@Entity
public class Favorite extends AuditModel{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(nullable=true)
	private Item item;
	
	@OneToOne
	@JoinColumn(nullable=true)
	private Deal deal;
	
	@OneToOne
	@JoinColumn(nullable=false)
	private User user;
	
	@OneToOne
	@JoinColumn(nullable=false)
	private Restaurant restaurant;
	
	@Enumerated(EnumType.STRING)
	private Active active;
	
	public Favorite() { }

	public Favorite(Long id, Item item, Deal deal, User user, Restaurant restaurant, Active active) {
		super();
		this.id = id;
		this.item = item;
		this.deal = deal;
		this.user = user;
		this.restaurant = restaurant;
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Deal getDeal() {
		return deal;
	}

	public void setDeal(Deal deal) {
		this.deal = deal;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Active getActive() {
		return active;
	}

	public void setActive(Active active) {
		this.active = active;
	}
}
