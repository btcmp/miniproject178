package com.miniproject.training.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Version;
import com.miniproject.training.model.VersionDetail;

@Repository
public class VersionDetailDaoImpl implements VersionDetailDao {

	@Autowired
	SessionFactory sessionFactory;

	public void save(VersionDetail versionDetail) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(versionDetail);
	}
	
}