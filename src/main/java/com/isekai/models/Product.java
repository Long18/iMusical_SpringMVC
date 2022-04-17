package com.isekai.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Integer id;

	@Column(name = "product_name")
	private String name;

	@Column(name = "product_detail")
	private String detail;

	@Column(name = "product_price")
	private Integer price = -1;

	@Column(name = "product_sale_price")
	private Integer priceSale = -1;

	@Column(name = "product_end_sale")
	private Date endSale;

	@Column(name = "product_note")
	private String note;

	@CreationTimestamp
	@Column(name = "created_at")
	private Date created_at;

	@ManyToOne
	@JoinColumn(name = "created_by", referencedColumnName = "user_id")// join to product.created_by from user.user_id
	private User created_by;

	@ManyToOne
	@JoinColumn(name = "brand_id", referencedColumnName = "brand_id")
	private Brand brand;

	@ManyToOne
	@JoinColumn(name = "category_id", referencedColumnName = "type_id")
	private Type category;

	@Column(name = "product_amount")
	private Integer amount;

	@Column(name = "status")
	private Integer status;
	
	@OneToMany( mappedBy = "product")
	private List<TypeDetail> typeDetails;

	
	@OneToMany( mappedBy = "product")
	private List<ProductImage> productImages;

	public Product() {
		super();
	}

	public Product(Integer id, String name, String detail, Integer price, Integer priceSale, Date endSale, String note,
			Date created_at, User created_by, Brand brand, Type category, Integer amount, Integer status,
			List<TypeDetail> typeDetails, List<ProductImage> productImages) {
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
		this.typeDetails = typeDetails;
		this.productImages = productImages;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getPriceSale() {
		return priceSale;
	}

	public void setPriceSale(Integer priceSale) {
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

	public User getCreated_by() {
		return created_by;
	}

	public void setCreated_by(User created_by) {
		this.created_by = created_by;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Type getCategory() {
		return category;
	}

	public void setCategory(Type category) {
		this.category = category;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<TypeDetail> getTypeDetails() {
		return typeDetails;
	}

	public void setTypeDetails(List<TypeDetail> typeDetails) {
		this.typeDetails = typeDetails;
	}

	public List<ProductImage> getProductImages() {
		return productImages;
	}

	public void setProductImages(List<ProductImage> productImages) {
		this.productImages = productImages;
	}

	
}
