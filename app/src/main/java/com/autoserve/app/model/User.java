package com.autoserve.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import com.autoserve.app.enums.Active;
import com.autoserve.app.enums.Gender;

@Entity
public class User extends AuditModel{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@Size(min=5, max=20)
	@Column(name="first_name", nullable=false)
	private String firstName;
	
	@Size(min=5, max=20)
	@Column(name="last_name", nullable=true)
	private String lastName;
	
	@Size(min=5, max=40)
	@Column(name="full_name", nullable=false)
	private String fullName;
	
	@Null
	@Column(name="nic")
	@Size(min=13, max=15)
	private String NIC;
	
	@NotNull
	@Column
	private String email;
	
	@NotNull
	@Column
	private String password;
	
	@Null
	@Column
	private String phone;
	
	@Enumerated(EnumType.STRING)
	@Column
	private Gender gender;
	
	@OneToOne
    @JoinColumn(name = "address_id")
	private Address address;
	
	@OneToOne
    @JoinColumn(name = "role_id")
	private Role role;
	
	@Column(name="image_url", nullable=true  )
	private String imageUrl;
	
	@Enumerated(EnumType.STRING)
	@Column
	private Active active;

	public User() {	}

	public User(Long id, @Size(min = 5, max = 20) String firstName, @Size(min = 5, max = 20) String lastName,
			@Size(min = 5, max = 40) String fullName, @Null @Size(min = 13, max = 15) String nIC, @NotNull String email,
			@NotNull String password, @Null String phone, Gender gender, Address address, Role role, String imageUrl,
			Active active) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		NIC = nIC;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
		this.role = role;
		this.imageUrl = imageUrl;
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNIC() {
		return NIC;
	}

	public void setNIC(String nIC) {
		NIC = nIC;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Active getActive() {
		return active;
	}

	public void setActive(Active active) {
		this.active = active;
	}
}
