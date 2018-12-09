package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.IdleDao;
import com.miniproject.training.model.IdleNews;

@Service
@Transactional
public class IdleService {

	@Autowired
	IdleDao idleDao;
	
	public List<IdleNews> getAllIdlenews() {
		// TODO Auto-generated method stub
		return idleDao.getAllIdlenews();
	}

	public void save(IdleNews idlenews) {
		// TODO Auto-generated method stub
		idleDao.save(idlenews);
	}

	public IdleNews getIdleById(Long id) {
		// TODO Auto-generated method stub
		return idleDao.getIdleById(id);
	}

	public void update(IdleNews idlenews) {
		// TODO Auto-generated method stub
		idleDao.update(idlenews);
	}

	public List<IdleNews> searchByName(String title) {
		// TODO Auto-generated method stub
		return idleDao.searchByName(title);
	}

	public void publishIdle(Long id) {
		// TODO Auto-generated method stub
		idleDao.publishIdle(id);
	}

	public void deleteIdle(Long id) {
		// TODO Auto-generated method stub
		idleDao.deleteIdle(id);
	}

}
