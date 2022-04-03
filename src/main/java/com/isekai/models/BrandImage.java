package com.isekai.models;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "brand_images")
public class BrandImage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="brand_image_id")
	private int id;
	
	@Column(name="brand_image_url")
	private String imageURL;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "brand_id")
	private Brand Brand;
	
	@Column(name="status")
	private int status;

	public BrandImage() {
		super();
	}

	public BrandImage(int id, String imageURL, com.isekai.models.Brand brand, int status) {
		super();
		this.id = id;
		this.imageURL = imageURL;
		Brand = brand;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public Brand getBrand() {
		return Brand;
	}

	public void setBrand(Brand brand) {
		Brand = brand;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
}
