package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Menu;

@Repository
public class MenuDaoImpl implements MenuDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		String hql="from Menu where active='1'";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<Menu> menus = query.list();
		if(!menus.isEmpty())
		{
			return menus;
		}
		return new ArrayList<Menu>();
	}

	public void save(Menu menu) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(menu);
	}

	public Menu getAllMenuById(long id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Menu mn where mn.id= :data";
		List<Menu> menu = session.createQuery(hql).setParameter("data", id).list();
		if(menu.isEmpty())
		{
			return null;
		}
		return menu.get(0);
	}

	public void deactivate(Menu menu) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.update(menu);
	}

	public void update(Menu menu) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(menu);
	}

}
