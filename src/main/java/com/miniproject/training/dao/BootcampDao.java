package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Bootcamp;

public interface BootcampDao {

	List<Bootcamp> getAllBootcamps();

	void save(Bootcamp bootcamp);

}
