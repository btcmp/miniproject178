package com.miniproject.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.AssignmentDao;

@Service
@Transactional
public class AssignmentService {

	@Autowired
	AssignmentDao assignmentDao;
}
