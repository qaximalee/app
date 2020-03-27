package com.autoserve.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import com.autoserve.app.enums.Active;

@Entity
public class Item extends AuditModel{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name="item_image_url")
    private String itemImageUrl;
	
	@NotBlank
	@Size(max=50)
	@Column
	private String name;
	
	@NotNull
	@ManyToOne
	private Restaurant restaurant;
	
	@Null
	@Size(max=150)
	@Column
	private String description;

	@ManyToOne
	private Category category;
	
	@OneToOne
	@JoinColumn
	private Favorite favorite;
	
	@Enumerated(EnumType.STRING)
	private Active active;
	
	@NotNull
	@Column
	private Double price;
	
	@Null
	@Column
	private Double discountedPrice;

	public Item() {	}

	public Item(Long id, @NotBlank String itemImageUrl, @NotBlank @Size(max = 50) String name,
			@NotNull Restaurant restaurant, @Null @Size(max = 150) String description, Category category,
			Favorite favorite, Active active, @NotNull Double price, @Null Double discountedPrice) {
		super();
		this.id = id;
		this.itemImageUrl = itemImageUrl;
		this.name = name;
		this.restaurant = restaurant;
		this.description = description;
		this.category = category;
		this.favorite = favorite;
		this.active = active;
		this.price = price;
		this.discountedPrice = discountedPrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemImageUrl() {
		return itemImageUrl;
	}

	public void setItemImageUrl(String itemImageUrl) {
		this.itemImageUrl = itemImageUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Favorite getFavorite() {
		return favorite;
	}

	public void setFavorite(Favorite favorite) {
		this.favorite = favorite;
	}

	public Active getActive() {
		return active;
	}

	public void setActive(Active active) {
		this.active = active;
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
}
