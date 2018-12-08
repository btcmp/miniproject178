package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Test;

public interface TestDao {

	public List<Test> getAllTests();

	public void save(Test test);

}
