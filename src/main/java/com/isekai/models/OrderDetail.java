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
@Table(name = "order_details")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_detail_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="product_id")
	private Product product;
	
	@Column(name="order_detail_price")
	private Integer order_detail_price;
	
	@Column(name="order_detail_quantity")
	private Integer order_detail_quantity;
	
	@Column(name="order_detail_price_sale")
	private Integer order_detail_price_sale;
	
	@Column(name="order_detail_total")
	private Integer order_detail_total;

	public OrderDetail() {
		super();
	}

	public OrderDetail(Integer id, Order order, Product product, Integer order_detail_price, Integer order_detail_quantity,
			Integer order_detail_price_sale, Integer order_detail_total) {
		super();
		this.id = id;
		this.order = order;
		this.product = product;
		this.order_detail_price = order_detail_price;
		this.order_detail_quantity = order_detail_quantity;
		this.order_detail_price_sale = order_detail_price_sale;
		this.order_detail_total = order_detail_total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getOrder_detail_price() {
		return order_detail_price;
	}

	public void setOrder_detail_price(Integer order_detail_price) {
		this.order_detail_price = order_detail_price;
	}

	public Integer getOrder_detail_quantity() {
		return order_detail_quantity;
	}

	public void setOrder_detail_quantity(Integer order_detail_quantity) {
		this.order_detail_quantity = order_detail_quantity;
	}

	public Integer getOrder_detail_price_sale() {
		return order_detail_price_sale;
	}

	public void setOrder_detail_price_sale(Integer order_detail_price_sale) {
		this.order_detail_price_sale = order_detail_price_sale;
	}

	public Integer getOrder_detail_total() {
		return order_detail_total;
	}

	public void setOrder_detail_total(Integer order_detail_total) {
		this.order_detail_total = order_detail_total;
	}

	public String getTotalSum() {
		if(this.order_detail_price_sale == null) {
			return order_detail_price*order_detail_quantity + "";
		}else {
			return order_detail_price_sale*order_detail_quantity + "";
		}
	}
}
