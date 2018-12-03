package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.TechnologyDao;
import com.miniproject.training.model.Technology;

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

	public Technology getAllTechnologyById(long id) {
		// TODO Auto-generated method stub
		Technology technology=technologyDao.getAllTechnologyById(id);
		return technology;
	}

	public List<Technology> searchTechnology(String search) {
		// TODO Auto-generated method stub
		return technologyDao.searchTechnology(search);
	}

	public void update(Technology technology) {
		// TODO Auto-generated method stub
		technologyDao.update(technology);
	}

}
