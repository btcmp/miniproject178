package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Bootcamp;

@Repository
public class BootcampDaoImpl implements BootcampDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void save(Bootcamp bootcamp) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(bootcamp);
	}
	
	public List<Bootcamp> getAllBootcamps() {
		// TODO Auto-generated method stub
		String hql = "from Bootcamp";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<Bootcamp> bootcamps = query.list();
		if (!bootcamps.isEmpty()) {
			return bootcamps;
		}
		return new ArrayList();
	}

	

}
