package com.miniproject.training.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="t_technology_trainer")

public class TechnologyTrainer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false)
	private long id;
/*	@Column(nullable=false,name="technology_id")
	private long technologyId;
	@Column(nullable=false,name="trainer_id")
	private long trainerId;*/
	@Column(nullable=false,name="created_by")
	private long createdBy;
	@Column(nullable=false,name="created_on")
	private Date createdOn;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="technology_id",referencedColumnName="technology_id")
	private Technology technology;
	
	@ManyToOne
	@JoinColumn(name="trainer_id")
	private Trainer trainer;
	
	public Technology getTechnology() {
		return technology;
	}
	public void setTechnology(Technology technology) {
		this.technology = technology;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
/*	public long getTechnologyId() {
		return technologyId;
	}
	public void setTechnologyId(long technologyId) {
		this.technologyId = technologyId;
	}
	public long getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(long trainerId) {
		this.trainerId = trainerId;
	}*/
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
	
	

}
