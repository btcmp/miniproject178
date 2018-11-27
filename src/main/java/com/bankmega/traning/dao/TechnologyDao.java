package com.bankmega.traning.dao;

import java.util.List;

import com.bankmega.traning.model.Technology;

public interface TechnologyDao {

	public List<Technology> getAllTechnology();

	public void save(Technology technology);

}
