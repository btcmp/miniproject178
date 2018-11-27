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
@Table(name="MONITORING")
public class Monitoring {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; //1. Long, 11,PK, No
	
	@ManyToOne
	@JoinColumn(name="biodata_id", nullable=false)
	private Biodata testId; //2. Long, 11, No
	
	@Temporal(TemporalType.DATE)
	@Column(name="idle_date", nullable=false)
	private Date idleDate; //3. dateTime, No
	
	@Column(name="last_project", length=50)
	private String lastProject; //4. Varchar, 50, Allow
	
	@Column(name="idle_reason")
	private String idleReason; //5. Varchar, 255, Allow
	
	@Temporal(TemporalType.DATE)
	@Column(name="placement_date", nullable=false)
	private Date placementDate; //6. dateTime, No
	
	@Column(name="placement_at", length=50)
	private String placementAt; //7. Varchar, 50, Allow
	
	private String notes; //8. VarChar, 255, Allow
	
	@Column(name="created_by", nullable=false)
	private Long createdBy; //9. Long, 11, No
	
	@Temporal(TemporalType.DATE)
	@Column(name="created_on", nullable=false)
	private Date createdOn; //10. dateTime, No
	
	@Column(name="modified_by")
	private Long modifiedBy; //11. Long, 11,Allow
	
	@Temporal(TemporalType.DATE)
	@Column(name="modiefied_on")
	private Date modifiedOn; //12. dateTime, Allow
	
	@Column(name="delete_by")
	private Long deleteBy; //13. Long, 11, Allow
	
	@Temporal(TemporalType.DATE)
	@Column(name="delete_on")
	private Date deleteOn; //14. dateTime, Allow
	
	@Column(name="is_delete", nullable=false)
	private Boolean isDelete; //15. boolean, No

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Biodata getTestId() {
		return testId;
	}

	public void setTestId(Biodata testId) {
		this.testId = testId;
	}

	public Date getIdleDate() {
		return idleDate;
	}

	public void setIdleDate(Date idleDate) {
		this.idleDate = idleDate;
	}

	public String getLastProject() {
		return lastProject;
	}

	public void setLastProject(String lastProject) {
		this.lastProject = lastProject;
	}

	public String getIdleReason() {
		return idleReason;
	}

	public void setIdleReason(String idleReason) {
		this.idleReason = idleReason;
	}

	public Date getPlacementDate() {
		return placementDate;
	}

	public void setPlacementDate(Date placementDate) {
		this.placementDate = placementDate;
	}

	public String getPlacementAt() {
		return placementAt;
	}

	public void setPlacementAt(String placementAt) {
		this.placementAt = placementAt;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

	public Long getDeleteBy() {
		return deleteBy;
	}

	public void setDeleteBy(Long deleteBy) {
		this.deleteBy = deleteBy;
	}

	public Date getDeleteOn() {
		return deleteOn;
	}

	public void setDeleteOn(Date deleteOn) {
		this.deleteOn = deleteOn;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

}
