package com.miniproject.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="sequence", sequenceName = "versionSequence2", allocationSize=1)
public class GeneratedVersion {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequence")
	private Long id;
	
	public Long getId() {
		return id;
	}
	
}
