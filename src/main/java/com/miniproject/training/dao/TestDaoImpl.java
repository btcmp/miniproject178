package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Test;

@Repository
public class TestDaoImpl implements TestDao {

	@Autowired
	SessionFactory sessionFactory;

	public List<Test> getAllTests() {
		// TODO Auto-generated method stub
		String hql = "from Test";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<Test> tests = query.list();
		if (!tests.isEmpty()) {
			return tests;
		}
		return new ArrayList();
	}

	public void save(Test test) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(test);
	}
	
}