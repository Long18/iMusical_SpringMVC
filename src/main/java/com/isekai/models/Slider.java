package com.isekai.models;

import java.util.Date;

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

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "sliders")
public class Slider {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "slider_id")
	private int id;

	@Column(name = "slider_name")
	private String slider_name;
	
	@Column(name = "slider_url")
	private String slider_url;
	
	@Column(name = "slider_position")
	private String slider_position;
	
	@Column(name = "slider_img_url")
	private String slider_img_url;
	
	@CreationTimestamp
	@Column(name = "created_at")
	private Date created_at;
	
	@ManyToOne
	@JoinColumn(name = "created_by", insertable = true)
	private User created_by;

	@Column(name = "status")
	private int status;

	public Slider() {
		super();
	}

	public Slider(int id, String slider_name, String slider_url, String slider_position, String slider_img_url,
			Date created_at, User created_by, int status) {
		super();
		this.id = id;
		this.slider_name = slider_name;
		this.slider_url = slider_url;
		this.slider_position = slider_position;
		this.slider_img_url = slider_img_url;
		this.created_at = created_at;
		this.created_by = created_by;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSlider_name() {
		return slider_name;
	}

	public void setSlider_name(String slider_name) {
		this.slider_name = slider_name;
	}

	public String getSlider_url() {
		return slider_url;
	}

	public void setSlider_url(String slider_url) {
		this.slider_url = slider_url;
	}

	public String getSlider_position() {
		return slider_position;
	}

	public void setSlider_position(String slider_position) {
		this.slider_position = slider_position;
	}

	public String getSlider_img_url() {
		return slider_img_url;
	}

	public void setSlider_img_url(String slider_img_url) {
		this.slider_img_url = slider_img_url;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
