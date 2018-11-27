package com.bankmega.traning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankmega.traning.dao.AssignmentDao;

@Service
@Transactional
public class AssignmentService {

	@Autowired
	AssignmentDao assignmentDao;
}
