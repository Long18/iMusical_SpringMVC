package com.isekai.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_img")
public class ProductImage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_img_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	@Column(name="product_img_name")
	private String product_img_name;
	
	@Column(name="product_img_type")
	private String product_img_type;

	public ProductImage() {
		super();
	}

	public ProductImage(Integer id, Product product, String product_img_name, String product_img_type) {
		super();
		this.id = id;
		this.product = product;
		this.product_img_name = product_img_name;
		this.product_img_type = product_img_type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getProduct_img_name() {
		return product_img_name;
	}

	public void setProduct_img_name(String product_img_name) {
		this.product_img_name = product_img_name;
	}

	public String getProduct_img_type() {
		return product_img_type;
	}

	public void setProduct_img_type(String product_img_type) {
		this.product_img_type = product_img_type;
	}

	
}
