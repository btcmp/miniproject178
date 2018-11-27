package com.bankmega.traning.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_FEEDBACK")
public class Feedback {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name = "TEST_ID", nullable = false)
	private int testId;
	@Column(name = "VERSION_ID", nullable = false)
	private int versionId;
	@Column(name = "JSON_FEEDBACK")
	private String jsonFeedback;
	@Column(name = "CREATED_BY", nullable = false)
	private String createdBy;
	@Column(name = "CREATED_ON", nullable = false)
	private Date createdOn;
	@Column(name = "DELETED_BY")
	private String deletedBy;
	@Column(name = "DELETED_ON")
	private Date deletedOn;
	@Column(name = "IS_DELETE", nullable = false)
	private Boolean isDelete;
	
	//Getter and Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public int getVersionId() {
		return versionId;
	}
	public void setVersionId(int versionId) {
		this.versionId = versionId;
	}
	public String getJsonFeedback() {
		return jsonFeedback;
	}
	public void setJsonFeedback(String jsonFeedback) {
		this.jsonFeedback = jsonFeedback;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getDeletedBy() {
		return deletedBy;
	}
	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}
	public Date getDeletedOn() {
		return deletedOn;
	}
	public void setDeletedOn(Date deletedOn) {
		this.deletedOn = deletedOn;
	}
	public Boolean getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

}
