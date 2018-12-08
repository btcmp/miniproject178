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
@Table(name = "T_FEEDBACK")
public class Feedback {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "JSON_FEEDBACK", nullable = true)
	private String jsonFeedback;
	@Column(name = "CREATED_BY", nullable = true)
	private Long createdBy;
	@Column(name = "CREATED_ON", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date createdOn;
	@Column(name = "DELETED_BY", nullable = true)
	private Long deletedBy;
	@Column(name = "DELETED_ON", nullable = true)
	private Date deletedOn;
	@Column(name = "IS_DELETE", nullable = false)
	private boolean isDelete = false;
	@ManyToOne
	@JoinColumn(name = "test_id", nullable = true)
	private Test test;
	@ManyToOne
	@JoinColumn(name = "version_id", nullable = true)
	private Version version;
	
	//Getter and Setter
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getJsonFeedback() {
		return jsonFeedback;
	}
	public void setJsonFeedback(String jsonFeedback) {
		this.jsonFeedback = jsonFeedback;
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
	public Long getDeletedBy() {
		return deletedBy;
	}
	public void setDeletedBy(Long deletedBy) {
		this.deletedBy = deletedBy;
	}
	public Date getDeletedOn() {
		return deletedOn;
	}
	public void setDeletedOn(Date deletedOn) {
		this.deletedOn = deletedOn;
	}
	public boolean isDelete() {
		return isDelete;
	}
	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public Version getVersion() {
		return version;
	}
	public void setVersion(Version version) {
		this.version = version;
	}

}