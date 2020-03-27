package com.autoserve.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import com.autoserve.app.enums.Active;

@Entity
public class Deal extends AuditModel{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Null
	@Column(name="banner_image")
	private String bannerImage;
	
	@NotBlank
	@Size(min=5, max=20)
	private String name;
	
	@Null
	@Size(max=150)
	@Column
	private String description;
	
	@Column
	private Restaurant restaurant;
	
	@OneToMany
	private List<Item> items;
	
	@NotNull
	@Column
	private Double price;
	
	@Null
	@Column
	private Double discountedPrice;
	
	@Null
	@Column
	private Favorite favorite;
	
	@Null
	@Column
	private Date activeTill;
	
	@Enumerated(EnumType.STRING)
	private Active active;

	public Deal() {}

	public Deal(Long id, @Null String bannerImage, @NotBlank @Size(min = 5, max = 20) String name,
			@Null @Size(max = 150) String description, Restaurant restaurant, List<Item> items, @NotNull Double price,
			@Null Double discountedPrice, @Null Favorite favorite, @Null Date activeTill, Active active) {
		super();
		this.id = id;
		this.bannerImage = bannerImage;
		this.name = name;
		this.description = description;
		this.restaurant = restaurant;
		this.items = items;
		this.price = price;
		this.discountedPrice = discountedPrice;
		this.favorite = favorite;
		this.activeTill = activeTill;
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBannerImage() {
		return bannerImage;
	}

	public void setBannerImage(String bannerImage) {
		this.bannerImage = bannerImage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(Double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public Favorite getFavorite() {
		return favorite;
	}

	public void setFavorite(Favorite favorite) {
		this.favorite = favorite;
	}

	public Date getActiveTill() {
		return activeTill;
	}

	public void setActiveTill(Date activeTill) {
		this.activeTill = activeTill;
	}

	public Active getActive() {
		return active;
	}

	public void setActive(Active active) {
		this.active = active;
	}
}
