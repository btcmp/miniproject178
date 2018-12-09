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
	public void save(Batch batch) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(batch);
	}
	public Batch getBatchById(long id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql="from Batch bc where bc.id= :data";
		List<Batch> batch=session.createQuery(hql).setParameter("data", id).list();
		if (batch.isEmpty()) {
			return null;
		}
		return batch.get(0);
	}
	public List<Batch> searchBatch(String search) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql="from Batch bch where lower(bch.technology.name) like :search or lower(bch.name) like :search";
		List<Batch> batch=session.createQuery(hql).setParameter("search", "%"+search.toLowerCase()+"%").list();
		return batch;
	}

}
