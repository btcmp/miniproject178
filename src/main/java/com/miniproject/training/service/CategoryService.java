package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.CategoryDao;
import com.miniproject.training.model.Category;

@Service
@Transactional
public class CategoryService {

	@Autowired
	CategoryDao categoryDao;
	
	public List<Category> getAllCategorys() {
		// TODO Auto-generated method stub
		return categoryDao.getAllCategorys();
	}
	
	public void saveCategory(Category Category) {
		categoryDao.save(Category);
	}

	public Category getCategoryById(Long id) {
		// TODO Auto-generated method stub
		return categoryDao.getCategoryById(id);
	}

	public void update(Category Category) {
		// TODO Auto-generated method stub
		categoryDao.update(Category);
	}

	public List<Category> searchByName(String name) {
		// TODO Auto-generated method stub
		return categoryDao.searchByName(name);
	}

	public void deactiveCategory(Long id) {
		// TODO Auto-generated method stub
		categoryDao.deactiveCategory(id);
	}
}
