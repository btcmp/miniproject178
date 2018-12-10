package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Menu_Access;

@Repository
public class Menu_AccessDaoImpl implements Menu_AccessDao{

	@Autowired
	SessionFactory sessionFactory;

	public List<Menu_Access> getAllMenu_Access() {
		// TODO Auto-generated method stub
		String hql = "from Menu_Access ma where ma.role.active='1'";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<Menu_Access> menu_access = query.list();
		if(!menu_access.isEmpty())
		{
			return menu_access;
		}
		return new ArrayList<Menu_Access>();
	}

	public void save(Menu_Access menu_access) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(menu_access);
	}

	public Menu_Access getAllMenu_AccessById(long id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Menu_Access mac where mac.id= :data";
		List<Menu_Access> menu_access = session.createQuery(hql).setParameter("data", id).list();
		if(menu_access.isEmpty())
		{
			return null;
		}
		return menu_access.get(0);
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		Menu_Access menu_access = new Menu_Access();
		menu_access.setId(id);
		Session session = sessionFactory.getCurrentSession();
		session.delete(session.get(Menu_Access.class, id));
	}

	public List<Menu_Access> searchByName(String name) {
		// TODO Auto-generated method stub
		String hql = "from Menu_Access ma where lower(ma.role.name) like lower('%"+name+"%')";
		Session session = sessionFactory.getCurrentSession();
		List<Menu_Access> menu_access = session.createQuery(hql).list();
		return menu_access;
	}
	
}
