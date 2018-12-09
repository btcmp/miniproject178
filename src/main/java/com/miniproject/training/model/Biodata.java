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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_BIODATA")
public class Biodata {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; //1. Long, 11, PK, NotNull
	
	@Column(nullable=true)
	private String name; //2. Varchar, 255, NotNull
	private String gender; //3. Varchar, 255, AllowNull
	
	@Column(name="last_education", length=100, nullable=true)
	private String lastEducation; //4. Varchar, 100, NotNull
	
	@Column(name="graduation_year", length=5, nullable=true)
	private String graduationYear; //5. Varchar, 5, NotNull
	
	@Column(name="educational_level", length=5, nullable=true)
	private String educationalLevel; //6. Varchar, 5, NotNull
	
	@Column(length=100, nullable=true)
	private String majors; //7. Varchar, 100, NotNull
	
	@Column(length=5, nullable=true)
	private String gpa; //8. Varchar, 5, NotNull
	
	@ManyToOne
	@JoinColumn(name="bootcamp_test_type")
	private Bootcamp bootcampTestTypeId; //9. Long, 11, AllowNull
	
	@Column(length=4)
	private int iq; //10. Int, 4, AllowNull
	
	@Column(length=10)
	private String du; //11. Varchar, 10, AllowNull
	
	@Column(length=5)
	private int arithmetic; //12. Int, 5, AllowNull
	
	@Column(name="nested_logic", length=5)
	private int nestedLogic; //13. Int, 5, AllowNull
	
	@Column(name="join_table", length=5)
	private int joinTable; //14. Int, 5, AllowNull
	
	@Column(length=50)
	private String tro; //15. Varchar, 50, AllowNull
	
	@Column(length=100)
	private String notes; //16. Varchar, 100, AllowNull
	
	@Column(length=100)
	private String interviewer; //17. Varchar, 100, AllowNull
	
	@Column(name="created_by", nullable=true)
	private Long createdBy; //18. Long, 11, NotNull
	
	@Temporal(TemporalType.DATE)
	@Column(name="created_on", nullable=true)
	private Date createdOn; //19. dateTime, NotNull
	
	@Column(name="modified_by")
	private Long modifiedBy; //20. Long, 11, AllowNull
	
	@Temporal(TemporalType.DATE)
	@Column(name="modified_on")
	private Date modifiedOn; //21. dateTime, AllowNull
	
	@Column(nullable=true)
	private Boolean active= true; //22. boolean, NotNull, active=true notactive=false

	@OneToMany(mappedBy="testId")
	private List<Monitoring> monitorings;
	
	@OneToMany(mappedBy="testId")
	private List<Assignment> assignment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastEducation() {
		return lastEducation;
	}

	public void setLastEducation(String lastEducation) {
		this.lastEducation = lastEducation;
	}

	public String getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(String graduationYear) {
		this.graduationYear = graduationYear;
	}

	public String getEducationalLevel() {
		return educationalLevel;
	}

	public void setEducationalLevel(String educationalLevel) {
		this.educationalLevel = educationalLevel;
	}

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	public Bootcamp getBootcampTestTypeId() {
		return bootcampTestTypeId;
	}

	public void setBootcampTestTypeId(Bootcamp bootcampTestTypeId) {
		this.bootcampTestTypeId = bootcampTestTypeId;
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	public String getDu() {
		return du;
	}

	public void setDu(String du) {
		this.du = du;
	}

	public int getArithmetic() {
		return arithmetic;
	}

	public void setArithmetic(int arithmetic) {
		this.arithmetic = arithmetic;
	}

	public int getNestedLogic() {
		return nestedLogic;
	}

	public void setNestedLogic(int nestedLogic) {
		this.nestedLogic = nestedLogic;
	}

	public int getJoinTable() {
		return joinTable;
	}

	public void setJoinTable(int joinTable) {
		this.joinTable = joinTable;
	}

	public String getTro() {
		return tro;
	}

	public void setTro(String tro) {
		this.tro = tro;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getInterviewer() {
		return interviewer;
	}

	public void setInterviewer(String interviewer) {
		this.interviewer = interviewer;
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<Monitoring> getMonitorings() {
		return monitorings;
	}

	public void setMonitorings(List<Monitoring> monitorings) {
		this.monitorings = monitorings;
	}

	public List<Assignment> getAssignment() {
		return assignment;
	}

	public void setAssignment(List<Assignment> assignment) {
		this.assignment = assignment;
	}
}
