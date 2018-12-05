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
@Table(name="ASSIGNMENT")
public class Assignment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; //1. Long, 11, PK, No
	
	@ManyToOne
	@JoinColumn(name="biodata_id", nullable=true)
	private Biodata testId; //2. Long, 11, No
	
	@Column(nullable=false)
	private String title; //3. VarChar, 255, No
	
	@Temporal(TemporalType.DATE)
	@Column(name="start_date", nullable=true)
	private Date startDate; //4. dateTime, No
	
	@Temporal(TemporalType.DATE)
	@Column(name="end_date", nullable=true)
	private Date endDate; //5. dateTime, No
	
	private String description;//6. Varchar, 255, Allow
	
	@Temporal(TemporalType.DATE)
	@Column(name="realization_date")
	private Date realizationDate; //7. dateTime, Allow
	
	private String notes; //8. Varchar, 255, Allow
	
	@Column(name="is_hold")
	private Boolean isHold; //9. Boolean, Allow
	
	@Column(name="is_done")
	private Boolean isDone; //10. Boolean, Allow
	
	@Column(name="created_by", nullable=true)
	private Long createdBy; //11. Long, 11, No
	
	@Temporal(TemporalType.DATE)
	@Column(name="created_on", nullable=true)
	private Date createdOn; //12. dateTime, No
	
	@Column(name="modified_by")
	private Long modifiedBy; //13. Long, 11, Allow
	
	@Temporal(TemporalType.DATE)
	@Column(name="modified_on")
	private Date modifiedOn; //14. dateTime, Allow
	
	@Column(name="deleted_by")
	private Long deletedBy; //15. Long, 11, Allow
	
	@Temporal(TemporalType.DATE)
	@Column(name="deleted_on")
	private Date deletedOn; //16. dateTime, Allow
	
	@Column(name="is_delete", nullable=true)
	private Boolean isDelete; //17. Boolean, No

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getRealizationDate() {
		return realizationDate;
	}

	public void setRealizationDate(Date realizationDate) {
		this.realizationDate = realizationDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Boolean getIsHold() {
		return isHold;
	}

	public void setIsHold(Boolean isHold) {
		this.isHold = isHold;
	}

	public Boolean getIsDone() {
		return isDone;
	}

	public void setIsDone(Boolean isDone) {
		this.isDone = isDone;
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
}
