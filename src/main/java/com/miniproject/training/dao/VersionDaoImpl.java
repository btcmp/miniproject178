package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Version;

@Repository
public class VersionDaoImpl implements VersionDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public List<Version> getAllVersions() {
		// TODO Auto-generated method stub
		String hql = "from Version where isDelete = '0'";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<Version> versions = query.list();
		if (!versions.isEmpty()) {
			return versions;
		}
		return new ArrayList();
	}

	public void save(Version version) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(version);
	}

	public Version getVersionById(Long id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Version v where v.id = :data";
		List<Version> versions = session.createQuery(hql).setParameter("data", id).list();
		if (versions.isEmpty()) {
			return null;
		}
		return versions.get(0);
	}

}
