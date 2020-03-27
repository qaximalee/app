package com.autoserve.app.model;

import com.autoserve.app.enums.Active;

public class Item {

	private Long id;
	
    private String itemImage;
	
	private String name;
	
	private Restaurant restaurant;
	
	private String description;
	
	private Category category;
	
	private Favourite favourite;
	
	private Active active;
	
	private Double price;
	
	private Double discountedPrice;

	public Item() {	}
	
	
}
