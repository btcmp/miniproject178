package com.bankmega.traning.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bankmega.traning.model.Biodata;

@Repository
public class BiodataDaoImpl implements BiodataDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Biodata> getAllBiodatas() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		List<Biodata> biodatas=session.createCriteria(Biodata.class).list();
		return biodatas;
	}

	public void save(Biodata biodata) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(biodata);
		
	}

}
