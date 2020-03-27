package com.autoserve.app.model;

import java.util.Date;
import java.util.List;

import com.autoserve.app.enums.Active;

public class Deal {

	private Long id;
	
	private String bannerImage;
	
	private String name;
	
	private String description;
	
	private Restaurant restaurant;
	
	private List<Item> items;
	
	private Double price;
	
	private Double discountedPrice;
	
	private Favourite favourite;
	
	private Date activeTill;
	
	private Active active;

	public Deal() {}
	
	
}
