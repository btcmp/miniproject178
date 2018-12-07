package com.miniproject.training.dao;
 
import java.util.List;

import com.miniproject.training.model.Technology;
import com.miniproject.training.model.TechnologyTrainer;

public interface TechnologyTrainerDao {

	public List<TechnologyTrainer> getAll();

	public void save(TechnologyTrainer technology);

	public List<TechnologyTrainer> getTechnologyTrainerByTechnology(Technology technology);
}
