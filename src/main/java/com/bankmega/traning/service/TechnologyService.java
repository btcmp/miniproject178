package com.bankmega.traning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankmega.traning.dao.TechnologyDao;
import com.bankmega.traning.model.Technology;

@Service
@Transactional

public class TechnologyService {
	
	@Autowired
	TechnologyDao technologyDao;

	public List<Technology> getAllTechnology() {
		// TODO Auto-generated method stub
		return technologyDao.getAllTechnology();
	}

	public void save(Technology technology) {
		// TODO Auto-generated method stub
		technologyDao.save(technology);
	}

}
