package com.miniproject.training.dao;
 
import java.util.List;

import com.miniproject.training.model.Technology;

public interface TechnologyDao {

	public List<Technology> getAllTechnology();

	public void save(Technology technology);

	public Technology getAllTechnologyById(long id);

	public List<Technology> searchTechnology(String search);

	public void update(Technology technology);

}
