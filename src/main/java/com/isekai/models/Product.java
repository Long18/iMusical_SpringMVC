package com.isekai.models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	
	@Column(name="product_name")
	private String name;
	
	@Column(name="product_detail")
	private String detail;
	
	@Column(name="product_price")
	private String price;
	
	@Column(name="product_sale_price")
	private String priceSale;
	
	@Column(name="product_end_sale")
	private Date endSale;
	
	@Column(name="product_note")
	private String note;
	
	@Column(name="created_at")
	private Date created_at;
	
	@Column(name="created_by")
	private int created_by;
	
	@Column(name="brand_id")
	private int brand;
	
	@Column(name="category_id")
	private int category;
	
	@Column(name="product_amount")
	private int amount;
	
	@Column(name="status")
	private int status;
	
	

	public Product() {
		super();
	}

	public Product(int id, String name, String detail, String price, String priceSale, Date endSale, String note,
			Date created_at, int created_by, int brand, int category, int amount, int status) {
		super();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.price = price;
		this.priceSale = priceSale;
		this.endSale = endSale;
		this.note = note;
		this.created_at = created_at;
		this.created_by = created_by;
		this.brand = brand;
		this.category = category;
		this.amount = amount;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPriceSale() {
		return priceSale;
	}

	public void setPriceSale(String priceSale) {
		this.priceSale = priceSale;
	}

	public Date getEndSale() {
		return endSale;
	}

	public void setEndSale(Date endSale) {
		this.endSale = endSale;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public int getBrand() {
		return brand;
	}

	public void setBrand(int brand) {
		this.brand = brand;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
