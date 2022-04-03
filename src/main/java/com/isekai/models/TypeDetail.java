package com.isekai.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "types_detail")
public class TypeDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_detail_id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "type_id")
	private Type type;

	@Column(name = "type_detail_value")
	private String type_detail_value;

	public TypeDetail() {
		super();
	}

	public TypeDetail(int id, Product product, Type type, String type_detail_value) {
		super();
		this.id = id;
		this.product = product;
		this.type = type;
		this.type_detail_value = type_detail_value;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getType_detail_value() {
		return type_detail_value;
	}

	public void setType_detail_value(String type_detail_value) {
		this.type_detail_value = type_detail_value;
	}

	
}
