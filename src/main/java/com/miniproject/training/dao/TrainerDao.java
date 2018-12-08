package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Trainer;

public interface TrainerDao {

	public List<Trainer> getAllTrainer();

	public void save(Trainer trainer);

	public Trainer getAllTrainerById(long id);

	public void delete(long id);

}
