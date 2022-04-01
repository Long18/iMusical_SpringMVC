package com.isekai.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

	@Column(name = "parent_id")
	private String parent_id;

	@Column(name = "type_meta_key")
	private String type_meta_key;

	@Column(name = "type_meta_desc")
	private int type_meta_desc;

	@Column(name = "create_at")
	private Date create_at;
	
	@Column(name = "create_by")
	private int create_by;

	@Column(name = "status")
	private int status;

	public Type() {
		super();
	}

	public Type(int id, String type_name, String type_slug, String type_image_url, String parent_id,
			String type_meta_key, int type_meta_desc, Date create_at, int create_by, int status) {
		super();
		this.id = id;
		this.type_name = type_name;
		this.type_slug = type_slug;
		this.type_image_url = type_image_url;
		this.parent_id = parent_id;
		this.type_meta_key = type_meta_key;
		this.type_meta_desc = type_meta_desc;
		this.create_at = create_at;
		this.create_by = create_by;
		this.status = status;
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

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public String getType_meta_key() {
		return type_meta_key;
	}

	public void setType_meta_key(String type_meta_key) {
		this.type_meta_key = type_meta_key;
	}

	public int getType_meta_desc() {
		return type_meta_desc;
	}

	public void setType_meta_desc(int type_meta_desc) {
		this.type_meta_desc = type_meta_desc;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

	public int getCreate_by() {
		return create_by;
	}

	public void setCreate_by(int create_by) {
		this.create_by = create_by;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
}
