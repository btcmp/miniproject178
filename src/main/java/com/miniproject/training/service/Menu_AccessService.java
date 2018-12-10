package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.Menu_AccessDao;
import com.miniproject.training.model.Menu_Access;

@Service
@Transactional
public class Menu_AccessService {

	@Autowired
	Menu_AccessDao menu_AccessDao;

	public List<Menu_Access> getAllMenu_Access() {
		// TODO Auto-generated method stub
		return menu_AccessDao.getAllMenu_Access();
	}

	public void saving(Menu_Access menu_access) {
		// TODO Auto-generated method stub
		menu_AccessDao.save(menu_access);
	}

	public Menu_Access getAllMenu_AccessById(long id) {
		// TODO Auto-generated method stub
		Menu_Access menu_access = menu_AccessDao.getAllMenu_AccessById(id);
		return menu_access;
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		menu_AccessDao.delete(id);
	}

	public List<Menu_Access> searchByName(String name) {
		// TODO Auto-generated method stub
		return menu_AccessDao.searchByName(name);
	}
	
}
