package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.MenuDao;
import com.miniproject.training.model.Menu;

@Service
@Transactional
public class MenuService {

	@Autowired
	MenuDao menuDao;

	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		return menuDao.getAllMenu();
	}

	public void saving(Menu menu) {
		// TODO Auto-generated method stub
		menuDao.save(menu);
	}

	public Menu getAllMenuById(long id) {
		// TODO Auto-generated method stub
		Menu menu=menuDao.getAllMenuById(id);
		return menu;
	}

	public void deactivate(Menu menu) {
		// TODO Auto-generated method stub
		menuDao.deactivate(menu);
	}

	public void update(Menu menu) {
		// TODO Auto-generated method stub
		menuDao.update(menu);
	}
}
