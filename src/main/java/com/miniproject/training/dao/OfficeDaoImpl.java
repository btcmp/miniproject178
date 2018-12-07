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
		session.saveOrUpdate(office);
	}
	
	public List<Office> getAllOffices() {
		// TODO Auto-generated method stub
		String hql = "from Office o where o.active ='1'";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<Office> offices = query.list();
		if (!offices.isEmpty()) {
			return offices;
		}		
		return new ArrayList();
	}

	public Office getOfficeById(Long id) {
		// TODO Auto-generated method stub
		String hql = "from Office o where o.id = :id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		List<Office> offices = query.list();
		if (!offices.isEmpty()) {
			return offices.get(0);
		}
		return new Office();
	}

	public void update(Office office) {
		// TODO Auto-generated method stub
		String hql = "update Office o set o.name = :name, o.phone = :phone, o.email = :email, o.address = :address, o.notes = :description where o.id = :id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("name", office.getName());
		query.setParameter("phone", office.getPhone());
		query.setParameter("email", office.getEmail());
		query.setParameter("address", office.getAddress());
		query.setParameter("description", office.getNotes());
		query.setParameter("id", office.getId());
		query.executeUpdate();
	}

	public List<Office> searchByName(String name) {
		// TODO Auto-generated method stub
		String hql = "from Office o where lower(o.name) like lower('%"+name+"%')";
		Session session = sessionFactory.getCurrentSession();
		List<Office> offices = session.createQuery(hql).list();
		return offices;
	}


	public void disbleOffice(Long id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String hql = "update Office o set o.active = '0' where o.id = :id";
				Session session = sessionFactory.getCurrentSession();
				Query query = session.createQuery(hql);
				query.setParameter("id", id);
				query.executeUpdate();
	}
}
