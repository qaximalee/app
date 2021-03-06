package com.autoserve.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.autoserve.app.enums.Active;


@Entity
public class Tables extends AuditModel{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	// 0 for Ground, 1 for 1st floor, ...
	@NotNull
	@Column
	private Integer floor;
	
	@NotNull
	@Column
	private Integer tableNo;
	
	@ManyToOne
	private Restaurant restaurant;
	
	@Enumerated(EnumType.STRING)
	private Active active;
	
	public Tables() { }

	public Tables(Long id, @NotNull Integer floor, @NotNull Integer tableNo, Restaurant restaurant, Active active) {
		super();
		this.id = id;
		this.floor = floor;
		this.tableNo = tableNo;
		this.restaurant = restaurant;
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public Integer getTableNo() {
		return tableNo;
	}

	public void setTableNo(Integer tableNo) {
		this.tableNo = tableNo;
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
