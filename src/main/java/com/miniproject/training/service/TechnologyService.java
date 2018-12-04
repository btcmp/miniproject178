package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.TechnologyDao;
import com.miniproject.training.dao.TechnologyTrainerDao;
import com.miniproject.training.model.Technology;
import com.miniproject.training.model.TechnologyTrainer;

@Service
@Transactional

public class TechnologyService {
	
	@Autowired
	TechnologyDao technologyDao;
	
	@Autowired
	TechnologyTrainerDao technologyTrainerDao;

	public List<Technology> getAllTechnology() {
		// TODO Auto-generated method stub
		return technologyDao.getAllTechnology();
	}

	public void save(Technology technology) {
		// TODO Auto-generated method stub
		Technology tech = new Technology();
		tech.setName(technology.getName());
		tech.setNote(technology.getNote());
		tech.setActive(technology.isActive());
		technologyDao.save(tech);
		if (!technology.getTechTran().isEmpty()) {
			for (TechnologyTrainer techTrain : technology.getTechTran()) {
				TechnologyTrainer techTrainer = new TechnologyTrainer();
				techTrainer.setTechnology(tech);
				techTrainer.setTrainer(techTrain.getTrainer());
				technologyTrainerDao.save(techTrainer);
			}
		}
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
