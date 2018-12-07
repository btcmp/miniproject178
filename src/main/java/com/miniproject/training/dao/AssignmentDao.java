package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Assignment;

public interface AssignmentDao {

	List<Assignment> getAllAssignments();

	void save(Assignment assignment);

	Assignment getAssignmentById(Long id);

}
