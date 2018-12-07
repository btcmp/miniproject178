package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Menu;

public interface MenuDao {

	public List<Menu> getAllMenu();

	public void save(Menu menu);

	public Menu getAllMenuById(long id);

	public void deactivate(Menu menu);

	public void update(Menu menu);

}
