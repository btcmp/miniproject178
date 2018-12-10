package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Biodata;

@Repository
public class BiodataDaoImpl implements BiodataDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Biodata> getAllBiodatas() {
		// TODO Auto-generated method stub
		String hql="from Biodata b where b.active= '1'";
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery(hql);
		List<Biodata> biodatas=query.list();
		if (!biodatas.isEmpty()) {
			return biodatas;
		}
		return new ArrayList();
	}

	public void save(Biodata biodata) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(biodata);
	}

	public Biodata getBiodataById(Long id) {
		// TODO Auto-generated method stub
		String hql="from Biodata b where b.id= :id";
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery(hql);
		query.setParameter("id", id);
		List<Biodata> biodatas=query.list();
		if (!biodatas.isEmpty()) {
			return biodatas.get(0);
		}
		return new Biodata();
	}

	public List<Biodata> searchByName(String name) {
		// TODO Auto-generated method stub
		String hql="from Biodata b where b.active= '1' and lower(b.name) like lower('%"+name+"%')";
		Session session=sessionFactory.getCurrentSession();
		List<Biodata> biodatas=session.createQuery(hql).list();
		return biodatas;
	}

}
