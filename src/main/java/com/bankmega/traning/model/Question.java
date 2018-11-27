package com.bankmega.traning.model;

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
@Table(name = "T_QUESTION")
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "QUESTION", nullable = false)
	private String question;
	@Column(name = "CREATED_BY", nullable = true, length=11)
	private Long createdBy;
	@Column(name = "CREATED_ON", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date createdOn;
	@Column(name = "MODIFIED_BY", nullable = true)
	private Long modifiedBy;
	@Column(name = "MODIFIED_ON", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date modifiedOn;
	@Column(name = "DELETED_BY", nullable = true)
	private Long deletedBy;
	@Column(name = "DELETED_ON", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date deletedOn;
	@Column(name = "IS_DELETE", nullable = true)
	private Boolean isDelete;
	@OneToMany(mappedBy = "question")
	private List<VersionDetail> versionDetail;
	
	//Getter and Setter
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
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
	public Boolean getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
	public List<VersionDetail> getVersionDetail() {
		return versionDetail;
	}
	public void setVersionDetail(List<VersionDetail> versionDetail) {
		this.versionDetail = versionDetail;
	}
	
}