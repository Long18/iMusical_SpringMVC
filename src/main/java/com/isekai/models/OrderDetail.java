package com.isekai.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_detail_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="product_id")
	private Product product;
	
	@Column(name="order_detail_price")
	private int order_detail_price;
	
	@Column(name="order_detail_quantity")
	private int order_detail_quantity;
	
	@Column(name="order_detail_price_sale")
	private int order_detail_price_sale;
	
	@Column(name="order_detail_total")
	private int order_detail_total;

	public OrderDetail() {
		super();
	}

	public OrderDetail(int id, Order order, Product product, int order_detail_price, int order_detail_quantity,
			int order_detail_price_sale, int order_detail_total) {
		super();
		this.id = id;
		this.order = order;
		this.product = product;
		this.order_detail_price = order_detail_price;
		this.order_detail_quantity = order_detail_quantity;
		this.order_detail_price_sale = order_detail_price_sale;
		this.order_detail_total = order_detail_total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getOrder_detail_price() {
		return order_detail_price;
	}

	public void setOrder_detail_price(int order_detail_price) {
		this.order_detail_price = order_detail_price;
	}

	public int getOrder_detail_quantity() {
		return order_detail_quantity;
	}

	public void setOrder_detail_quantity(int order_detail_quantity) {
		this.order_detail_quantity = order_detail_quantity;
	}

	public int getOrder_detail_price_sale() {
		return order_detail_price_sale;
	}

	public void setOrder_detail_price_sale(int order_detail_price_sale) {
		this.order_detail_price_sale = order_detail_price_sale;
	}

	public int getOrder_detail_total() {
		return order_detail_total;
	}

	public void setOrder_detail_total(int order_detail_total) {
		this.order_detail_total = order_detail_total;
	}

	
}
