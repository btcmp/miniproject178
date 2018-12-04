package com.miniproject.training.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="t_menu")
public class Menu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="code",nullable=false,length=50)
	private String code;
	@Column(name="title",nullable=false,length=50)
	private String title;
	@Column(name="description")
	private String description;
	@Column(name="image_url",nullable=false,length=100)
	private String imageUrl;
	@Column(name="menu_order",nullable=false)
	private int menuOrder;
	@Column(name="menu_parent")
	private Long menuParent;
	@Column(name="menu_url",nullable=false,length=100)
	private String menuUrl;
	@Column(name="created_by",nullable=false)
	private Long createdBy;
	@Column(name="created_on",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date createdOn;
	@Column(name="modified_by")
	private Long modifiedBy;
	@Column(name="modified_on")
	@Temporal(TemporalType.DATE)
	private Date modifiedOn;
	private boolean active;
	
	@OneToMany(mappedBy = "menu")
	private List<Menu_Access> menu_access;
	
	
	public List<Menu_Access> getMenu_access() {
		return menu_access;
	}
	public void setMenu_access(List<Menu_Access> menu_access) {
		this.menu_access = menu_access;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getMenuOrder() {
		return menuOrder;
	}
	public void setMenuOrder(int menuOrder) {
		this.menuOrder = menuOrder;
	}
	public Long getMenuParent() {
		return menuParent;
	}
	public void setMenuParent(Long menuParent) {
		this.menuParent = menuParent;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
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
