package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Bootcamp;
import com.miniproject.training.model.Office;

@Repository
public class BootcampDaoImpl implements BootcampDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void save(Bootcamp bootcamp) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(bootcamp);
	}
	
	public List<Bootcamp> getAllBootcamps() {
		// TODO Auto-generated method stub
		String hql = "from Bootcamp b where b.active = '1' ";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<Bootcamp> bootcamps = query.list();
		if (!bootcamps.isEmpty()) {
			return bootcamps;
		}
		return new ArrayList();
	}

	public void update(Bootcamp bootcamp) {
		// TODO Auto-generated method stub
		String hql = "update Bootcamp b set b.name = :name, b.notes = :notes where b.id = :id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("name", bootcamp.getName());
		query.setParameter("notes", bootcamp.getNotes());
		query.setParameter("id", bootcamp.getId());
		query.executeUpdate();
	}

	public Bootcamp getBootcampById(Long id) {
		// TODO Auto-generated method stub
		String hql = "from Bootcamp b where b.id = :id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		List<Bootcamp> bootcamps = query.list();
		if (!bootcamps.isEmpty()) {
			return bootcamps.get(0);
		}
		return new Bootcamp();
	}

	public List<Bootcamp> searchByName(String name) {
		// TODO Auto-generated method stub
		String hql = "from Bootcamp b where lower(b.name) like lower('%"+name+"%')";
		Session session = sessionFactory.getCurrentSession();
		List<Bootcamp> bootcamps = session.createQuery(hql).list();
		return bootcamps;
	}

	public void deactiveBootcamp(Long id) {
		// TODO Auto-generated method stub
		String hql ="update Bootcamp b set b.active = '0' where b.id = :id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		query.executeUpdate();
	}


}
