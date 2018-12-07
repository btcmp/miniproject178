package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Monitoring;

@Repository
public class MonitoringDaoImpl implements MonitoringDao{

	@Autowired
	SessionFactory sessionFactory;

	public List<Monitoring> getAllMonitorings() {
		// TODO Auto-generated method stub
		String hql="from Monitoring m where m.isDelete='0'";
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery(hql);
		List<Monitoring> monitorings=query.list();
		if (!monitorings.isEmpty()) {
			return monitorings;
		}
		return new ArrayList();
	}

	public void save(Monitoring monitoring) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(monitoring);
	}

	public Monitoring getMonitoringById(Long id) {
		// TODO Auto-generated method stub
		String hql="from Monitoring m where m.id= :id";
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery(hql);
		query.setParameter("id", id);
		List<Monitoring> monitorings=query.list();
		if (!monitorings.isEmpty()) {
			return monitorings.get(0);
		}
		return new Monitoring();
	}
}
