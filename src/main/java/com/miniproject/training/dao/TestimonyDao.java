package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Testimony;

public interface TestimonyDao {

	public List<Testimony> getAllTestimony();

	public void save(Testimony testimony);

	public Testimony getAllTestimonyById(long id);

	public void update(Testimony testimony);

	public void delete(long id);

	public List<Testimony> searchTestimony(String search);

}
