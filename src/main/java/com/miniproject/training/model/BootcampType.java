package com.miniproject.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_Bootcamp_Type")
public class BootcampType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
}
