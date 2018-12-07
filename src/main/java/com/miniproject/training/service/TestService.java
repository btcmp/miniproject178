package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.TestDao;
import com.miniproject.training.model.Test;

@Service
@Transactional
public class TestService {
	
	@Autowired
	TestDao testDao;

	public List<Test> getAllTests() {
		// TODO Auto-generated method stub
		return testDao.getAllTests();
	}

	public void saving(Test test) {
		// TODO Auto-generated method stub
		testDao.save(test);
	}

}