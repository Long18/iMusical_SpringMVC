package com.isekai.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "users_roles")
public class UserRole {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "user_id")
		private int id;

		@Column(name = "role_id")
		private int role_id;
		
		@Column(name = "created_at")
		private Date created_at;
		
		@Column(name = "end_at")
		private Date end_at;
		
		@Column(name = "status")
		private int status;

		public UserRole() {
			super();
		}

		public UserRole(int id, int role_id, Date created_at, Date end_at, int status) {
			super();
			this.id = id;
			this.role_id = role_id;
			this.created_at = created_at;
			this.end_at = end_at;
			this.status = status;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getRole_id() {
			return role_id;
		}

		public void setRole_id(int role_id) {
			this.role_id = role_id;
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
