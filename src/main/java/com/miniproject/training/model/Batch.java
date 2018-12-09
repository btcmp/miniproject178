package com.miniproject.training.model;

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

@Entity
@Table(name="T_Batch")
public class Batch {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
 private long id;
 private String name;
 @Column(name="period_from")
 private Date periodFrom;
 @Column(name="period_to")
 private Date periodTo;
 private String note;
 @Column(name="created_by")
 private long createdBy;
 @Column(name="created_on")
 private Date createdOn;
 @Column(name="modified_by")
 private long modifiedBy;
 @Column(name="modified_on")
 private Date modifiedOn;
 @Column(name="deleted_by")
 private long deletedBy;
 @Column(name="deleted_on")
 private Date deletedOn;
 
 @OneToMany(mappedBy="batch")
 private List<Class> classBatch;
 
 @ManyToOne
 @JoinColumn(name="technology_id")
 private Technology technology;
 @ManyToOne
 @JoinColumn(name="trainer_id")
 private Trainer trainer;
 @ManyToOne
 @JoinColumn(name="room_id")
 private Room romm;
 
 
public List<Class> getClassBatch() {
	return classBatch;
}
public void setClassBatch(List<Class> classBatch) {
	this.classBatch = classBatch;
}
public Date getPeriodFrom() {
	return periodFrom;
}
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
public Room getRomm() {
	return romm;
}
public void setRomm(Room romm) {
	this.romm = romm;
}
public void setPeriodFrom(Date periodFrom) {
	this.periodFrom = periodFrom;
}
public Date getPeriodTo() {
	return periodTo;
}
public void setPeriodTo(Date periodTo) {
	this.periodTo = periodTo;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
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
public long getDeletedBy() {
	return deletedBy;
}
public void setDeletedBy(long deletedBy) {
	this.deletedBy = deletedBy;
}
public Date getDeletedOn() {
	return deletedOn;
}
public void setDeletedOn(Date deletedOn) {
	this.deletedOn = deletedOn;
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
 
}
