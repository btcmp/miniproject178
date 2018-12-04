package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.TrainerDao;
import com.miniproject.training.model.Trainer;

@Service
@Transactional
public class TrainerService {

	@Autowired
	TrainerDao trainerDao;
	public List<Trainer> getAllTrainer() {
		// TODO Auto-generated method stub
		return trainerDao.getAllTrainer();
	}
	public void saving(Trainer trainer) {
		// TODO Auto-generated method stub
		trainerDao.save(trainer);
	}
	public Trainer getAllTrainerById(long id) {
		// TODO Auto-generated method stub
		Trainer trainer=trainerDao.getAllTrainerById(id);
		return trainer;
	}

}
