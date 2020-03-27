package com.autoserve.app.model;

import javax.persistence.Entity;

@Entity
public class Category extends AuditModel{

	private Long id;
	
	private String name;
}
