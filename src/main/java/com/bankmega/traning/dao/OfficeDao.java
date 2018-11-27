package com.bankmega.traning.dao;

import java.util.List;

import com.bankmega.traning.model.Office;

public interface OfficeDao {

	List<Office> getAllOffices();

	void save(Office office);

}
