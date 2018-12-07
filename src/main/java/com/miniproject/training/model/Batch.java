package com.miniproject.training.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 
 
public Date getPeriodFrom() {
	return periodFrom;
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
