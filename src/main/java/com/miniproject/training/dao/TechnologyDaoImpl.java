package com.miniproject.training.dao;

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
		Session session=sessionFactory.getCurrentSession();
		session.save(technology);
		
	}

}
