package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Office;

public interface OfficeDao {

	List<Office> getAllOffices();

	void save(Office office);

	Office getOfficeById(Long id);

	void update(Office office);

	List<Office> searchByName(String name);

}
