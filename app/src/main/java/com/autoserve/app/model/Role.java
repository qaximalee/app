package com.autoserve.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.autoserve.app.enums.RollType;

@Entity
public class Role extends AuditModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@OneToOne(mappedBy = "role")
	private User user;
	
	@Enumerated(EnumType.STRING)
	@Column(name="role_type")
	private RollType roleType;

	
	public Role() {	}
}
