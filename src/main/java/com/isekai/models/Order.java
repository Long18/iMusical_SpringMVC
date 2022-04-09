package com.isekai.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_id")
	private Integer id;
	
	@Column(name="order_code")
	private Integer code;
	
	@Column(name="order_export_date")
	private Date export_date;
	
	@Column(name="order_total_sum")
	private Integer total_sum;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	
	@Column(name="delivery_name")
	private String delivery_name;
	
	@Column(name="delivery_address")
	private String delivery_address;
	
	@Column(name="delivery_phone")
	private String delivery_phone;
	
	@Column(name="delivery_email")
	private String delivery_email;
	
	@Column(name="delivery_payment_method")
	private String delivery_payment_method;
	
	@Column(name="delivery_payment_status")
	private String delivery_payment_status;
	
	@Column(name="transport_fee")
	private Integer transport_fee;
	
	@Column(name="transport_type")
	private String transport_type;
	
	@CreationTimestamp
	@Column(name="created_at")
	private Date created_at;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="created_by")
	private User created_by;
	
	@Column(name="status")
	private Integer status;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "order")
	private List<OrderDetail> orderDetails;

	public Order() {
		super();
	}

	public Order(Integer id, Integer code, Date export_date, Integer total_sum, User user, String delivery_name,
			String delivery_address, String delivery_phone, String delivery_email, String delivery_payment_method,
			String delivery_payment_status, Integer transport_fee, String transport_type, Date created_at, User created_by,
			Integer status) {
		super();
		this.id = id;
		this.code = code;
		this.export_date = export_date;
		this.total_sum = total_sum;
		this.user = user;
		this.delivery_name = delivery_name;
		this.delivery_address = delivery_address;
		this.delivery_phone = delivery_phone;
		this.delivery_email = delivery_email;
		this.delivery_payment_method = delivery_payment_method;
		this.delivery_payment_status = delivery_payment_status;
		this.transport_fee = transport_fee;
		this.transport_type = transport_type;
		this.created_at = created_at;
		this.created_by = created_by;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Date getExport_date() {
		return export_date;
	}

	public void setExport_date(Date export_date) {
		this.export_date = export_date;
	}

	public Integer getTotal_sum() {
		return total_sum;
	}

	public void setTotal_sum(Integer total_sum) {
		this.total_sum = total_sum;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDelivery_name() {
		return delivery_name;
	}

	public void setDelivery_name(String delivery_name) {
		this.delivery_name = delivery_name;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}

	public String getDelivery_phone() {
		return delivery_phone;
	}

	public void setDelivery_phone(String delivery_phone) {
		this.delivery_phone = delivery_phone;
	}

	public String getDelivery_email() {
		return delivery_email;
	}

	public void setDelivery_email(String delivery_email) {
		this.delivery_email = delivery_email;
	}

	public String getDelivery_payment_method() {
		return delivery_payment_method;
	}

	public void setDelivery_payment_method(String delivery_payment_method) {
		this.delivery_payment_method = delivery_payment_method;
	}

	public String getDelivery_payment_status() {
		return delivery_payment_status;
	}

	public void setDelivery_payment_status(String delivery_payment_status) {
		this.delivery_payment_status = delivery_payment_status;
	}

	public Integer getTransport_fee() {
		return transport_fee;
	}

	public void setTransport_fee(Integer transport_fee) {
		this.transport_fee = transport_fee;
	}

	public String getTransport_type() {
		return transport_type;
	}

	public void setTransport_type(String transport_type) {
		this.transport_type = transport_type;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
}
