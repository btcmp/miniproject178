package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Batch;

public interface BatchDao {

	public List<Batch> getAllBatch();

	public void save(Batch batch);

	public Batch getBatchById(long id);

	public List<Batch> searchBatch(String search);

}
