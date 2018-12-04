package com.miniproject.training.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="T_trainer")
public class Trainer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="trainer_id",nullable=true)
	private long id;
	@Column(nullable=true)
	private String name;
	private String note;
	@Column(name="created_by",nullable=true)
	private long createdBy;
	@Column(name="created_on",nullable=true)
	private Date createdOn;
	@Column(name="modified_by")
	private long modifiedBy;
	@Column(name="modifeid_on")
	private Date modifiedOn;
	@Column(nullable=true)
	private boolean active;
	
	
	@OneToMany(mappedBy="trainer")
	private List<TechnologyTrainer> TechTran;


	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public List<TechnologyTrainer> getTechTran() {
		return TechTran;
	}
	public void setTechTran(List<TechnologyTrainer> techTran) {
		TechTran = techTran;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public long getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(long modifiedBy) {
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
