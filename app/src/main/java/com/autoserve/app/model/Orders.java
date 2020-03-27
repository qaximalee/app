package com.autoserve.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import com.autoserve.app.enums.OrderStatus;
import com.autoserve.app.enums.PaymentStatus;
import com.autoserve.app.enums.Rating;

@Entity
public class Orders extends AuditModel{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Tables tables;
	
	@ManyToOne
	private Restaurant restaurant;
	
	@OneToMany
	private List<Item> items;
	
	@OneToMany
	private List<Deal> deals;
	
	@ManyToOne
	private User user;
	
	@Enumerated(EnumType.STRING)
	private Rating rating;
	
	@NotNull
	@Column
	private Double amount;
	
	@Null
	@Column
	private Double discountedAmount;
	
	@Enumerated(EnumType.STRING)
	private PaymentStatus paymentStatus;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;
	
	public Orders() {
		super();
	}

	public Orders(Long id, Tables tables, Restaurant restaurant, List<Item> items, List<Deal> deals, User user,
			Rating rating, Double amount, Double discountedAmount, PaymentStatus paymentStatus,
			OrderStatus orderStatus) {
		super();
		this.id = id;
		this.tables = tables;
		this.restaurant = restaurant;
		this.items = items;
		this.deals = deals;
		this.user = user;
		this.rating = rating;
		this.amount = amount;
		this.discountedAmount = discountedAmount;
		this.paymentStatus = paymentStatus;
		this.orderStatus = orderStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Tables getTables() {
		return tables;
	}

	public void setTables(Tables tables) {
		this.tables = tables;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getDiscountedAmount() {
		return discountedAmount;
	}

	public void setDiscountedAmount(Double discountedAmount) {
		this.discountedAmount = discountedAmount;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
}
