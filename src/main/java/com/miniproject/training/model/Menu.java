package com.miniproject.training.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@Column(name="image_url",nullable=true,length=100)
	private String imageUrl;
	@Column(name="menu_order",nullable=true)
	private int menuOrder;
	@Column(name="menu_url",nullable=true,length=100)
	private String menuUrl;
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
	private boolean active;
	
	@OneToMany(mappedBy = "menu")
	private List<Menu_Access> menu_access;
	
	@ManyToOne
	@JoinColumn(name="menu_parent",nullable=true)
	private Menu menu;
	
	@OneToMany(mappedBy="menu")
	private List<Menu> menuMenu = new ArrayList<Menu>();
	
	
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public List<Menu> getMenuMenu() {
		return menuMenu;
	}
	public void setMenuMenu(List<Menu> menuMenu) {
		this.menuMenu = menuMenu;
	}
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
