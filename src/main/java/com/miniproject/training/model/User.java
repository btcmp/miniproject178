package com.miniproject.training.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="t_user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="username",nullable=false,length=50)
	private String username;
	@Column(name="password",nullable=false,length=50)
	private String password;
	@Column(name="mobile_flag",nullable=true)
	private boolean mobileFlag;
	@Column(name="mobile_token")
	private Long mobileToken;
	@Column(name="created_by",nullable=true)
	private Long createdBy;
	@Column(name="created_on",nullable=true)
	@Temporal(TemporalType.DATE)
	private Date createdOn;
	@Column(name="modified_by")
	private Long modifiedBy;
	@Column(name="modified_on")
	@Temporal(TemporalType.DATE)
	private Date modifiedOn;
	@Column(name="active",nullable=true)
	private boolean active;
	
	@Column(name="enabled")
	private int enabled;
	
	@ManyToOne
	@JoinColumn(name="role_id",nullable=true)
	private Role role;
	
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isMobileFlag() {
		return mobileFlag;
	}
	public void setMobileFlag(boolean mobileFlag) {
		this.mobileFlag = mobileFlag;
	}
	public Long getMobileToken() {
		return mobileToken;
	}
	public void setMobileToken(Long mobileToken) {
		this.mobileToken = mobileToken;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Long getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
}
