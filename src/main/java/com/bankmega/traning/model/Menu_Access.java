package com.bankmega.traning.model;

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
@Table(name="t_menu_access")
public class Menu_Access {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="created_by",nullable= false)
	private Long createdBy;
	@Column(name="created_on",nullable= false)
	@Temporal(TemporalType.DATE)
	private Date createdOn;
	
	@ManyToOne
	@JoinColumn(name="menu_id",nullable=false)
	private Menu menuId;
	
	@ManyToOne
	@JoinColumn(name="role_id",nullable=false)
	private Role roleId;
	
	
	public Role getRoleId() {
		return roleId;
	}
	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}
	public Menu getMenuId() {
		return menuId;
	}
	public void setMenuId(Menu menuId) {
		this.menuId = menuId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
}
