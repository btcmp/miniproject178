package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Menu_Access;

public interface Menu_AccessDao {

	public List<Menu_Access> getAllMenu_Access();

	void save(Menu_Access menu_access);

	public Menu_Access getAllMenu_AccessById(long id);

	public void delete(long id);

}
