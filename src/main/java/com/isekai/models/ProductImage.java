package com.isekai.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_img")
public class ProductImage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_img_id")
	private int id;
	
	@Column(name="product_id")
	private int product;
	
	@Column(name="product_img_name")
	private int product_img_name;
	
	@Column(name="product_img_type")
	private int product_img_type;

	public ProductImage() {
		super();
	}

	public ProductImage(int id, int product, int product_img_name, int product_img_type) {
		super();
		this.id = id;
		this.product = product;
		this.product_img_name = product_img_name;
		this.product_img_type = product_img_type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public int getProduct_img_name() {
		return product_img_name;
	}

	public void setProduct_img_name(int product_img_name) {
		this.product_img_name = product_img_name;
	}

	public int getProduct_img_type() {
		return product_img_type;
	}

	public void setProduct_img_type(int product_img_type) {
		this.product_img_type = product_img_type;
	}
	
	
	
}
