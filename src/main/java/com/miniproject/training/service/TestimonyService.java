package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.TestimonyDao;
import com.miniproject.training.model.Testimony;

@Service
@Transactional
public class TestimonyService {
	@Autowired
	TestimonyDao testimonyDao;
	public List<Testimony> getAllTestimony() {
		// TODO Auto-generated method stub
		return testimonyDao.getAllTestimony();
	}
	public void save(Testimony testimony) {
		// TODO Auto-generated method stub
		testimonyDao.save(testimony);
	}
	public Testimony getAllTestimonyById(long id) {
		// TODO Auto-generated method stub
		return testimonyDao.getAllTestimonyById(id);
	}
	public void update(Testimony testimony) {
		// TODO Auto-generated method stub
		testimonyDao.update(testimony);
	}
	public void delete(long id) {
		// TODO Auto-generated method stub
		testimonyDao.delete(id);
	}
	public List<Testimony> searchTestimony(String search) {
		// TODO Auto-generated method stub
		return testimonyDao.searchTestimony(search);
	}

}
