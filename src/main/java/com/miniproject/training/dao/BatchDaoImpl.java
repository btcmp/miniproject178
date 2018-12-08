package com.miniproject.training.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Batch;

@Repository
public class BatchDaoImpl implements BatchDao {
	
	@Autowired
	SessionFactory sessionFactory;
	public List<Batch> getAllBatch() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		List<Batch> batch=session.createCriteria(Batch.class).list();
		return batch;
	}

}
