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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="T_technology")
public class Technology {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="technology_id",nullable=false,length=11)
	private long id;
	@Column(nullable=true)
	private String name;
	private String note;
	@Column(name="created_by")
	private Long createdby;
	@Column(name="created_on",nullable=true)
	@Temporal(TemporalType.DATE)
	private Date createdOn;
	@Column(name="modified_By",length=11)
	@Temporal(TemporalType.DATE)
	private Date modifiedBy;
	@Column(name="modified_on")
	private String modifiedOn;
	@Column(nullable=true)
	private boolean active;
	
	@OneToMany(mappedBy="technology")
	private List<Batch> batchTech;
	
	@JsonManagedReference
	@OneToMany(mappedBy="technology")
	
	
	private List<TechnologyTrainer> TechTran;
	
	
	public Long getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

	public List<Batch> getBatchTech() {
		return batchTech;
	}

	public void setBatchTech(List<Batch> batchTech) {
		this.batchTech = batchTech;
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

	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Date modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	

}
