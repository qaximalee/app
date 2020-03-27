package com.autoserve.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import com.autoserve.app.enums.Active;

@Entity
public class Restaurant extends AuditModel{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Null
	@Column(name="image_url")
	private String imageUrl;
	
	@NotBlank
	@Size(max=50)
	@Column
	private String name;
	
	@Null
	@Column
	private String latitude;
	
	@Null
	@Column
	private String longitude;
	
	@NotBlank
	@Column(name="address_1")
	private String address1;
	
	@NotBlank
	@Column(name="address_2")
	private String address2;
	
	@NotBlank
	@Column
	private String city;
	
	@NotBlank
	@Column
	private String province;
	
	@NotBlank
	@Column
	private String country;
	
	@Null
	@Column(name="phone_1")
	private String phone1;
	
	@Null
	@Column(name="phone_2")
	private String phone2;
	
	@NotBlank
	@Column
	private String email;
	
	@Null
	@Column
	private String website;
	
	@Enumerated(EnumType.STRING)
	private Active active;
	
	public Restaurant() { }

	public Restaurant(Long id, @Null String imageUrl, @NotBlank @Size(max = 50) String name, @Null String latitude,
			@Null String longitude, @NotBlank String address1, @NotBlank String address2, @NotBlank String city,
			@NotBlank String province, @NotBlank String country, @Null String phone1, @Null String phone2,
			@NotBlank String email, @Null String website, Active active) {
		super();
		this.id = id;
		this.imageUrl = imageUrl;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.province = province;
		this.country = country;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.email = email;
		this.website = website;
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Active getActive() {
		return active;
	}

	public void setActive(Active active) {
		this.active = active;
	}
}
