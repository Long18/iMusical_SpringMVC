package com.isekai.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "user_roles")
public class UserRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserRoleId userRoleId;

	@CreationTimestamp
	@Column(name = "created_at")
	private Date created_at;

	@Column(name = "end_at")
	private Date end_at;

	@Column(name = "status")
	private int status;

	public UserRole() {
		super();
	}

	public UserRole(UserRoleId userRoleId, Date created_at, Date end_at, int status) {
		super();
		this.userRoleId = userRoleId;
		this.created_at = created_at;
		this.end_at = end_at;
		this.status = status;
	}

	public UserRoleId getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(UserRoleId userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getEnd_at() {
		return end_at;
	}

	public void setEnd_at(Date end_at) {
		this.end_at = end_at;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
}
