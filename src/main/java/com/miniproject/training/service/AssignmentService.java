package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.AssignmentDao;
import com.miniproject.training.model.Assignment;

@Service
@Transactional
public class AssignmentService {

	@Autowired
	AssignmentDao assignmentDao;

	public List<Assignment> getAllAssignments() {
		// TODO Auto-generated method stub
		return assignmentDao.getAllAssignments();
	}

	public void save(Assignment assignment) {
		// TODO Auto-generated method stub
		assignmentDao.save(assignment);
	}

	public Assignment getAssignmentById(Long id) {
		// TODO Auto-generated method stub
		return assignmentDao.getAssignmentById(id);
	}
}
