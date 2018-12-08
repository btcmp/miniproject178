package com.miniproject.training.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Technology;

@Repository
public class TechnologyDaoImpl implements TechnologyDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public List<Technology> getAllTechnology() {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		List<Technology> technology=session.createCriteria(Technology.class).list();
		return technology;
	}
	
	public void save(Technology technology) {
		// TODO Auto-generated method stub
		technology.setCreatedOn(new Date());
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(technology);
		
	}
	
	public void update(Technology technology) {
		// TODO Auto-generated method stub
		technology.setCreatedOn(new Date());
		Session session=sessionFactory.getCurrentSession();
		session.update(technology);
	}
	
	public Technology getAllTechnologyById(long id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql="from Technology tch where tch.id = :data";
		List<Technology> technology=session.createQuery(hql).setParameter("data", id).list();
		if(technology.isEmpty()) {
			return null;
		}
		return  technology.get(0);
	}
	
	public List<Technology> searchTechnology(String search) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql="from Technology tech where lower(tech.name) like :search";
		List<Technology> technology=session.createQuery(hql).setParameter("search", "%"+search.toLowerCase()+"%").list();
		return technology;
	}


}
