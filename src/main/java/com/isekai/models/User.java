package com.isekai.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int id;

	@Column(name = "user_name")
	private String user_name;

	@Column(name = "user_email")
	private String user_email;
	
	@Column(name = "email_verified_at")
	private Date email_verified_at;

	@Column(name = "password")
	private String password;
	
	@Column(name = "remember_token")
	private String remember_token;

	@Column(name = "created_at")
	private Date created_at;
	
	@Column(name = "updated_at")
	private String updated_at;
	
	@Column(name = "facebook_id")
	private String facebook_id;

	@Column(name = "status")
	private int status;

	public User() {
		super();
	}

	public User(int id, String user_name, String user_email, Date email_verified_at, String password,
			String remember_token, Date created_at, String updated_at, String facebook_id, int status) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.email_verified_at = email_verified_at;
		this.password = password;
		this.remember_token = remember_token;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.facebook_id = facebook_id;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public Date getEmail_verified_at() {
		return email_verified_at;
	}

	public void setEmail_verified_at(Date email_verified_at) {
		this.email_verified_at = email_verified_at;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRemember_token() {
		return remember_token;
	}

	public void setRemember_token(String remember_token) {
		this.remember_token = remember_token;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getFacebook_id() {
		return facebook_id;
	}

	public void setFacebook_id(String facebook_id) {
		this.facebook_id = facebook_id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
