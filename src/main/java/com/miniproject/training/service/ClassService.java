package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.BatchDao;
import com.miniproject.training.dao.ClassDao;
import com.miniproject.training.model.Batch;
import com.miniproject.training.model.Class;

@Service
@Transactional
public class ClassService {
	
	@Autowired
	ClassDao classDao;
	@Autowired
	BatchDao batchDao;
	public List<Class> getAllClass() {
		// TODO Auto-generated method stub
		return classDao.getAllClass();
	}
	public void save(Class classes) {
		// TODO Auto-generated method stub
		classDao.save(classes);
	}
	public List<Class> searchBatch(String search) {
		// TODO Auto-generated method stub
		return classDao.searchBatch(search);
	}
	public void delete(long id) {
		// TODO Auto-generated method stub
		classDao.delete(id);
	}

}
