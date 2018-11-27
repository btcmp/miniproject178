package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Office;

@Repository
public class OfficeDaoImpl implements OfficeDao{

	@Autowired
	SessionFactory sessionFactory;
	
	
	public void save(Office office) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(office);
	}
	
	public List<Office> getAllOffices() {
		// TODO Auto-generated method stub
		String hql = "from Office";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<Office> offices = query.list();
		if (!offices.isEmpty()) {
			return offices;
		}		
		return new ArrayList();
	}

	

}
