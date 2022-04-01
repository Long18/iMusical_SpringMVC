package com.isekai.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name="brand_id")
	private int createdAt;
	
	@Column(name="status")
	private int status;

	public BrandImage() {
		super();
	}

	public BrandImage(int id, String imageURL, int createdAt, int status) {
		super();
		this.id = id;
		this.imageURL = imageURL;
		this.createdAt = createdAt;
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

	public int getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(int createdAt) {
		this.createdAt = createdAt;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
