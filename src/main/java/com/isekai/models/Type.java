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
@Table(name = "types")
public class Type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_id")
	private int id;

	@Column(name = "type_name")
	private String type_name;

	@Column(name = "type_slug")
	private String type_slug;

	@Column(name = "type_image_url")
	private String type_image_url;

	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Type parent;

	@Column(name = "type_meta_key")
	private String type_meta_key;

	@Column(name = "type_meta_desc")
	private String type_meta_desc;

	@CreationTimestamp
	@Column(name = "create_at")
	private Date create_at;
	
	@ManyToOne
	@JoinColumn(name = "create_by")
	private User create_by;
	

	@Column(name = "status")
	private int status;
	
	@OneToMany(mappedBy = "type")
	private List<TypeDetail> typeDetails;
	

	public Type() {
		super();
	}


	public Type(int id, String type_name, String type_slug, String type_image_url, Type parent, String type_meta_key,
			String type_meta_desc, Date create_at, User create_by, int status, List<TypeDetail> typeDetails) {
		super();
		this.id = id;
		this.type_name = type_name;
		this.type_slug = type_slug;
		this.type_image_url = type_image_url;
		this.parent = parent;
		this.type_meta_key = type_meta_key;
		this.type_meta_desc = type_meta_desc;
		this.create_at = create_at;
		this.create_by = create_by;
		this.status = status;
		this.typeDetails = typeDetails;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType_name() {
		return type_name;
	}


	public void setType_name(String type_name) {
		this.type_name = type_name;
	}


	public String getType_slug() {
		return type_slug;
	}


	public void setType_slug(String type_slug) {
		this.type_slug = type_slug;
	}


	public String getType_image_url() {
		return type_image_url;
	}


	public void setType_image_url(String type_image_url) {
		this.type_image_url = type_image_url;
	}


	public Type getParent() {
		return parent;
	}


	public void setParent(Type parent) {
		this.parent = parent;
	}


	public String getType_meta_key() {
		return type_meta_key;
	}


	public void setType_meta_key(String type_meta_key) {
		this.type_meta_key = type_meta_key;
	}


	public String getType_meta_desc() {
		return type_meta_desc;
	}


	public void setType_meta_desc(String type_meta_desc) {
		this.type_meta_desc = type_meta_desc;
	}


	public Date getCreate_at() {
		return create_at;
	}


	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}


	public User getCreate_by() {
		return create_by;
	}


	public void setCreate_by(User create_by) {
		this.create_by = create_by;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public List<TypeDetail> getTypeDetails() {
		return typeDetails;
	}


	public void setTypeDetails(List<TypeDetail> typeDetails) {
		this.typeDetails = typeDetails;
	}

	
	
	
}
