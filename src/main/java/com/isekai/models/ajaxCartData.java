package com.isekai.models;

public class ajaxCartData {
	private int price;
	private int delivery;
	private int total;
	
	
	
	public ajaxCartData() {
		super();
	}



	public ajaxCartData(int price, int delivery, int total) {
		super();
		this.price = price;
		this.delivery = delivery;
		this.total = total;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getDelivery() {
		return delivery;
	}



	public void setDelivery(int delivery) {
		this.delivery = delivery;
	}



	public int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}
	
}
