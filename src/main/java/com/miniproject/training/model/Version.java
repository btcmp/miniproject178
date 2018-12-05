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

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "T_VERSION")
public class Version {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "VERSION", nullable = false)
	private int version;
	@Column(name = "CREATED_BY", nullable = true)
	private Long createdBy;
	@Column(name = "CREATED_ON", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date createdOn;
	@Column(name = "MODIFIED_BY", nullable = true)
	private Long modifiedBy;
	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}
	@Column(name = "MODIFIED_ON", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date modifiedOn;
	@Column(name = "DELETED_BY", nullable = true)
	private Long deletedBy;
	@Temporal(TemporalType.DATE)
	@Column(name = "DELETED_ON", nullable = true)
	private Date deletedOn;
	@Column(name = "IS_DELETE", nullable = false)
	@JsonProperty
	private boolean isDelete = false;
	@JsonManagedReference
	@OneToMany(mappedBy = "version")
	private List<VersionDetail> versionDetail;
	
	//Getter and Setter
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
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
	public boolean getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}
	public List<VersionDetail> getVersionDetail() {
		return versionDetail;
	}
	public void setVersionDetail(List<VersionDetail> versionDetail) {
		this.versionDetail = versionDetail;
	}

}