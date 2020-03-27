package com.autoserve.app.model;

import com.autoserve.app.enums.Active;

public class Tables {

	private Long id;
	
	// 0 for Ground, 1 for 1st floor, ...
	private Integer floor;
	
	private Integer tableNo;
	
	private Restaurant restaurant;
	
	private Active active;
	
	public Tables() { }
}
