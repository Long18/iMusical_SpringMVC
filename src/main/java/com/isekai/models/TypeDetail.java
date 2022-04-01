package com.isekai.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "types_detail")
public class TypeDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_detail_id")
	private int id;

	@Column(name = "product_id")
	private int product_id;

	@Column(name = "type_id")
	private int type_id;

	@Column(name = "type_detail_value")
	private String type_detail_value;

	public TypeDetail() {
		super();
	}

	public TypeDetail(int id, int product_id, int type_id, String type_detail_value) {
		super();
		this.id = id;
		this.product_id = product_id;
		this.type_id = type_id;
		this.type_detail_value = type_detail_value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public String getType_detail_value() {
		return type_detail_value;
	}

	public void setType_detail_value(String type_detail_value) {
		this.type_detail_value = type_detail_value;
	}

	
	
}
