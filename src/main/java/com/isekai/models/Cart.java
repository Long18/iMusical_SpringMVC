package com.isekai.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@EmbeddedId
	private CartId cartId;


	@Column(name = "value")
	private Integer value;
	
	@Column(name = "isSelected")
	private int isSelected;

	public Cart() {
		super();
	}

	public Cart(CartId cartId, Integer value, int isSelected) {
		super();
		this.cartId = cartId;
		this.value = value;
		this.isSelected = isSelected;
	}

	public CartId getCartId() {
		return cartId;
	}

	public void setCartId(CartId cartId) {
		this.cartId = cartId;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Boolean getIsSelected() {
		return isSelected == 1?true:false;
	}

	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected?1:0;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
