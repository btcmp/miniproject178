package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Category;

public interface CategoryDao {

	List<Category> getAllCategorys();

	void save(Category Category);

	Category getCategoryById(Long id);

	void update(Category Category);

	List<Category> searchByName(String name);

	void deactiveCategory(Long id);


}
