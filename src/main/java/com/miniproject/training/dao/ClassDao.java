package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Class;

public interface ClassDao {

	public List<Class> getAllClass();

	public void save(Class classes);

	public List<Class> searchBatch(String search);

	public void delete(long id);

}
